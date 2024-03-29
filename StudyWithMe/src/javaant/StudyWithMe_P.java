package javaant;

import decorClass.RoundedButton;
import decorClass.RoundedPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
public class StudyWithMe_P extends JPanel implements ActionListener{
    private JPanel pAni, pUpper, pText, pPlayPause, mTime, pMName1, pMName2;
    private RoundedPanel pButton;
    private JLabel displayA;
    private RoundedButton bPlay, bPause, bNext, bBack, bLoop;
    
    private int panelSize;
    private ImageIcon animated;
    //private Border bd;
    
    //music setup
    private static JLabel displayName = new JLabel("----------");
    private static JLabel displayPName = new JLabel("nothing is being played");
    private static JLabel mPass = new JLabel("00:00");
    private static JLabel mAll = new JLabel("/xx:xx");
    private ControlMusic_P control;
    static boolean isLoop = false;
    Random random = new Random();
    private int musicI = 0;
    
    /*public JPanel OpaquePanel(JPanel jp) {
        jp = new JPanel();
        jp.setOpaque(true);
        return jp;
    }*/
    
    public StudyWithMe_P() {
    control = new ControlMusic_P();
    
    //**GUI
    setLayout(new BorderLayout());
    setOpaque(false);
    //bd = BorderFactory.createEmptyBorder(10, 10, 10, 10);
    //setBorder(bd);
    addComponentListener(new ComponentAdapter(){
        @Override
        public void componentResized(ComponentEvent e) {
            Dimension size = getSize();
            int width = size.width;
            int height = size.height;
            System.out.println("Width: " + width + ", Height: " + height);
            panelSize = width;
        }
    }
    );
    
    try{
        animated = new ImageIcon(getClass().getResource("/javaant/Icon/studywithduck120px.gif"));
       /*
        Image ori = animated.getImage();
        BufferedImage resizedI = new BufferedImage(130, 130, BufferedImage.TYPE_INT_ARGB);Graphics2D g2d = resizedI.createGraphics();
        g2d.drawImage(ori, 0, 0, 130, 130, null);
        //g2d.dispose();
        
        animated = new ImageIcon(resizedI);
      */
        displayA = new JLabel();
        displayA.setIcon(animated);
    } catch(Exception e) {
        displayA = new JLabel("Image not found TT");
    }

    //layout
    pAni = new JPanel();
    pAni.setPreferredSize(new Dimension(120, 115));
    pAni.setOpaque(false);
    pAni.add(displayA);
    pUpper = new JPanel(new BorderLayout());
    pText = new JPanel(new GridLayout(2, 1));
    //pText.setBorder(bd);
    add(pUpper, BorderLayout.CENTER);
    //displayA.setBorder(bd);
    pUpper.add(pAni, BorderLayout.NORTH);
    pUpper.add(pText, BorderLayout.SOUTH);
    pUpper.setOpaque(false);
    pText.setOpaque(false);
    
    pMName1 = new JPanel();
    pMName2 = new JPanel();
    pMName1.add(displayName);
    pMName2.add(displayPName);
    displayName.setFont(new Font("Comic Sans MS", 0, 14));
    displayPName.setFont(new Font("Comic Sans MS", 0, 12));
    //mPass.setFont(new Font("Comic Sans MS", 0, 10));
    //mAll.setFont(new Font("Comic Sans MS", 0, 10));
    pMName1.setOpaque(false);
    pMName2.setOpaque(false);
    
    mTime = new JPanel();
    mTime.add(mPass);
    mTime.add(mAll);
    pText.add(pMName1);
    pText.add(pMName2);
    pText.setPreferredSize(new Dimension(100, 45));
    //pText.add(mTime);
    //pText.add(vocalistName);
    
    pButton = new RoundedPanel();
    pButton.setBackground(new Color(160, 198, 190));
    add(pButton, BorderLayout.SOUTH);
    pPlayPause = new JPanel(new CardLayout());
    pPlayPause.setOpaque(false);
    
    bBack = ControlButton(bBack, 30, "/javaant/Icon/backward.png");
    bPlay = ControlButton(bPlay, 30, "/javaant/Icon/play.png");
    bPause = ControlButton(bPlay, 30, "/javaant/Icon/pause.png");
    bNext = ControlButton(bNext, 30, "/javaant/Icon/next.png");
    bLoop = ControlButton(bLoop, 30, "/javaant/Icon/loop.png");
    
    pButton.add(bBack);
    pButton.add(pPlayPause);
    pButton.add(bNext);
    pButton.add(bLoop);
    
    pPlayPause.add(bPlay, "bPlay");
    pPlayPause.add(bPause, "bPause");
    
    CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
    cardLayout.show(pPlayPause, "bPlay");
    //pPlayPause.show();

    //action
    bBack.addActionListener(this);
    bPlay.addActionListener(this);
    bPause.addActionListener(this);
    bNext.addActionListener(this);
    bLoop.addActionListener(this);
    
    }
    
