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
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookView1 implements ActionListener, WindowListener {
    private JFrame fr;
    private JLabel namelbl, pricelbl, typelbl;
    private JTextField textname   , textprice, textpage;
    private JButton left, right, add, update, del;
    private JComboBox typecb;
    private JPanel infopn, pagepn, btnpn;
    private String bookType[] = {"General", "Computer", "Math&Sci", "Photo"};
    private ArrayList<Book> book;
    
    public BookView1() {
        book = new ArrayList<Book>();
        book.add(null);
        fr = new JFrame(); 
        namelbl = new JLabel("   Name");
        pricelbl = new JLabel("   Price");
        typelbl = new JLabel("   Type");
        
        textname = new JTextField();
        textprice = new JTextField();
        textpage = new JTextField("0", 4);
        
        textpage.setEditable(false);
        textpage.setHorizontalAlignment(JTextField.CENTER);
        typecb = new JComboBox(bookType);
        
        left = new JButton("<<<"); 
        right = new JButton(">>>"); 
        add = new JButton("Add"); 
        update = new JButton("Update"); 
        del = new JButton("Delete"); 
        
        infopn = new JPanel(new GridLayout(3, 2));
        infopn.add(namelbl); infopn.add(textname);
        infopn.add(pricelbl); infopn.add( textprice);
        infopn.add(typelbl); infopn.add(typecb);
        
        pagepn = new JPanel(new FlowLayout());
        pagepn.add(left); pagepn.add(textpage); pagepn.add(right);
        
        btnpn = new JPanel(new FlowLayout());
        btnpn.add(add); btnpn.add(update); btnpn.add(del);
        fr.add(infopn, BorderLayout.NORTH);
        fr.add(pagepn, BorderLayout.CENTER);
        fr.add(btnpn, BorderLayout.SOUTH);
        
        left.addActionListener(this);
        fr.addWindowListener(this);
        right.addActionListener(this);
        add.addActionListener(this);
        update.addActionListener(this);
        del.addActionListener(this);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int currentIndex = Integer.parseInt(textpage.getText());
        if (e.getSource().equals(add)) {
            new BookAdd1(book);
        
        } else if (e.getSource().equals(update)) {
            if (!book.isEmpty()) {
                System.out.println(book.get(currentIndex).getName() + " Updated.");                
                book.set(currentIndex, new Book(textname.getText(),
       Double.parseDouble( textprice.getText()), typecb.getSelectedItem().toString()));
            }            
            JOptionPane.showMessageDialog(null, "Done it.",
       "Update Command", JOptionPane.PLAIN_MESSAGE, null);
            
        } else if (e.getSource().equals(del)) {
            if (!book.isEmpty()) {
                System.out.println(book.get(currentIndex).getName() + " Deleted.");
                book.remove(currentIndex);
                if (book.size() > currentIndex) {
                    updateBook(currentIndex);
                } else if (book.size() == currentIndex) {
                    updateBook(currentIndex-1);
                }
            JOptionPane.showMessageDialog(null, "Done it.",
       "Delete Command", JOptionPane.PLAIN_MESSAGE, null);
            }
            
        } else if (e.getSource().equals(right)) {
            if (book.isEmpty() || book.size() == currentIndex+1) {
                return;
            }
            updateBook(currentIndex+1);
        } else if (e.getSource().equals(left)) {
            updateBook(currentIndex-1);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("Book.data");
        try (FileInputStream fis = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fis);) {
            book = (ArrayList<Book>) obj.readObject();
            updateBook();
            System.out.println("Readed.");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("Book.data");
             ObjectOutputStream obj = new ObjectOutputStream(fout);) {
            obj.writeObject(book);
            System.out.println("Writed.");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    public void updateBook() {
        if (!book.isEmpty()) {
            System.out.println("Have "+ String.valueOf(book.size()-1) + " book.");
            updateBook(1);
        } else {
            System.out.println("Book empty.");
            updateBook(0);
        }
    }
    
    public void updateBook(int index) {
        if (index == 0) {
            index++;
        }
        
        Book currentBook = book.get(index);
        textname.setText(currentBook.getName());
        textprice.setText(String.valueOf(currentBook.getPrice()));
        textpage.setText(String.valueOf(index));
        typecb.setSelectedItem(currentBook.getType());
    }
    
    public static void main(String[] args) {
        new BookView1();
    }
}

