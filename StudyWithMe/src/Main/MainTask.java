package Main;

//import *;
import decorClass.*;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.text.*;


public class MainTask extends javax.swing.JFrame {
    private static String taskname;
    private String dmy;
    private String description;
    private static int state;
    private HashMap taskData = new HashMap(); //date,state,name,des
    
    public MainTask() {
        initComponents();
        
    }
    
    public static void setTitleName(String name){
        taskname = name;
    }
    public static void setStatus(int status){
        state = status;
    }
    public HashMap getTaskData() {return taskData;}

    public String getTaskDate() {return (String)taskData.get("date");}
    public int getTaskState() {return (int)taskData.get("state");}
    public String getTaskName() {return (String)taskData.get("name");}
    public String getTaskDes() {return (String)taskData.get("des");}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new RoundedPanel(50, 50);
        taskPattern1 = new decorClass.TaskPattern();
        roundedPanel1 = new decorClass.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        datePanel = new decorClass.RoundedPanel();
        dateField = new javax.swing.JTextField();
        monthPanel = new decorClass.RoundedPanel();
        monthField = new javax.swing.JTextField();
        yearPanel = new decorClass.RoundedPanel();
        yearField = new javax.swing.JTextField();
        doneButton = new decorClass.RoundedButton();
        EditorPanel = new decorClass.RoundedPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextArea();
        roundedPanel5 = new decorClass.RoundedPanel();
        DuedateBox = new javax.swing.JCheckBox();

