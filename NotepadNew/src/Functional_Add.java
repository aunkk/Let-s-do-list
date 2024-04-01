import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Functional_Add {
    private NotepadGUI notepad;
    public Functional_Add(NotepadGUI notepad){
        this.notepad = notepad;
    }
    public void addImage(){
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Select the Image");
        fc.setFileFilter(new FileNameExtensionFilter("Open Image", "jpg", "jpeg"));
        int option =  fc.showOpenDialog(notepad);
        fc.setDialogTitle("Select the Image");
        if (option==JFileChooser.APPROVE_OPTION){
            File imgFile = fc.getSelectedFile();
            if (imgFile.exists()){
                System.out.println("Done");
                ImageIcon img = new ImageIcon(imgFile.getAbsolutePath());
                Image img2 = img.getImage();
                int imgH = img.getIconHeight();
                int imgW = img.getIconWidth();
                int noteH = notepad.note.getHeight();
                int noteW = notepad.note.getWidth();
                Image img3 = img2.getScaledInstance(imgW-Math.abs(noteW-imgW), imgH-Math.abs(noteH-imgH), java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(img3);
                JLabel realImg = new JLabel();
                realImg.setIcon(img);
                notepad.note.insertComponent(realImg);
            }else{
                System.out.println("Cancel the process");
            }
        }
    }
    public void drawFreeHand(){
        if (notepad.note.freeHandOn==false){
            notepad.note.freeHandOn = true;
            notepad.note.eraseOn = false;
        }
    }
    public void erase(){
        if (notepad.note.eraseOn==false){
            notepad.note.eraseOn = true;
            notepad.note.freeHandOn = false;
        }
    }
}
