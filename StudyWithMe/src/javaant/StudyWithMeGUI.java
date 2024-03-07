package javaant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StudyWithMeGUI{
    private JFrame jframe;
    private JPanel pBase, pImage, pUpper, pText, pButton;
    private JLabel displayA, musicName, vocalistName;
    private JButton bPlay, bNext, bBack, bLoop;
    private ImageIcon animated;
    
    public StudyWithMeGUI() {
        
    jframe = new JFrame("Music Player");
    pBase = new JPanel(new BorderLayout());
    //pBase.setPreferredSize(new Dimension(300, 200));
    //pBase.setMaximumSize(pBase.getPreferredSize()); 
    //pBase.setMinimumSize(pBase.getPreferredSize());
    jframe.add(pBase);
    try{
        //still using my local file location, will fix soon
        //animated = new ImageIcon("C:\\Users\\Admin\\Desktop\\work\\_2023\\Project\\OOP\\tester150px.gif");
        animated = new ImageIcon(getClass().getResource("/javaant/Icon/tester150px.gif"));
        displayA = new JLabel(animated);
        //displayA.setIcon(animated);
    } catch(Exception e) {
        displayA = new JLabel("Image not found TT");
    }
    //gif
    //Image resizeAnimated = animated.getImage().getScaledInstance(150, 150, 0);
    //animated = new ImageIcon(resizeAnimated);

    
    //layout
   
    jframe.add(pBase);
    
    pUpper = new JPanel();
    pText = new JPanel(new GridLayout(2, 1));
    pBase.add(pUpper, BorderLayout.NORTH);
    pUpper.add(displayA);
    pUpper.add(pText);
    musicName = new JLabel("    musicName goes here");
    vocalistName =new JLabel("   vocalistName");
    pText.add(musicName);
    pText.add(vocalistName);
    
    pButton = new JPanel();
    pBase.add(pButton, BorderLayout.SOUTH);
    
    bBack = new JButton(new ImageIcon(getClass().getResource("/javaant/Icon/backward.png")));
    bPlay = new JButton(new ImageIcon(getClass().getResource("/javaant/Icon/play.png")));
    bNext = new JButton(new ImageIcon(getClass().getResource("/javaant/Icon/next.png")));
    bLoop = new JButton(new ImageIcon(getClass().getResource("/javaant/Icon/loop.png")));
    
    pButton.add(bBack);
    pButton.add(bPlay);
    pButton.add(bNext);
    pButton.add(bLoop);
    /*
    jframe.add(pUpper);
    jframe.add(pButton, 3);
    pUpper.setLayout(new BorderLayout());
    pUpper.add(pImage, BorderLayout.WEST);
    pImage.add(displayA);
    */
    
    
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jframe.pack();
    jframe.setVisible(true);
    }
    
    public static void main(String[] args) {
        StudyWithMeGUI a = new StudyWithMeGUI();
    }
}
