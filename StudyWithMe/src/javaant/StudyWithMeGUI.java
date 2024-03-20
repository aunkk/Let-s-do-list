package javaant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.io.*;
import java.util.*;
public class StudyWithMeGUI implements ActionListener{
    private JFrame jframe;
    private JPanel pBase, pImage, pUpper, pText, pButton, pPlayPause, mTime, pMName;
    private JLabel displayA, displayName, mPass, mAll;
    private RoundedButton bPlay, bPause, bNext, bBack, bLoop;
    private ImageIcon animated;
    private Border bd;
    
    //music setup
    ControlMusic control;
    static boolean isLoop = false;
    //String musicA[] = {"Tofuus - Iris.mp3", "Tofuus - Magnolia jane.mp3", "Tofuus - Soda.mp3"};
    ArrayList<String> musicList;
    private String thisDir;
    
    public StudyWithMeGUI() {
    
    control = new ControlMusic();
            
    jframe = new JFrame("Music Player");
    pBase = new JPanel(new BorderLayout());
    //pBase.setBackground(Color.WHITE);
    bd = BorderFactory.createEmptyBorder(10, 10, 10, 10);
    pBase.setBorder(bd);
    jframe.add(pBase);
    try{
        animated = new ImageIcon(getClass().getResource("/javaant/Icon/tester150px.gif"));
        displayA = new JLabel(animated);
    } catch(Exception e) {
        displayA = new JLabel("Image not found TT");
    }

    //layout
    jframe.add(pBase);
    
    pUpper = new JPanel(new BorderLayout());
    //pUpper.setBackground(Color.WHITE);
    pText = new JPanel(new GridLayout(2, 1));
    pText.setBorder(bd);
    pBase.add(pUpper, BorderLayout.CENTER);
    //displayA.setBorder(bd);
    pUpper.add(displayA, BorderLayout.CENTER);
    pUpper.add(pText, BorderLayout.SOUTH);
    displayName = new JLabel("----------");
    mPass = new JLabel("00:00");
    mAll = new JLabel("/xx:xx");
    pMName = new JPanel();
    pMName.add(displayName);
    mTime = new JPanel();
    mTime.add(mPass);
    mTime.add(mAll);
    pText.add(pMName);
    pText.add(mTime);
    //pText.add(vocalistName);
    
    pButton = new JPanel();
    pBase.add(pButton, BorderLayout.SOUTH);
    pPlayPause = new JPanel(new CardLayout());
    
    bBack = ControlButton(bBack, 50, "/javaant/Icon/backward.png");
    bPlay = ControlButton(bPlay, 50, "/javaant/Icon/play.png");
    bPause = ControlButton(bPlay, 50, "/javaant/Icon/pause.png");
    bNext = ControlButton(bNext, 50, "/javaant/Icon/next.png");
    bLoop = ControlButton(bLoop, 50, "/javaant/Icon/loop.png");
    
    pButton.add(bBack);
    pButton.add(pPlayPause);
    pButton.add(bNext);
    pButton.add(bLoop);
    
    pPlayPause.add(bPlay, "bPlay");
    pPlayPause.add(bPause, "bPause");
    
    CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
    cardLayout.show(pPlayPause, "bPlay");
    //pPlayPause.show();
    
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
    
    //action
    bBack.addActionListener(this);
    bPlay.addActionListener(this);
    bPause.addActionListener(this);
    bNext.addActionListener(this);
    bLoop.addActionListener(this);
    
    //**create musicList**
    //create file path
    thisDir = System.getProperty("user.dir").replace(File.separator, "\\\\");
    System.out.println("just checking ja");
    System.out.println(thisDir);
    File musicdir = new File(thisDir+"\\src\\javaant\\music\\");
    //regist all files in specific folder to array
    File[] fileA = musicdir.listFiles();
    //getName for each file
    musicList = new ArrayList<>();
    for (File f : fileA) {
                musicList.add(f.getName());
            }
    System.out.println(musicList);
    
    }
    
    //Square Button Pattern
    private RoundedButton ControlButton(RoundedButton b, int size, String imagePath) {
        Dimension dButton = new Dimension(size, size);
        b = new RoundedButton(30, 30);
        //b.setBorder(new RoundCorner(100));
        b.setBackground(Color.WHITE);
        b.setPreferredSize(dButton);
        ImageIcon original = new ImageIcon(getClass().getResource(imagePath));
        Image img = original.getImage();
        Image scaled = img.getScaledInstance(size-20, size-20, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        b.setIcon(scaledIcon);
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int randomI = 0;
        String musicName;
        
        if (e.getSource() == bPause) {
            control.PauseMusic();
            
            //change Icon
            //might add .gif transition later 
            CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
            cardLayout.show(pPlayPause, "bPlay");  
        }
        else if (e.getSource() == bLoop){
            if (isLoop == false) {isLoop = true;}
            else {isLoop = false;}
        }
        else if (e.getSource() == bPlay) {
            //**testing
            //random 0-3
            
            //for now, it'll random every time when pressed play button 
            randomI = random.nextInt(3);
      
            control.PlayMusic(thisDir + "\\src\\javaant\\music\\" + musicList.get(randomI));
            
            musicName = getMusicName(randomI);
            displayName.setText(musicName);
            //change Icon
            //might add .gif transition later :D
            CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
            cardLayout.show(pPlayPause, "bPause");  
            
        }
        else {
            control.PauseMusic();
            /*if (randomI < musicList.size()) {
                randomI += 1;
            }else {
                randomI = 0;
            }
            System.out.println(musicList.size());
            System.out.println(randomI);*/
            randomI = random.nextInt(3);
            control.PlayMusic(thisDir + "\\src\\javaant\\music\\" + musicList.get(randomI));
            
            musicName = getMusicName(randomI);
            displayName.setText(musicName);
        }
        
    }
    public String getMusicName(int randomI) {
            String fileName = musicList.get(randomI);
            String musicName = "";
            for (char ch : fileName.toCharArray()) {
                if (".".equals(String.valueOf(ch))) {
                    break;
                }
                musicName += ch;
            }
        return musicName;
    }
    public static void main(String[] args) {
        StudyWithMeGUI a = new StudyWithMeGUI();
    }
}
