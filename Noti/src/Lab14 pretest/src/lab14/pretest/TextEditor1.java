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
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class TextEditor1 implements ActionListener {
    private JFrame frame;
    private JMenuBar menu_bar;
    private JMenu file;
    private JMenuItem new_item, open_item, save_item, close_item;
    private JTextArea txt_area;
    
    public TextEditor1() {
        frame = new JFrame("My Text Editor");
        menu_bar = new JMenuBar();
        file = new JMenu("File");
        new_item = new JMenuItem("New"); 
        open_item = new JMenuItem("Open"); 
        save_item = new JMenuItem("Save"); 
        close_item = new JMenuItem("Close"); 
        txt_area = new JTextArea();
        
        frame.setJMenuBar(menu_bar);
        menu_bar.add(file);
        file.add(new_item);
        file.add(open_item);
        file.add(save_item);
        file.addSeparator();
        file.add(close_item);
        frame.add(txt_area);
        
        new_item.addActionListener(this);
        open_item.addActionListener(this);
        save_item.addActionListener(this);
        close_item.addActionListener(this);
        
        
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(new_item)) {
            txt_area.setText("");
        } else if (e.getSource().equals(open_item)) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(frame);
            File f = fc.getSelectedFile();
//            try (BufferedReader reader = new BufferedReader(new FileReader(f));) {
            try (FileReader reader = new FileReader(f)) {
//                txt_area.read(reader, null);
                txt_area.read(reader, "");
            } catch (IOException ex) {
                System.out.println("Read Failed.");
            }
        } else if (e.getSource().equals(save_item)) {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(frame);
            File f = fc.getSelectedFile();
//            try (FileOutputStream fout = new FileOutputStream(f)) {
            try (FileWriter writer = new FileWriter(f)) {
//                fout.write(txt_area.getText().getBytes());
                writer.write(txt_area.getText());
            } catch (IOException ex) {
                System.out.println("Save Failed.");
            }
        } else if (e.getSource().equals(close_item)) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new TextEditor1();
    }
}


