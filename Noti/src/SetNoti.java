
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yarnisar
 */
public class SetNoti {
    private JFrame fr;
    private ButtonGroup rg;
    private JRadioButton r1, r2, r3;
    private JPanel p1, p2;
    private JLabel lb;
    
    public SetNoti(){
        fr = new JFrame();
        p1 = new JPanel(); p2 = new JPanel();
        lb = new JLabel("How many days in advance should i be notified");
        r1 = new JRadioButton("that day");
        r2 = new JRadioButton("one day");
        r3 = new JRadioButton(" one week");
        rg = new ButtonGroup();
        rg.add(r1); rg.add(r2); rg.add(r3);
        
        p1.setLayout(new FlowLayout());
        p1.add(lb);
        
        p2.setLayout(new GridLayout(3,1));
        p2.add(r1);
        p2.add(r2);
        p2.add(r3);

                
        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        
        fr.pack();
        fr.setVisible(true);

    }
    public static void main(String[] args) {
        new SetNoti();
    }
}
