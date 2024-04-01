package javaant;

import decorClass.RoundedPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class StudyWithMe_P extends JPanel implements ActionListener{
    private JPanel pAni, pUpper, pText, pPlayPause, pMName1, pMName2;
    private RoundedPanel pButton;
    private JLabel displayA;
    private ControlB bPlay, bPause, bNext, bBack, bLoop;
    
    private int panelSize;
    private ImageIcon animated;
    //private Border bd;
    
    //music setup
    private static JLabel displayName = new JLabel("----------");
    private static JLabel displayPName = new JLabel("nothing is being played");
    private ControlMusic_P control;
    static boolean isLoop = false;
    Random random = new Random();
    private int musicI = 0;
    
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
    pMName1.setOpaque(false);
    pMName2.setOpaque(false);
    

    pText.add(pMName1);
    pText.add(pMName2);
    pText.setPreferredSize(new Dimension(100, 45));
    
    pButton = new RoundedPanel();
    pButton.setBackground(new Color(160, 198, 190));
    add(pButton, BorderLayout.SOUTH);
    pPlayPause = new JPanel(new CardLayout());
    pPlayPause.setOpaque(false);
    
    bBack = new ControlB(30, "/javaant/Icon/backward.png");
    bPlay = new ControlB(30, "/javaant/Icon/play.png");
    bPause = new ControlB(30, "/javaant/Icon/pause.png");
    bNext = new ControlB(30, "/javaant/Icon/next.png");
    bLoop = new ControlB(30, "/javaant/Icon/loop.png");
    
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

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomI2 = 0;
        CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
        if (e.getSource() == bPause) {
            System.out.println("pause");
            control.PauseMusic();
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
            cardLayout.show(pPlayPause, "bPause");  
            
        }
        else if (e.getSource() == bBack){
            control.PreviousMusic();
            cardLayout.show(pPlayPause, "bPause"); 
            //displayPlaying();
            
        }
        else if (e.getSource() == bNext){
            control.NextMusic();
            cardLayout.show(pPlayPause, "bPause"); 
            //displayPlaying();
        }
    }
    public static void setDisplayName(String m, String p) {
        displayName.setText(m);
        displayPName.setText(p);
    }
}
