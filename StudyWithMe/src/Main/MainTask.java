package Main;

//import *;
import MainSWM.AllJFrame;
import decorClass.*;
import java.util.HashMap;
import javaant.TaskData;
import javax.swing.JFrame;
import javax.swing.text.*;


public class MainTask extends javax.swing.JFrame {
    private String taskname;
    private TaskPattern tp;
    private String date, month, year;
    private String description;
    private static int state;
    private TaskData data;
    private AllJFrame allj;
    
    public MainTask(AllJFrame allj, TaskData data, TaskPattern tp) {
        this.allj = allj;
        this.data = data;
        this.tp = tp;
        System.out.println("MT : task no. "+tp.getTaskOrder());
        System.out.println("[ testing MainTask ]");
        System.out.println(data.gettaskname());
        System.out.println(data.getdmy());
        System.out.println(data.getdes());
        initComponents();
        setVisible(true);
    }
    
    public void setTitleName(String name){
        taskname = name;
    }
    public static void setStatus(int status){
        state = status;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new RoundedPanel(50, 50);
        roundedPanel1 = new decorClass.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        roundedPanel2 = new decorClass.RoundedPanel();
        dateField = new javax.swing.JTextField();
        roundedPanel3 = new decorClass.RoundedPanel();
        monthField = new javax.swing.JTextField();
        roundedPanel4 = new decorClass.RoundedPanel();
        yearField = new javax.swing.JTextField();
        doneButton = new decorClass.RoundedButton();
        EditorPanel = new decorClass.RoundedPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        name = new javax.swing.JTextArea();

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

        roundedPanel2.setBackground(new java.awt.Color(175, 222, 242));

        dateField.setBackground(new java.awt.Color(175, 222, 242));
        dateField.setColumns(2);
        dateField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        dateField.setForeground(new java.awt.Color(69, 103, 150));
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateField.setText(data.getDate());
        dateField.setBorder(null);
        dateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundedPanel3.setBackground(new java.awt.Color(175, 222, 242));

        monthField.setBackground(new java.awt.Color(175, 222, 242));
        monthField.setColumns(2);
        monthField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        monthField.setForeground(new java.awt.Color(69, 103, 150));
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.setText(data.getMonth());
        monthField.setBorder(null);
        monthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monthField)
                .addContainerGap())
        );

        roundedPanel4.setBackground(new java.awt.Color(175, 222, 242));

        yearField.setBackground(new java.awt.Color(175, 222, 242));
        yearField.setColumns(4);
        yearField.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        yearField.setForeground(new java.awt.Color(69, 103, 150));
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.setText(data.getYear());
        yearField.setBorder(null);
        yearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
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
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        DescriptionText.setText(data.getdes());
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

        jPanel2.setOpaque(false);

        name.setColumns(20);
        name.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        name.setRows(5);
        name.setText(data.gettaskname());
        jScrollPane3.setViewportView(name);

        jPanel2.add(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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
        date = dateField.getText();
        month = monthField.getText();
        year = yearField.getText();

        taskname = name.getText();

        description = DescriptionText.getText();
        
        data.setstate(state);
        data.setDate(date);
        data.setMonth(month);
        data.setYear(year);
        data.settaskname(taskname);
        data.setdes(description);
        /*
        System.out.println("-----------");
        System.out.println(data.getdmy());
        System.out.println(state);
        System.out.println(taskname);
        System.out.println(description);
        */
        //tp.setTaskTitle(data.gettaskname());
        allj.addTaskdatalist(tp.getTaskOrder()-1, data);
        allj.recreateTask();
        //dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void DescriptionTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescriptionTextMouseClicked
        if ("Description...".equals(DescriptionText.getText())){
            DescriptionText.selectAll();
        }
    }//GEN-LAST:event_DescriptionTextMouseClicked

    private void dateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFieldMouseClicked
        DescriptionText.selectAll();
    }//GEN-LAST:event_dateFieldMouseClicked

    private void yearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseClicked
        yearField.selectAll();
    }//GEN-LAST:event_yearFieldMouseClicked

    private void monthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseClicked
        monthField.selectAll();
    }//GEN-LAST:event_monthFieldMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionText;
    private decorClass.RoundedPanel EditorPanel;
    private javax.swing.JTextField dateField;
    private decorClass.RoundedButton doneButton;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField monthField;
    private javax.swing.JTextArea name;
    private decorClass.RoundedPanel roundedPanel1;
    private decorClass.RoundedPanel roundedPanel2;
    private decorClass.RoundedPanel roundedPanel3;
    private decorClass.RoundedPanel roundedPanel4;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
