/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaant;

import decorClass.RoundedButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class ControlB extends IconButton{
    /*String imagePathC;
    int sizeC;*/
    @Override
    public void createButton() {
        addIcon();
        Dimension dButton = new Dimension(size, size);
        //b.setBorder(new RoundCorner(100));
        super.setBackground(Color.WHITE);
        super.setPreferredSize(dButton);
    }
/*
    @Override
    public String getimagePath() {
        return imagePathC;
    }

    @Override
    public int getSize() {
        return sizeC;
    }*/
    public ControlB(int size, String imagePath){
        super.imagePath = imagePath;
        super.size = size;
        createButton();
    }
}
