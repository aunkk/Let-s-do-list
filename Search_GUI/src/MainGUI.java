import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class MainGUI extends javax.swing.JFrame {
    ArrayList<Task> tasks; //object tasks from class Task
    DefaultListModel<String> model;
    
    public MainGUI() {
        initComponents();
        taskPopup.add(p); //add panel to taskPopup
        
        tasks = new ArrayList<>(); //tasks is arrayList to store task
        tasks.add(new Task("do homework", "2024-04-01")); // Example task data
        tasks.add(new Task("clean house", "2024-04-02")); // Example task data
        tasks.add(new Task("OOP project", "2024-05-01")); // Example task data
        tasks.add(new Task("FE test", "2024-03-02")); // Example task data
        tasks.add(new Task("business project", "2024-05-02"));
        tasks.add(new Task("my birthday!", "2024-05-03"));
        tasks.add(new Task("go vacation", "2024-05-30"));
        tasks.add(new Task("midterm", "2024-06-02"));
        tasks.add(new Task("prob quiz#1", "2024-06-02"));
        tasks.add(new Task("prob quiz#2", "2024-12-02"));
        tasks.add(new Task("prob quiz#3", "2024-12-02"));
        tasks.add(new Task("prob quiz#4", "2024-12-02"));
        tasks.add(new Task("data structure homework", "2024-11-02"));
        tasks.add(new Task("business quiz", "2024-11-05"));
        tasks.add(new Task("my cat's birthday!", "2024-06-22"));
        tasks.add(new Task("go shopping", "2024-12-02"));
        tasks.add(new Task("study for midterm", "2024-12-02"));
        tasks.add(new Task("math quiz", "2024-12-02"));
        
        
        model = new DefaultListModel<>(); // create model
        suggestionList.setModel(model); //put model in list
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p = new javax.swing.JPanel();
        suggestionScrollPane = new javax.swing.JScrollPane();
        suggestionList = new javax.swing.JList<>();
        taskPopup = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();

        suggestionList.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        suggestionScrollPane.setViewportView(suggestionList);

        javax.swing.GroupLayout pLayout = new javax.swing.GroupLayout(p);
        p.setLayout(pLayout);
        pLayout.setHorizontalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suggestionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );
        pLayout.setVerticalGroup(
            pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suggestionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        taskPopup.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N

        tf.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    private void tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfKeyReleased
        String searchText = tf.getText().toLowerCase();
        model.removeAllElements(); //clear model
        if (!searchText.isEmpty()) {
            taskPopup.show(tf, 0, tf.getHeight());
            ArrayList<Task> matchingTasks = new ArrayList<>(); //new ArtrayList to store matching task
                    for (Task task : tasks) {   //task = object in tasks -> loop to compare searchText-task
                        if (task.getName().toLowerCase().contains(searchText) || task.getDueDate().contains(searchText)) { //1.check from name 2.check from duedate -> use (.contains(searchText))
                            matchingTasks.add(task); //if match add match-task to matchingTasks-ArrayList
                        }
                    }
                    Collections.sort(matchingTasks, new Comparator<Task>() {                    //Sort matchingTask // Comparator is filter -> sort(ArrayList, filter)
                        public int compare(Task t1, Task t2) {                                  // filter -> show task with 1st.closer name -> 2nd.closer due date
                        char firstLetter1 = t1.getName().toLowerCase().charAt(0);           //first letter of task name
                        char firstLetter2 = t2.getName().toLowerCase().charAt(0);
                            
                        if (firstLetter1 == searchText.charAt(0) && firstLetter2 != searchText.charAt(0)) {         //task1 closer than task2 -> come first
                            return -1;
                        } else if (firstLetter1 != searchText.charAt(0) && firstLetter2 == searchText.charAt(0)) {  //task 2 closer than task1
                            return 1;
                        } else {
                            return t1.getDueDate().compareTo(t2.getDueDate()); // same, compare by due date
                        }
                    }
                    });
                    for (Task task : matchingTasks) { //task from matchingTasks -> put task in model and model->list->scrollpane to show in gui
                        model.addElement(task.getName() + " - Due : " + task.getDueDate()); //add("name - Due: xxxx-xx-xx)
                    }
        }
        else{
            taskPopup.setVisible(false); //not type anything -> hide
        }
        revalidate(); //to refresh
    }//GEN-LAST:event_tfKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel p;
    private javax.swing.JList<String> suggestionList;
    private javax.swing.JScrollPane suggestionScrollPane;
    private javax.swing.JPopupMenu taskPopup;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
