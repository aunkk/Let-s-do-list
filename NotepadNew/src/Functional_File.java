import java.io.File;
import javax.swing.*;
import java.io.*;
public class Functional_File {
        private NotepadGUI notepad;
        private String fileName;
        private String fileAddress;
        public Functional_File(NotepadGUI notepad){
            this.notepad = notepad;
        }
        public void newFile(){
            notepad.note.setText("");
            notepad.note.lines.clear();
            notepad.setTitle("New");
            fileName = null;
            fileAddress = null;
        }
        public void openFile() {
            File fs;
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(notepad);
            fs = fc.getSelectedFile();
            
            if (fs != null){
                fileName = fs.getName();
                fileAddress = fs.getPath();
                notepad.setTitle(fileName);
                
                try(FileInputStream fis = new FileInputStream(fileAddress);
                ObjectInputStream ois = new ObjectInputStream(fis);){
                System.out.println("Loaded");
                notepad.note.setText("");
                notepad.note = (Notepad)ois.readObject();
                notepad.add(notepad.note);
                } catch (IOException ex) {
                    System.out.println("There's Somthing Wrong");
                } catch (ClassNotFoundException ex) {
                    System.out.println("Not Found");
                }
            }
        }
        public void save(){
            if(fileName == null){
                saveAs();
            } else{
                try(FileOutputStream fos = new FileOutputStream(fileAddress);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);){
                    oos.writeObject(notepad.note.getAccessibleContext());
                    notepad.setTitle(fileName);
                }catch(Exception ex){
                    System.out.println("There's Somthing Wrong");
                }
            }
        }
        public void saveAs(){
            File fs;
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(notepad);
            fs = fc.getSelectedFile();
            if (fs != null){
                fileName = fs.getName();
                fileAddress = fs.getPath();
                notepad.setTitle(fileName);
                try(FileOutputStream fos = new FileOutputStream(fileAddress);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);){
                    oos.writeObject(notepad.note);
                }catch (Exception ex) {
                    System.out.println("There's Somthing Wrong");
                }
            }
        }
        public void exit(){
            if (!notepad.note.getText().equals("")){
                saveAs();
            }
            System.exit(0);
        }
}