        jTextArea1.setBackground(new java.awt.Color(221, 221, 221));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(221, 221, 221));

        jPanel1.setBackground(new java.awt.Color(133, 210, 203));

        roundedPanel1.setBackground(new java.awt.Color(146, 203, 228));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 70, 85));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Due Date");

        datePanel.setBackground(new java.awt.Color(175, 222, 242));

        dateField.setBackground(new java.awt.Color(175, 222, 242));
        dateField.setColumns(2);
        dateField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        dateField.setForeground(new java.awt.Color(69, 103, 150));
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setText("DD");
        dateField.setBorder(null);
        dateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        monthPanel.setBackground(new java.awt.Color(175, 222, 242));

        monthField.setBackground(new java.awt.Color(175, 222, 242));
        monthField.setColumns(2);
        monthField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        monthField.setForeground(new java.awt.Color(69, 103, 150));
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.setText("MM");
        monthField.setBorder(null);
        monthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout monthPanelLayout = new javax.swing.GroupLayout(monthPanel);
        monthPanel.setLayout(monthPanelLayout);
        monthPanelLayout.setHorizontalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        monthPanelLayout.setVerticalGroup(
            monthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField)
                .addContainerGap())
        );

        yearPanel.setBackground(new java.awt.Color(175, 222, 242));

        yearField.setBackground(new java.awt.Color(175, 222, 242));
        yearField.setColumns(4);
        yearField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        yearField.setForeground(new java.awt.Color(69, 103, 150));
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.setText("YYYY");
        yearField.setBorder(null);
        yearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout yearPanelLayout = new javax.swing.GroupLayout(yearPanel);
        yearPanel.setLayout(yearPanelLayout);
        yearPanelLayout.setHorizontalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yearPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        yearPanelLayout.setVerticalGroup(
            yearPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yearPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yearField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        doneButton.setBackground(new java.awt.Color(86, 169, 133));
        doneButton.setForeground(new java.awt.Color(37, 74, 58));
        doneButton.setText("Done");
        doneButton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        EditorPanel.setBackground(new java.awt.Color(65, 156, 178));

        jScrollPane2.setBorder(null);

        DescriptionText.setBackground(new java.awt.Color(65, 156, 178));
        DescriptionText.setColumns(20);
        DescriptionText.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        DescriptionText.setForeground(new java.awt.Color(30, 65, 85));
        DescriptionText.setRows(5);
        DescriptionText.setText("Description...");
        DescriptionText.setBorder(null);
        DescriptionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescriptionTextMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DescriptionText);

        javax.swing.GroupLayout EditorPanelLayout = new javax.swing.GroupLayout(EditorPanel);
        EditorPanel.setLayout(EditorPanelLayout);
        EditorPanelLayout.setHorizontalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        EditorPanelLayout.setVerticalGroup(
            EditorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );

        roundedPanel5.setBackground(new java.awt.Color(104, 174, 216));

        DuedateBox.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        DuedateBox.setForeground(new java.awt.Color(24, 86, 123));
        DuedateBox.setText("Due Date");
        DuedateBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DuedateBoxStateChanged(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DuedateBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DuedateBox, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taskPattern1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(EditorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE))
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskPattern1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        String date, month, year;
        date = dateField.getText();
        if (monthField.getText().length() == 1) {
            month = "0"+monthField.getText();
        }else {month = monthField.getText();}
        year = yearField.getText();
        dmy = date + "/" + month + "/" + year;

        //taskname = TaskPattern.getTitleName();
        //taskname = TaskPattern.taskTitle.getText();

        description = DescriptionText.getText();

        System.out.println("-----------");
        System.out.println(dmy);
        System.out.println(state);
        System.out.println(taskname);
        System.out.println(description);
        taskData.put("date", dmy);
        taskData.put("state", state);
        taskData.put("name", taskname);
        taskData.put("des", description);
        System.out.println(taskData.entrySet());

        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void DescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescriptionTextMouseClicked
        if ("Description...".equals(DescriptionText.getText())){
            DescriptionText.selectAll();
        }
    }//GEN-LAST:event_DescriptionTextMouseClicked

    private void dateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFieldMouseClicked
        dateField.selectAll();
    }//GEN-LAST:event_dateFieldMouseClicked

    private void yearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseClicked
        yearField.selectAll();
    }//GEN-LAST:event_yearFieldMouseClicked

    private void monthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseClicked
        monthField.selectAll();
    }//GEN-LAST:event_monthFieldMouseClicked

    private void DuedateBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DuedateBoxStateChanged
        if (DuedateBox.isSelected()) {
            dateField.setEditable(true);
            monthField.setEditable(true);
            yearField.setEditable(true);
            
            dateField.setBackground(new Color(175,222,242));
            datePanel.setBackground(new Color(175,222,242));
            
            monthField.setBackground(new Color(175,222,242));
            monthPanel.setBackground(new Color(175,222,242));
            
            yearField.setBackground(new Color(175,222,242));
            yearPanel.setBackground(new Color(175,222,242));
            
            dateField.setForeground(new java.awt.Color(69, 103, 150));
            monthField.setForeground(new java.awt.Color(69, 103, 150));
            yearField.setForeground(new java.awt.Color(69, 103, 150));
        }
        else{
            dateField.setEditable(false);
            monthField.setEditable(false);
            yearField.setEditable(false);
            
            dateField.setBackground(new Color(191,223,237));
            datePanel.setBackground(new Color(191,223,237));
            
            monthField.setBackground(new Color(191,223,237));
            monthPanel.setBackground(new Color(191,223,237));
            
            yearField.setBackground(new Color(191,223,237));
            yearPanel.setBackground(new Color(191,223,237));
            
            dateField.setForeground(new java.awt.Color(111,144,189));
            monthField.setForeground(new java.awt.Color(111,144,189));
            yearField.setForeground(new java.awt.Color(111,144,189));
        }
    }//GEN-LAST:event_DuedateBoxStateChanged

    
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
            java.util.logging.Logger.getLogger(MainTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionText;
    private javax.swing.JCheckBox DuedateBox;
    private decorClass.RoundedPanel EditorPanel;
    private javax.swing.JTextField dateField;
    private decorClass.RoundedPanel datePanel;
    private decorClass.RoundedButton doneButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField monthField;
    private decorClass.RoundedPanel monthPanel;
    private decorClass.RoundedPanel roundedPanel1;
    private decorClass.RoundedPanel roundedPanel5;
    private decorClass.TaskPattern taskPattern1;
    private javax.swing.JTextField yearField;
    private decorClass.RoundedPanel yearPanel;
    // End of variables declaration//GEN-END:variables
}
