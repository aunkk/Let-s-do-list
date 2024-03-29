/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Yarnisar
 */
public class TextEditor implements ActionListener{
        private JFrame fr;
        private JMenuBar mb;
        private JMenu mefile;
        private JTextArea area;
        private JMenuItem meNew, meOpen, meSave, meClose;
         
         
        public TextEditor(){
            fr = new JFrame("My Text Editor");
            area = new JTextArea(20,45);
            mb = new JMenuBar();
            mefile = new JMenu("File");
            meNew = new JMenuItem("New");
            meOpen = new JMenuItem("Open");
            meSave = new JMenuItem("Save");
            meClose = new JMenuItem("Close");
            
            fr.add(area);
            fr.setJMenuBar(mb);
            mb.add(mefile);
            mefile.add(meNew);
            mefile.add(meOpen);
            mefile.add(meSave);
            mefile.addSeparator();
            mefile.add(meClose);
            //use actionlistener only with button and menuitem
            
            meNew.addActionListener(this);
            meOpen.addActionListener(this);
            meSave.addActionListener(this);
            meClose.addActionListener(this);//
            
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.pack();
            fr.setVisible(true);
        }
        public static void main(String[] args) {
            new TextEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(meNew)){
            this.area.setText("");
        }else if(e.getSource().equals(meClose)){
            fr.setVisible(false);
        }else if(e.getSource().equals(meOpen)){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(fr);
            File f = fc.getSelectedFile();
            
            if(f.exists()){
            try(FileInputStream fn = new FileInputStream(f);
               ObjectInputStream oout = new ObjectInputStream(fn);){
               this.area.setText((String) oout.readObject());
              
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            }
        }else if(e.getSource().equals(meSave)){
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(fr);
            File f = fc.getSelectedFile();
            
            if(f.exists()){
            try(FileOutputStream fn = new FileOutputStream(f);
                ObjectOutputStream oout = new ObjectOutputStream(fn);){
                oout.writeObject(this.area.getText());
                
            }   catch (FileNotFoundException ex) {
                    ex.printStackTrace();
            } catch (IOException ex) {
                    ex.printStackTrace();
            }
                        }
            
            
            
            
        }
    }
    
}
