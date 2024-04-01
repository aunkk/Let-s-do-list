package NotePad;

import java.awt.Color;
public class Functional_View {
    private boolean lightModeOn=false;
    private NotepadGUI notepad;
    public Functional_View(NotepadGUI notepad){
        this.notepad = notepad;
    }
    public void displayColor(){
        if (lightModeOn == false){
            notepad.note.setBackground(new Color(0,0,0));
            notepad.note.setForeground(new Color(255,255,255));
             notepad.itemDisplay.setText("Light Mode");
            lightModeOn = true;
            
        }else if (lightModeOn == true){
            notepad.note.setBackground(new Color(255,255,255));
            notepad.note.setForeground(new Color(0,0,0));
            notepad.itemDisplay.setText("Dark Mode");
            lightModeOn = false;
        }
    }
}