    //Square Button Pattern
    private RoundedButton ControlButton(RoundedButton b, int size, String imagePath) {
        Dimension dButton = new Dimension(size, size);
        b = new RoundedButton();
        //b.setBorder(new RoundCorner(100));
        b.setBackground(Color.WHITE);
        b.setPreferredSize(dButton);
        try{
            ImageIcon original = new ImageIcon(getClass().getResource(imagePath));
            Image img = original.getImage();
            Image scaled = img.getScaledInstance(size-5, size-5, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaled);
            b.setIcon(scaledIcon);
        } catch(Exception ex){
            b.setText(b.getName());
        }
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomI2 = 0;
        CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
        if (e.getSource() == bPause) {
            System.out.println("pause");
            control.PauseMusic();
            
            //change Icon
            //might add .gif transition later 
            //CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
            cardLayout.show(pPlayPause, "bPlay");  
        }
        else if (e.getSource() == bLoop){
            if (isLoop == false) {
                isLoop = true;
                bLoop.setBackground(Color.LIGHT_GRAY);
            
            }else {
                isLoop = false;
                bLoop.setBackground(Color.WHITE);
            }
        }
        else if (e.getSource() == bPlay) {
            //**testing
            //random 0-3
            System.out.println("play..");
            if ((control.player == null)||(control.player.isComplete())) {
                do
                {
                    randomI2 = random.nextInt(control.musicNum);
                }
                while ((randomI2 != 0)&&(musicI == randomI2));
                this.musicI = randomI2;
                control.PlayMusic(musicI);
                //displayPlaying();
            } else {
                control.ResumeMusic();
                System.out.println("resume until" + control.musicDuration);
            }
           
            //change Icon
            //might add .gif transition later :D
            //CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
            cardLayout.show(pPlayPause, "bPause");  
            
        }
        else if (e.getSource() == bBack){
            /*.out.println("previous music");
            control.PauseMusic();
            if(musicI == 0) {
                this.musicI = random.nextInt(control.musicNum);
            }
            else {musicI -= 1;}*/
            control.PreviousMusic();
            cardLayout.show(pPlayPause, "bPause"); 
            //displayPlaying();
            
        }
        else if (e.getSource() == bNext){
            /*System.out.println("next music");
            control.PauseMusic();
            if(musicI == control.musicNum-1) {
                this.musicI = random.nextInt(control.musicNum);
            }
            else {musicI += 1;}*/
            control.NextMusic();
            cardLayout.show(pPlayPause, "bPause"); 
            //displayPlaying();
        }
    }
    public static void setDisplayName(String m, String p) {
        displayName.setText(m);
        displayPName.setText(p);
    }
    public void displayPlaying() {
        String musicName = control.getMusicName();
        String[] splitName = musicName.split(" - ", 2);
        displayName.setText(splitName[1]);
        displayPName.setText(splitName[0]);
    }
}