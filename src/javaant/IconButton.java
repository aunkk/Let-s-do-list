/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaant;

import decorClass.RoundedButton;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public abstract class IconButton extends RoundedButton {
    String imagePath;
    int size;
    public abstract void createButton(); //size typebutton:normal/round bg etc.
    /*public void setimagePath(){this.imagePath = getimagePath();}
    public void setSize(){this.size = getSize();}
    public abstract String getimagePath();
    public abstract int getSize();*/
    public void addIcon(){
        try{
            ImageIcon original = new ImageIcon(getClass().getResource(imagePath));
            Image img = original.getImage();
            Image scaled = img.getScaledInstance(size-5, size-5, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaled);
            setIcon(scaledIcon);
        } catch(Exception ex){
            setText(getName());
        }
    }
}
