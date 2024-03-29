/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab14.pretest;

/**
 *
 * @author Yarnisar
 */
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.*;
    public class BookView {
        private JFrame fr;
        private JPanel pn1, pn2, pn3, pn4, pn5;
        private JButton left, right, add, update, del;
        private JLabel name, price, type;
        private JTextField textname, textprice, textcenter;
        private JComboBox cb;

    public BookView(){
        fr = new JFrame("");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        
        name = new JLabel("Name");
        price = new JLabel("Price");
        type = new JLabel("Type");
        
        textname = new JTextField();
        textprice = new JTextField();
        textcenter = new JTextField("0",4);
        
        cb = new JComboBox();
        
        cb.setSelectedItem("General");
        cb.addItem("General");
        cb.addItem("Computer");
        cb.addItem("Math&Sci");
        cb.addItem("Photo");
        
        left = new JButton("<<<");
        right = new JButton(">>>");
        add = new JButton("Add");
        update = new JButton("Update");
        del = new JButton("Delete");
        
        fr.setLayout(new GridLayout(5,1));
        pn1.setLayout(new GridLayout(1,2));
        pn1.add(name);
        pn1.add(textname);
        fr.add(pn1);
        
        pn2.setLayout(new GridLayout(1,2));
        pn2.add(price);
        pn2.add(textprice);
        fr.add(pn2);
        
        pn3.setLayout(new GridLayout(1,2));
        pn3.add(type);
        pn3.add(cb);
        fr.add(pn3);
        
        pn4.add(left);
        pn4.add(textcenter);
        pn4.add(right);
        fr.add(pn4);
        
        pn5.add(add);
        pn5.add(update);
        pn5.add(del);
        fr.add(pn5);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(230,250);
        fr.setVisible(true);

        
    }
        public static void main(String[] args) {
            new BookView();
        }
}
