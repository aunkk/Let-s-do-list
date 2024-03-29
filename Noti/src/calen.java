
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yarnisar
 */
public class calen implements ActionListener{
    private JFrame frame;
    private JButton b1; private JButton b2;
    private JButton b3; //private JButton b4;
    public Num total[];
    
    public calen(){
        frame = new JFrame();
        b1 = new JButton("01");
        b2 = new JButton("02");
        b3 = new JButton("03");
        //b4 = new JButton("01");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        

        
        frame.setLayout(new FlowLayout( ));
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new calen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1)){
            new Noti();
        }else{
            new Noti();
        }
    }
}
