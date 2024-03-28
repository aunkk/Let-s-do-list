
package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testFrame extends JFrame{
    JPanel jPanel, panel;
    JButton jButton;
    
    public testFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel = new JPanel();
        jButton = new JButton("new");

        jPanel.setBackground(Color.decode("#e6bbea"));
        jPanel.setLayout(new BorderLayout());
        
        this.add(jPanel);
        jPanel.add(jButton, BorderLayout.SOUTH);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(10, 1, 0, 5));
        panel.setBackground(null);
        jPanel.add(panel, BorderLayout.CENTER);
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskReal newTask = new TaskReal();
                panel.add(newTask);
                jPanel.revalidate();
                jPanel.repaint();
            }
            
        });
        
        setSize(500, 500);
        setVisible(true);
    }
}
