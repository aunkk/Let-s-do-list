package javaant;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class StudyWithMeGUI implements ActionListener{
    private JFrame jframe;
    private JPanel pBase, pImage, pUpper, pText, pButton, pPlayPause, mTime, pMName;
    private JLabel displayA, mName, mPass, mAll;
    private RoundedButton bPlay, bPause, bNext, bBack, bLoop;
    private ImageIcon animated;
    private Border bd;
    public static boolean isLoop = false;
    
    public ControlMusic control;
    
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
    mName = new JLabel("----------");
    mPass = new JLabel("00:00");
    mAll = new JLabel("/xx:xx");
    pMName = new JPanel();
    pMName.add(mName);
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
    bNext.addActionListener(this);
    bLoop.addActionListener(this);
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
        if (e.getSource() == bPlay) {
            //**testing
            //can't use in-package path, dunno why ;_;
            control.PlayMusic("C:\\Users\\Admin\\Desktop\\work\\_2023\\Project\\StudyWithMe\\src\\javaant\\songs\\Tofuus - Iris.mp3");
            String fileName = "Tofuus - Iris";
            mName.setText(fileName);
            CardLayout cardLayout = (CardLayout) pPlayPause.getLayout();
            cardLayout.show(pPlayPause, "bPause");  
        }
        else if (e.getSource() == bPause) {
            control.PauseMusic();
        }
        
    }
    public static void main(String[] args) {
        StudyWithMeGUI a = new StudyWithMeGUI();
    }
}
