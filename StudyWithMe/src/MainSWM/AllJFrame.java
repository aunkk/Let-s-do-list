/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainSWM;

import decorClass.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javaant.StudyWithMe_P;
import javaant.TaskData;
import javaant.savable;
import javax.swing.*;

/**
 *
 * @author plengkubpom
 */
public class AllJFrame extends JFrame implements savable, MouseListener{
    private String filePath = "LetsDoList_save.data";
    int round = 0;
    int numRow = 1;
    int numCol = 1;
    public EditButton editButton;
    private TaskData data;
    ArrayList<TaskPattern> tasklist;
    ArrayList<TaskData> taskdatalist;
    DefaultListModel<String> model;
    
    public void removeTask(int i){
        //i = round-1 from editdelete class
        tasklist.remove(i);
        taskdatalist.remove(i);
        this.round = taskdatalist.size();
        refreshTask();
    }
    public void clearAllTask(){
        panel.removeAll();
        tasklist.clear();
        taskdatalist.clear();
        this.round = 0;
    }
    //clear n re-read
    public void refreshTask(){
        this.round = taskdatalist.size();
        panel.removeAll();
        addTaskToPanel();
    }
    public void recreateTask(){
        System.out.print("taskdata num = "+taskdatalist.size());
        panel.removeAll();
        tasklist.clear();
        for (int i = 0; i < taskdatalist.size(); i++) {
                tasklist.add(new TaskPattern(this, i+1, taskdatalist.get(i)));
            }
        refreshTask();
    }
    public void addTaskdatalist(int i, TaskData data){
        //i = round-1
        taskdatalist.add(i, data);
        taskdatalist.remove(i+1);
        //check
        for (int j = 0; j < taskdatalist.size(); j++) {
            System.out.println("check taskdata");
            System.out.println(taskdatalist.get(j).gettaskname());
        }
    }
    public AllJFrame() {
        initComponents();
        editButton = new EditButton();
        
        taskPopup.add(p); //add panel to taskPopup
        model = new DefaultListModel<>(); // create model
        suggestionList.setModel(model); //put model in list
        loadfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JPanel();
        suggestionScrollPane = new javax.swing.JScrollPane();
        suggestionList = new javax.swing.JList<>();
        taskPopup = new javax.swing.JPopupMenu();
        leftP = new javax.swing.JPanel();
        timerPanel = new javax.swing.JPanel();
        stopwatch1 = new time.Stopwatch();
        todoPanel = new javax.swing.JPanel();
        todoScroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        taskLabel = new javax.swing.JLabel();
        rightP = new javax.swing.JPanel();
        upperP = new javax.swing.JPanel();
        Calendar = new RoundedPanel(50, 50);
        CalendarRoundPanel = new decorClass.RoundedPanel();
        SearchTool = new RoundedPanel(50, 50);
        searchPanel = new decorClass.RoundedPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new decorClass.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        StudyWithMe_P swm = new StudyWithMe_P();
        swm_panel = new RoundedPanel(50, 50);
        lowerP3 = new javax.swing.JPanel();
        noteEditPanel = new decorClass.RoundedPanel();
        notepadGUI1 = new NotePad.NotepadGUI();
        addButton = new decorClass.CircleButton();

        suggestionList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        suggestionScrollPane.setViewportView(suggestionList);

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
            .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(suggestionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(suggestionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(197, 230, 196));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        leftP.setBackground(new java.awt.Color(255, 255, 255));
        leftP.setForeground(new java.awt.Color(255, 255, 255));

        timerPanel.setBackground(new java.awt.Color(235, 212, 235));

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopwatch1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopwatch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        todoPanel.setBackground(new java.awt.Color(212, 227, 235));

        todoScroll.setBorder(null);
        todoScroll.setMinimumSize(null);

        panel.setBackground(new java.awt.Color(160, 198, 190));
        panel.setLayout(new java.awt.GridLayout(numRow, numCol));
        todoScroll.setViewportView(panel);

        javax.swing.GroupLayout todoPanelLayout = new javax.swing.GroupLayout(todoPanel);
        todoPanel.setLayout(todoPanelLayout);
        todoPanelLayout.setHorizontalGroup(
            todoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        todoPanelLayout.setVerticalGroup(
            todoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(todoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(todoScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        taskLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        taskLabel.setForeground(new java.awt.Color(0, 153, 204));
        taskLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskLabel.setText("Today's Task");

        javax.swing.GroupLayout leftPLayout = new javax.swing.GroupLayout(leftP);
        leftP.setLayout(leftPLayout);
        leftPLayout.setHorizontalGroup(
            leftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(taskLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addComponent(todoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPLayout.setVerticalGroup(
            leftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(taskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(todoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rightP.setBackground(new java.awt.Color(255, 255, 255));
        rightP.setForeground(new java.awt.Color(255, 255, 255));

        upperP.setBackground(new java.awt.Color(211, 235, 221));

        Calendar.setBackground(new java.awt.Color(211, 235, 221));

        CalendarRoundPanel.setBackground(new java.awt.Color(198, 198, 198));

        javax.swing.GroupLayout CalendarRoundPanelLayout = new javax.swing.GroupLayout(CalendarRoundPanel);
        CalendarRoundPanel.setLayout(CalendarRoundPanelLayout);
        CalendarRoundPanelLayout.setHorizontalGroup(
            CalendarRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        CalendarRoundPanelLayout.setVerticalGroup(
            CalendarRoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CalendarLayout = new javax.swing.GroupLayout(Calendar);
        Calendar.setLayout(CalendarLayout);
        CalendarLayout.setHorizontalGroup(
            CalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarLayout.createSequentialGroup()
                .addComponent(CalendarRoundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CalendarLayout.setVerticalGroup(
            CalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CalendarRoundPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SearchTool.setBackground(new java.awt.Color(211, 235, 221));

        searchPanel.setBackground(new java.awt.Color(218, 249, 226));
        searchPanel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        searchField.setBackground(new java.awt.Color(218, 249, 226));
        searchField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        searchField.setForeground(new java.awt.Color(0, 153, 153));
        searchField.setText("searchBar");
        searchField.setBorder(null);
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField)
                .addContainerGap())
        );

        searchButton.setText("Search");
        searchButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout SearchToolLayout = new javax.swing.GroupLayout(SearchTool);
        SearchTool.setLayout(SearchToolLayout);
        SearchToolLayout.setHorizontalGroup(
            SearchToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchToolLayout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SearchToolLayout.setVerticalGroup(
            SearchToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchToolLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SearchToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(211, 235, 221));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(224, 199));

        jPanel1.setBackground(new java.awt.Color(211, 235, 221));

        swm_panel.add(swm);
        swm_panel.setBackground(new java.awt.Color(218, 249, 226));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(swm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(swm_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout upperPLayout = new javax.swing.GroupLayout(upperP);
        upperP.setLayout(upperPLayout);
        upperPLayout.setHorizontalGroup(
            upperPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(upperPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        upperPLayout.setVerticalGroup(
            upperPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperPLayout.createSequentialGroup()
                        .addComponent(Calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        lowerP3.setBackground(new java.awt.Color(212, 235, 231));

        noteEditPanel.setBackground(new java.awt.Color(160, 198, 190));

        notepadGUI1.setVisible(true);

        javax.swing.GroupLayout noteEditPanelLayout = new javax.swing.GroupLayout(noteEditPanel);
        noteEditPanel.setLayout(noteEditPanelLayout);
        noteEditPanelLayout.setHorizontalGroup(
            noteEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noteEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notepadGUI1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        noteEditPanelLayout.setVerticalGroup(
            noteEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noteEditPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notepadGUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        addButton.setBackground(new java.awt.Color(193, 193, 193));
        addButton.setForeground(new java.awt.Color(47, 41, 41));
        addButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lowerP3Layout = new javax.swing.GroupLayout(lowerP3);
        lowerP3.setLayout(lowerP3Layout);
        lowerP3Layout.setHorizontalGroup(
            lowerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerP3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(noteEditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lowerP3Layout.setVerticalGroup(
            lowerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerP3Layout.createSequentialGroup()
                .addGroup(lowerP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerP3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(noteEditPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPLayout = new javax.swing.GroupLayout(rightP);
        rightP.setLayout(rightPLayout);
        rightPLayout.setHorizontalGroup(
            rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upperP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightPLayout.setVerticalGroup(
            rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upperP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        JPanel selectAdd = new JPanel();
        selectAdd.setLayout(new GridLayout(2, 1)); // 2 rows, 1 column

        // Create buttons
        JButton addTask = new JButton("add Task");
        addTask.setFont(new Font("Comic Sans MS", 0, 16));
        addTask.setBackground(Color.WHITE);
        addTask.addActionListener((ActionEvent e) -> {
            panel.removeAll();
            round += 1;
            TaskPattern task = new TaskPattern(this, round, new TaskData());
            tasklist.add(task);
            taskdatalist.add(task.getdata());
            System.out.println("tasklist num : "+tasklist.size());
            System.out.println("taskdata num : "+taskdatalist.size());
            
            addTaskToPanel();
            
            Window window = SwingUtilities.getWindowAncestor(addTask);
            if (window != null) {
                window.dispose();
            }
        });
        selectAdd.add(addTask);

        JButton addNote = new JButton("add Note");
        addNote.setFont(new Font("Comic Sans MS", 0, 16));
        addNote.setBackground(Color.WHITE);
        addNote.addActionListener((ActionEvent e) -> {
            
            notepadGUI1.file.newFile();
            
            Window window = SwingUtilities.getWindowAncestor(addNote);
            if (window != null) {
                window.dispose();
            }
        });
        selectAdd.add(addNote);

        JDialog dialog = new JDialog(this, "Add...", true);
        dialog.add(selectAdd);

        dialog.setLocationRelativeTo(null);

        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        savefile();
    }//GEN-LAST:event_formWindowClosing

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        String searchText = searchField.getText().toLowerCase();
        model.removeAllElements(); //clear model
        if (!searchText.isEmpty()) {
            taskPopup.show(searchField, 0, searchField.getHeight());
            ArrayList<TaskData> matchingTasks = new ArrayList<>(); //new ArtrayList to store matching task
                    for (TaskData task : taskdatalist) {   //task = object in tasks -> loop to compare searchText-task
                        if (task.gettaskname().toLowerCase().contains(searchText) || (task.getYear()+"-"+task.getMonth()+"-"+task.getDate()).contains(searchText)) { //1.check from name 2.check from duedate -> use (.contains(searchText))
                            matchingTasks.add(task); //if match add match-task to matchingTasks-ArrayList
                        }
                    }
                    Collections.sort(matchingTasks, new Comparator<TaskData>() {                    //Sort matchingTask // Comparator is filter -> sort(ArrayList, filter)
                        public int compare(TaskData t1, TaskData t2) {                                  // filter -> show task with 1st.closer name -> 2nd.closer due date
                        char firstLetter1 = t1.gettaskname().toLowerCase().charAt(0);           //first letter of task name
                        char firstLetter2 = t2.gettaskname().toLowerCase().charAt(0);
                            
                        if (firstLetter1 == searchText.charAt(0) && firstLetter2 != searchText.charAt(0)) {         //task1 closer than task2 -> come first
                            return -1;
                        } else if (firstLetter1 != searchText.charAt(0) && firstLetter2 == searchText.charAt(0)) {  //task 2 closer than task1
                            return 1;
                        } else {
                            return (t1.getYear()+"-"+t1.getMonth()+"-"+t1.getDate()).compareTo(t2.getYear()+"-"+t2.getMonth()+"-"+t2.getDate()); // same, compare by due date
                        }
                    }
                    });
                    for (TaskData task : matchingTasks) { //task from matchingTasks -> put task in model and model->list->scrollpane to show in gui
                        model.addElement(task.gettaskname() + " - Due : " + (task.getYear()+"-"+task.getMonth()+"-"+task.getDate()));; //add("name - Due: xxxx-xx-xx)
                    }
        }
        else{
            taskPopup.setVisible(false); //not type anything -> hide
        }
        revalidate(); //to refresh
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllJFrame().setVisible(true);
            }
        });
    }
    public void addTaskToPanel() {
        if (tasklist.size() > 1) {
                numRow = tasklist.size() ;
                panel.setLayout(new GridLayout(numRow, numCol));
                System.out.println("numRow : "+numRow + ", numCol : "+numCol);
                //new edit krub
                for (int i = 0; i < tasklist.size(); i++) {
                    panel.add(tasklist.get(i));
        }
                
            }
            else if (tasklist.size() == 1) {
                panel.add(tasklist.get(0));
            }
            else{
                System.out.println(numRow);
            }
            panel.revalidate();
            panel.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calendar;
    private decorClass.RoundedPanel CalendarRoundPanel;
    private javax.swing.JPanel SearchTool;
    private decorClass.CircleButton addButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftP;
    private javax.swing.JPanel lowerP3;
    private decorClass.RoundedPanel noteEditPanel;
    private NotePad.NotepadGUI notepadGUI1;
    private javax.swing.JPanel p;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel rightP;
    private decorClass.RoundedButton searchButton;
    private javax.swing.JTextField searchField;
    private decorClass.RoundedPanel searchPanel;
    private time.Stopwatch stopwatch1;
    private javax.swing.JList<String> suggestionList;
    private javax.swing.JScrollPane suggestionScrollPane;
    private javax.swing.JPanel swm_panel;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JPopupMenu taskPopup;
    private javax.swing.JPanel timerPanel;
    private javax.swing.JPanel todoPanel;
    private javax.swing.JScrollPane todoScroll;
    private javax.swing.JPanel upperP;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void savefile() {
        AllData saveall = new AllData();
        saveall.setTaskdatalist(taskdatalist);

        try (ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oout.writeObject(saveall);
            System.out.println("successfully writing file");
        } catch (IOException e) {
            System.err.println("Error writing file");
            e.printStackTrace();
        }
    }

    @Override
    public void loadfile() {
        
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream oin = new ObjectInputStream(fileIn)) {
            AllData readSave = (AllData) oin.readObject();
            System.out.println("Object read");
            tasklist = new ArrayList();
            taskdatalist = readSave.getTaskdatalist();
            recreateTask();
            
        } catch (Exception e) {
            System.out.println("not found previous file");
            
            tasklist = new ArrayList();
            taskdatalist = new ArrayList();
        }
    }
}
