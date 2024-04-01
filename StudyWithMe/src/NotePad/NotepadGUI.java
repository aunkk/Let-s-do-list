package NotePad;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.undo.UndoManager;
import javax.swing.event.*;
public class NotepadGUI extends JInternalFrame implements ActionListener{
    protected Notepad note;
    protected JScrollPane noteWithScrollPane;
    protected JMenuBar menuBar;
    protected JMenu menuDrawing, menuFile, menuFormat, menuEdit, menuAdd;
    protected JMenuItem itemFree, itemLine, itemRect, itemErase, itemNew, itemOpen, itemSave,
            itemSaveAs, itemExit, itemWrap, itemDisplay, itemRedo, itemUndo, itemImages;
    
    protected Functional_File file;
    protected Functional_View view;
    protected Functional_Edit edit;
    protected Functional_Add add;
    protected UndoManager um;
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        switch(command){
            case "New": file.newFile(); break;
            case "Open": file.openFile(); break;
            case "Save as": file.saveAs(); break;
            case "Save": file.save(); break;
            case "Images": add.addImage(); break;
            case "Free Hand": add.drawFreeHand(); break;
            case "Erase": add.erase(); break;
            case "Exit": file.exit(); break;
            case "Undo": edit.undo(); break;
            case "Redo": edit.redo(); break;
            case "Display": view.displayColor(); break;
            
        }
    }
    public NotepadGUI(){
        file = new Functional_File(this);
        view = new Functional_View(this);
        edit = new Functional_Edit(this);
        add = new Functional_Add(this);
        um = new UndoManager();
        
        createNotepadWindow();
        createNote();
        createMenuBar();
        createMenuFileItem();
        createMenuAddItem();
        createMenuDrawingItem();
        createMenuView();
        createMenuEdit();
        this.setVisible(true);
    }
    private void createNotepadWindow(){
         this.setSize(500, 600);
         this.setTitle("Notepad");
         this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
    }
    private void createNote(){
        note = new Notepad();
        note.getDocument().addUndoableEditListener(new UndoableEditListener(){
            @Override
            public void undoableEditHappened(UndoableEditEvent e){
                um.addEdit(e.getEdit());
            }
        });
        note.setFont(CustomFont.getNoteFont());
        noteWithScrollPane = new JScrollPane(note, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        noteWithScrollPane.setBorder(BorderFactory.createEmptyBorder());
        this.add(noteWithScrollPane);
    }
    private void createMenuBar(){
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        menuFile = new JMenu("File");
        menuFile.setFont(CustomFont.getMenuFont());
        menuBar.add(menuFile);
        
        menuEdit = new JMenu("Edit");
        menuEdit.setFont(CustomFont.getMenuFont());
        menuBar.add(menuEdit);
        
        menuAdd = new JMenu("Add");
        menuAdd.setFont(CustomFont.getMenuFont());
        menuBar.add(menuAdd);
        
        menuFormat = new JMenu("Format");
        menuFormat.setFont(CustomFont.getMenuFont());
        menuBar.add(menuFormat);
    }
    private void createMenuAddItem(){
        itemImages = new JMenuItem("Images");
        itemImages.setFont(CustomFont.getMenuFont());
        itemImages.addActionListener(this);
        itemImages.setActionCommand("Images");
        menuAdd.add(itemImages);
        
        menuDrawing = new JMenu("Drawing");
        menuDrawing.setFont(CustomFont.getMenuFont());
        menuAdd.add(menuDrawing);
    }
    private void createMenuDrawingItem(){
        /*itemLine = new JMenuItem("Line");
        itemLine.setFont(CustomFont.getMenuFont());
        menuDrawing.add(itemLine);
        
        itemRect = new JMenuItem("Rectangle");
        itemRect.setFont(CustomFont.getMenuFont());
        menuDrawing.add(itemRect);*/
        
        itemFree = new JMenuItem("Free Hand");
        itemFree.setFont(CustomFont.getMenuFont());
        itemFree.addActionListener(this);
        itemFree.setActionCommand("Free Hand");
        menuDrawing.add(itemFree);
        
        itemErase = new JMenuItem("Erase");
        itemErase.setFont(CustomFont.getMenuFont());
        itemErase.addActionListener(this);
        itemErase.setActionCommand("Erase");
        menuDrawing.add(itemErase);
    }
    private void createMenuFileItem(){
        itemNew = new JMenuItem("New");
        itemNew.setFont(CustomFont.getMenuFont());
        itemNew.addActionListener(this);
        itemNew.setActionCommand("New");
        menuFile.add(itemNew);
        
        itemOpen = new JMenuItem("Open");
        itemOpen.setFont(CustomFont.getMenuFont());
        itemOpen.addActionListener(this);
        itemOpen.setActionCommand("Open");
        menuFile.add(itemOpen);
        
        itemSave = new JMenuItem("Save");
        itemSave.setFont(CustomFont.getMenuFont());
        itemSave.addActionListener(this);
        itemSave.setActionCommand("Save");
        menuFile.add(itemSave);
        
        itemSaveAs = new JMenuItem("Save as");
        itemSaveAs.setFont(CustomFont.getMenuFont());
        itemSaveAs.addActionListener(this);
        itemSaveAs.setActionCommand("Save as");
        menuFile.add(itemSaveAs);
        
        itemExit = new JMenuItem("Exit");
        itemExit.setFont(CustomFont.getMenuFont());
        itemExit.addActionListener(this);
        itemExit.setActionCommand("Exit");
        menuFile.add(itemExit);
    }
    private void createMenuView(){
        itemDisplay = new JMenuItem("Dark Mode");
        itemDisplay.setFont(CustomFont.getMenuFont());
        itemDisplay.addActionListener(this);
        itemDisplay.setActionCommand("Display");
        menuFormat.add(itemDisplay);
    }
    private void createMenuEdit(){
        itemUndo = new JMenuItem("Undo");
        itemUndo.setFont(CustomFont.getMenuFont());
        itemUndo.addActionListener(this);
        itemUndo.setActionCommand("Undo");
        menuEdit.add(itemUndo);
        
        itemRedo = new JMenuItem("Redo");
        itemRedo.setFont(CustomFont.getMenuFont());
        itemRedo.addActionListener(this);
        itemRedo.setActionCommand("Redo");
        menuEdit.add(itemRedo);
    }
    
}
