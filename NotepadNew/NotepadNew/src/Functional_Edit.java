import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
public class Functional_Edit {
    private NotepadGUI notepad;
    public Functional_Edit(NotepadGUI notepad){
        this.notepad = notepad;
    }
    public void undo(){
        try{
            notepad.getUm().undo();
        }
        catch(CannotUndoException ex){
            System.out.println("Can't undo the drawing");
        }
    }
    public void redo(){
        try{
            notepad.getUm().redo();
        }
        catch(CannotRedoException ex){
            System.out.println("Can't undo the drawing");
        }

    }
}











