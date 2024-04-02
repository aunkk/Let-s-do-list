package NotePad;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 
@author Admin*/
public class NoteData {
    private String noteName, filepath, noteText;
    ArrayList<ArrayList<Point>> drawlines;
    public String getnoteName() {return noteName;}
    public String getfilepath() {return filepath;}
    public String getnoteText() {return noteText;}
    public ArrayList<ArrayList<Point>> getDrawlines() {return drawlines;}
    
    public void setnoteName(String noteName) {
        this.noteName = noteName;
    }
    public void setfilepath(String filepath){
        this.filepath = filepath;
    }
    public void setnoteText(String noteText) {
        this.noteText = noteText;
    }
    
    public void setdrawlines(ArrayList drawlines) {
        this.drawlines = drawlines;
    }
}
