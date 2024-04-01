package NotePad;

//this is for test JInternalframe, no need this file! 
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    private JDesktopPane dframe;
    private NotepadGUI note;
    public Main(){
        dframe = new JDesktopPane();
        note = new NotepadGUI();
        this.setPreferredSize(new Dimension(1000,1000));
        
        dframe.add(note);
        add(dframe);
        
        note.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        note.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new Main();
    }
}
