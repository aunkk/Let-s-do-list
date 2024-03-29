/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab14.pretest;

/**
 *
 * @author Yarnisar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BookAdd1 implements ActionListener {
    private JFrame fr;
    private JLabel namelbl, pricelbl, typelbl;
    private JTextField nametf, pricetf;
    private JComboBox typecb;
    private JButton insert;
    private String bookType[] = {"General", "Computer", "Math&Sci", "Photo"};
    private JPanel infopn, btnpn;
    private ArrayList<Book> book;
    
    public BookAdd1(ArrayList<Book> book) {
        this.book = book;
        fr = new JFrame();
        namelbl = new JLabel("   Name");
        pricelbl = new JLabel("   Price");
        typelbl = new JLabel("   Type");
        nametf = new JTextField();
        pricetf = new JTextField();
        typecb = new JComboBox(bookType);
        insert = new JButton("Insert"); insert.addActionListener(this);
        
        infopn = new JPanel(new GridLayout(3, 2));
        infopn.add(namelbl); infopn.add(nametf);
        infopn.add(pricelbl); infopn.add(pricetf);
        infopn.add(typelbl); infopn.add(typecb);
        
        btnpn = new JPanel(new FlowLayout());
        btnpn.add(insert);
        
        fr.add(infopn, BorderLayout.CENTER);
        
        fr.add(btnpn, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(insert)) {
            book.add(new Book(nametf.getText(),
                    Double.parseDouble(pricetf.getText()),
                    typecb.getSelectedItem().toString()));
            
            JOptionPane.showMessageDialog(null, "Done it.",
       "", JOptionPane.PLAIN_MESSAGE, null);
            fr.dispose();
        }
    }
}

