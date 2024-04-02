import java.awt.Image;
import java.io.File;
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
                int noteH = notepad.getNote().getHeight();
                int noteW = notepad.getNote().getWidth();
                Image img3 = img2.getScaledInstance(imgW-Math.abs(noteW-imgW), imgH-Math.abs(noteH-imgH), java.awt.Image.SCALE_SMOOTH);
                img = new ImageIcon(img3);
                JLabel realImg = new JLabel();
                realImg.setIcon(img);
                notepad.getNote().insertComponent(realImg);
            }else{
                System.out.println("Cancel the process");
            }
        }
    }
    public void drawFreeHand(){
        if (notepad.getNote().isFreeHandOn()==false){
            notepad.getNote().setFreeHandOn(true);
            notepad.getNote().setEraseOn(false);
        }
    }
    public void erase(){
        if (notepad.getNote().isEraseOn()==false){
            notepad.getNote().setEraseOn(true);
            notepad.getNote().setFreeHandOn(false);
        }
    }
}
