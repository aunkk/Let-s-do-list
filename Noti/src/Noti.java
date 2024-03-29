 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.time.LocalDate;
import javax.swing.event.*;
import javax.swing.*;

/**
 *
 * @author Yarnisar
 */
public class Noti implements ActionListener{
    private JFrame frame;
    private JPanel pnmain, pnbutton;
    private JTextArea ta;
    private JTextField tf;
    private JButton bnsave;
    public HashMap data;
    //private  Color badgeColor = new Color(208, 66, 66);// setter getter
    
    public Noti(){
        frame = new JFrame("what you want");
        pnmain = new JPanel(); pnbutton = new JPanel();
        bnsave = new JButton("Save");
        ta = new JTextArea(); tf = new JTextField();
        data = new HashMap();
        
        LocalDate date1 = LocalDate.of(2024, 4, 29);
        LocalDate date2 = LocalDate.now();
        //boolean equal = date1.equals(date2);
        if(date1.equals(date2)){
            JOptionPane.showMessageDialog(null, "time to do thissss", "", JOptionPane.PLAIN_MESSAGE);
        }else{
            System.out.println("No");
        }
        
        
        pnmain.setLayout(new BorderLayout());
        pnmain.add(tf, BorderLayout.NORTH);
        pnmain.add(ta, BorderLayout.CENTER);
        
        pnbutton.setLayout(new FlowLayout());
        pnbutton.add(bnsave);
        
        bnsave.addActionListener(this);
        
        frame.setLayout(new BorderLayout());
        frame.add(pnmain, BorderLayout.CENTER);
        frame.add(pnbutton, BorderLayout.SOUTH);
        
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Noti();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource().equals(bnsave)){
           if(tf == null && ta == null){
               System.out.println("nothing");
           }else{
               new SetNoti();
           }
       //else{
           //new SetNoti();
           //try(FileWriter f = new FileWriter())
       }
    }
    
}
