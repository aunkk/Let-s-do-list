
import java.awt.Color;
public class Functional_Format {
    private boolean lightModeOn=false;
    private NotepadGUI notepad;
    public Functional_Format(NotepadGUI notepad){
        this.notepad = notepad;
    }
    public void displayColor(){
        if (lightModeOn == false){
            notepad.getNote().setBackground(new Color(0,0,0));
            notepad.getNote().setForeground(new Color(255,255,255));
             notepad.getItemDisplay().setText("Light Mode");
            lightModeOn = true;
            
        }else if (lightModeOn == true){
            notepad.getNote().setBackground(new Color(255,255,255));
            notepad.getNote().setForeground(new Color(0,0,0));
            notepad.getItemDisplay().setText("Dark Mode");
            lightModeOn = false;
        }
    }
}












