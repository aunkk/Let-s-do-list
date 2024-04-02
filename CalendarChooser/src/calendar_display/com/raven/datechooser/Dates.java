package com.raven.datechooser;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JPanel;
import calendar_display.Main;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;
import calendar_display.Main;

public final class Dates extends javax.swing.JPanel {
    static int state;
    

    private Event event;
    private final int MONTH;
    private final int YEAR;
    private final int DAY;
    private int m;
    private int y;
    private int selectDay = 0;
    private int startDate;
    private int max_of_month;
    private JPanel chooser;
    private com.raven.datechooser.DateChooser dateChooser1;
    private HashMap<String , ArrayList> datecalendar;
    private ArrayList<String> list;

    
    

        public Dates() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
        chooser = new JPanel();
        datecalendar= new HashMap<>();
        list = new ArrayList<>();
        list.add("02-April-2024");
        list.add("17-April-2024");
        list.add("30-May-2024");
        list.add("23-July-2024");
        list.add("17-June-2024");
        
       
        
//        strDateReturn = new strDateReturn
                
        
    }
    
    public static void setState(String status){
        if (status.equals("available")){
            Dates.state = 1;
        }else if(status.equals(("not available"))){
            Dates.state = 0;
        }
    }
    
    public static int getState(){
        return Dates.state;
    }
    
    
 
    public void showDate(int month, int year, SelectedDate select) {
        m = month;
        y = year;
        // selectDay = 0;
        Calendar cd = Calendar.getInstance();
        cd.set(year, month - 1, 1);
        int start = cd.get(Calendar.DAY_OF_WEEK);
        max_of_month = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (start == 1) {
            start += 7;
        }
        clear();
        start += 5;
        startDate = start;
        for (int i = 1; i <= max_of_month; i++) {
            Button cmd = (Button) getComponent(start);
            cmd.setColorSelected(getForeground());
            cmd.setText(i + "");
            if (i == DAY && month == MONTH && year == YEAR) {
                cmd.setBackground(new Color(224, 214, 229));
            } else {
                cmd.setBackground(Color.WHITE);
            }
            if (i == select.getDay() && month == select.getMonth() && year == select.getYear()) {
                cmd.setBackground(getForeground());
                cmd.setForeground(new Color(255, 255, 255));
            }
            start++;
        }
    }

    private void clear() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }

    public void clearSelected() {
        for (int i = 7; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            if (MONTH == m && y == YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText()) == DAY) {
                cmd.setBackground(new Color(224, 214, 229));
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            } else {
                cmd.setBackground(Color.WHITE);
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            }
        }
        selectDay = 0;
    }
    
    
    private void addEvent() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }

    public void setSelected(int index) {
        selectDay = index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMo = new com.raven.datechooser.Button();
        cmdTu = new com.raven.datechooser.Button();
        cmdWe = new com.raven.datechooser.Button();
        cmdTh = new com.raven.datechooser.Button();
        cmdFr = new com.raven.datechooser.Button();
        cmdSa = new com.raven.datechooser.Button();
        cmdSu = new com.raven.datechooser.Button();
        cmd1 = new com.raven.datechooser.Button();
        cmd2 = new com.raven.datechooser.Button();
        cmd3 = new com.raven.datechooser.Button();
        cmd4 = new com.raven.datechooser.Button();
        cmd5 = new com.raven.datechooser.Button();
        cmd6 = new com.raven.datechooser.Button();
        cmd7 = new com.raven.datechooser.Button();
        cmd8 = new com.raven.datechooser.Button();
        cmd9 = new com.raven.datechooser.Button();
        cmd10 = new com.raven.datechooser.Button();
        cmd11 = new com.raven.datechooser.Button();
        cmd12 = new com.raven.datechooser.Button();
        cmd13 = new com.raven.datechooser.Button();
        cmd14 = new com.raven.datechooser.Button();
        cmd15 = new com.raven.datechooser.Button();
        cmd16 = new com.raven.datechooser.Button();
        cmd17 = new com.raven.datechooser.Button();
        cmd18 = new com.raven.datechooser.Button();
        cmd19 = new com.raven.datechooser.Button();
        cmd20 = new com.raven.datechooser.Button();
        cmd21 = new com.raven.datechooser.Button();
        cmd22 = new com.raven.datechooser.Button();
        cmd23 = new com.raven.datechooser.Button();
        cmd24 = new com.raven.datechooser.Button();
        cmd25 = new com.raven.datechooser.Button();
        cmd26 = new com.raven.datechooser.Button();
        cmd27 = new com.raven.datechooser.Button();
        cmd28 = new com.raven.datechooser.Button();
        cmd29 = new com.raven.datechooser.Button();
        cmd30 = new com.raven.datechooser.Button();
        cmd31 = new com.raven.datechooser.Button();
        cmd32 = new com.raven.datechooser.Button();
        cmd33 = new com.raven.datechooser.Button();
        cmd34 = new com.raven.datechooser.Button();
        cmd35 = new com.raven.datechooser.Button();
        cmd36 = new com.raven.datechooser.Button();
        cmd37 = new com.raven.datechooser.Button();
        cmd38 = new com.raven.datechooser.Button();
        cmd39 = new com.raven.datechooser.Button();
        cmd40 = new com.raven.datechooser.Button();
        cmd41 = new com.raven.datechooser.Button();
        cmd42 = new com.raven.datechooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));

        cmdMo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdMo.setForeground(new java.awt.Color(118, 118, 118));
        cmdMo.setText("Mon");
        add(cmdMo);

        cmdTu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTu.setForeground(new java.awt.Color(118, 118, 118));
        cmdTu.setText("Tue");
        add(cmdTu);

        cmdWe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdWe.setForeground(new java.awt.Color(118, 118, 118));
        cmdWe.setText("Wed");
        add(cmdWe);

        cmdTh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdTh.setForeground(new java.awt.Color(118, 118, 118));
        cmdTh.setText("Thu");
        add(cmdTh);

        cmdFr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdFr.setForeground(new java.awt.Color(118, 118, 118));
        cmdFr.setText("Fri");
        add(cmdFr);

        cmdSa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSa.setForeground(new java.awt.Color(118, 118, 118));
        cmdSa.setText("Sat");
        add(cmdSa);

        cmdSu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        cmdSu.setForeground(new java.awt.Color(255, 1, 1));
        cmdSu.setText("Sun");
        add(cmdSu);

        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setName("day"); // NOI18N
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });
        add(cmd1);

        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setName("day"); // NOI18N
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });
        add(cmd2);

        cmd3.setForeground(new java.awt.Color(75, 75, 75));

        cmd3.setText("1");

        cmd3.setName("day");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });
        add(cmd3);

        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("2");
        cmd4.setName("day"); // NOI18N
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });
        add(cmd4);

        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("3");
        cmd5.setName("day"); // NOI18N
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });
        add(cmd5);

        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("4");
        cmd6.setName("day"); // NOI18N
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });
        add(cmd6);

        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("5");
        cmd7.setName("day"); // NOI18N
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });
        add(cmd7);

        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("6");
        cmd8.setName("day"); // NOI18N
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });
        add(cmd8);

        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("7");
        cmd9.setName("day"); // NOI18N
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });
        add(cmd9);

        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("8");
        cmd10.setName("day"); // NOI18N
        cmd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd10ActionPerformed(evt);
            }
        });
        add(cmd10);

        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("9");
        cmd11.setName("day"); // NOI18N
        cmd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd11ActionPerformed(evt);
            }
        });
        add(cmd11);

        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("10");
        cmd12.setName("day"); // NOI18N
        cmd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd12ActionPerformed(evt);
            }
        });
        add(cmd12);

        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("11");
        cmd13.setName("day"); // NOI18N
        cmd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd13ActionPerformed(evt);
            }
        });
        add(cmd13);

        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("12");
        cmd14.setName("day"); // NOI18N
        cmd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd14ActionPerformed(evt);
            }
        });
        add(cmd14);

        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("13");
        cmd15.setName("day"); // NOI18N
        cmd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd15ActionPerformed(evt);
            }
        });
        add(cmd15);

        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("14");
        cmd16.setName("day"); // NOI18N
        cmd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd16ActionPerformed(evt);
            }
        });
        add(cmd16);

        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("15");
        cmd17.setName("day"); // NOI18N
        cmd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd17ActionPerformed(evt);
            }
        });
        add(cmd17);

        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("16");
        cmd18.setName("day"); // NOI18N
        cmd18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd18ActionPerformed(evt);
            }
        });
        add(cmd18);

        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("17");
        cmd19.setName("day"); // NOI18N
        cmd19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd19ActionPerformed(evt);
            }
        });
        add(cmd19);

        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("18");
        cmd20.setName("day"); // NOI18N
        cmd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd20ActionPerformed(evt);
            }
        });
        add(cmd20);

        cmd21.setForeground(new java.awt.Color(75, 75, 75));
        cmd21.setText("19");
        cmd21.setName("day"); // NOI18N
        cmd21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd21ActionPerformed(evt);
            }
        });
        add(cmd21);

        cmd22.setForeground(new java.awt.Color(75, 75, 75));
        cmd22.setText("20");
        cmd22.setName("day"); // NOI18N
        cmd22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd22ActionPerformed(evt);
            }
        });
        add(cmd22);

        cmd23.setForeground(new java.awt.Color(75, 75, 75));
        cmd23.setText("21");
        cmd23.setName("day"); // NOI18N
        cmd23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd23ActionPerformed(evt);
            }
        });
        add(cmd23);

        cmd24.setForeground(new java.awt.Color(75, 75, 75));
        cmd24.setText("22");
        cmd24.setName("day"); // NOI18N
        cmd24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd24ActionPerformed(evt);
            }
        });
        add(cmd24);

        cmd25.setForeground(new java.awt.Color(75, 75, 75));
        cmd25.setText("23");
        cmd25.setName("day"); // NOI18N
        cmd25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd25ActionPerformed(evt);
            }
        });
        add(cmd25);

        cmd26.setForeground(new java.awt.Color(75, 75, 75));
        cmd26.setText("24");
        cmd26.setName("day"); // NOI18N
        cmd26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd26ActionPerformed(evt);
            }
        });
        add(cmd26);

        cmd27.setForeground(new java.awt.Color(75, 75, 75));
        cmd27.setText("25");
        cmd27.setName("day"); // NOI18N
        cmd27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd27ActionPerformed(evt);
            }
        });
        add(cmd27);

        cmd28.setForeground(new java.awt.Color(75, 75, 75));
        cmd28.setText("26");
        cmd28.setName("day"); // NOI18N
        cmd28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd28ActionPerformed(evt);
            }
        });
        add(cmd28);

        cmd29.setForeground(new java.awt.Color(75, 75, 75));
        cmd29.setText("27");
        cmd29.setName("day"); // NOI18N
        cmd29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd29ActionPerformed(evt);
            }
        });
        add(cmd29);

        cmd30.setForeground(new java.awt.Color(75, 75, 75));
        cmd30.setText("28");
        cmd30.setName("day"); // NOI18N
        cmd30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd30ActionPerformed(evt);
            }
        });
        add(cmd30);

        cmd31.setForeground(new java.awt.Color(75, 75, 75));
        cmd31.setText("29");
        cmd31.setName("day"); // NOI18N
        cmd31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd31ActionPerformed(evt);
            }
        });
        add(cmd31);

        cmd32.setForeground(new java.awt.Color(75, 75, 75));
        cmd32.setText("30");
        cmd32.setName("day"); // NOI18N
        cmd32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd32ActionPerformed(evt);
            }
        });
        add(cmd32);

        cmd33.setForeground(new java.awt.Color(75, 75, 75));
        cmd33.setText("31");
        cmd33.setName("day"); // NOI18N
        cmd33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd33ActionPerformed(evt);
            }
        });
        add(cmd33);

        cmd34.setForeground(new java.awt.Color(75, 75, 75));
        cmd34.setName("day"); // NOI18N
        cmd34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd34ActionPerformed(evt);
            }
        });
        add(cmd34);

        cmd35.setForeground(new java.awt.Color(75, 75, 75));
        cmd35.setName("day"); // NOI18N
        cmd35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd35ActionPerformed(evt);
            }
        });
        add(cmd35);

        cmd36.setForeground(new java.awt.Color(75, 75, 75));
        cmd36.setName("day"); // NOI18N
        cmd36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd36ActionPerformed(evt);
            }
        });
        add(cmd36);

        cmd37.setForeground(new java.awt.Color(75, 75, 75));
        cmd37.setName("day"); // NOI18N
        cmd37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd37ActionPerformed(evt);
            }
        });
        add(cmd37);

        cmd38.setForeground(new java.awt.Color(75, 75, 75));
        cmd38.setName("day"); // NOI18N
        cmd38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd38ActionPerformed(evt);
            }
        });
        add(cmd38);

        cmd39.setForeground(new java.awt.Color(75, 75, 75));
        cmd39.setName("day"); // NOI18N
        cmd39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd39ActionPerformed(evt);
            }
        });
        add(cmd39);

        cmd40.setForeground(new java.awt.Color(75, 75, 75));
        cmd40.setName("day"); // NOI18N
        cmd40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd40ActionPerformed(evt);
            }
        });
        add(cmd40);

        cmd41.setForeground(new java.awt.Color(75, 75, 75));
        cmd41.setName("day"); // NOI18N
        cmd41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd41ActionPerformed(evt);
            }
        });
        add(cmd41);

        cmd42.setForeground(new java.awt.Color(75, 75, 75));
        cmd42.setName("day"); // NOI18N
        cmd42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd42ActionPerformed(evt);
            }
        });
        add(cmd42);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd17ActionPerformed
        // TODO add your handling code here:
        String scmd17 = cmd17.getText()+ "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
//        System.out.println(scmd17);
//    datecalendar.put(cmd17, value);
        ArrayList test = new ArrayList();
        test.add("task jojo");
        putCalendar(scmd17, test);//taskList.getdmy()
//        String taskobj = "17-April-2024";
//        for(String i: list){
//            if(scmd17.equals(taskobj)){
//                System.out.println("Open task!!!");
//            }
//        }
    }//GEN-LAST:event_cmd17ActionPerformed
        
    
    private void putCalendar(String scmd, ArrayList value){
        String x = " ";
//        System.out.println(scmd.indexOf("-"));
        if(scmd.indexOf("/") == 0){
            System.out.println(scmd);
        }else{
            for(String i: list){
                if(scmd.equals(i)){
                    datecalendar.put(scmd, value);
                    System.out.println("Open task!!!");
                }
            }
            
        }
        System.out.println(datecalendar);
    }
    
    
    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed

    String scmd5 = String.format("%02d", Integer.parseInt(cmd5.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
    System.out.println(scmd5);

    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
        // TODO add your handling code here:
         String scmd3 = String.format("%02d", Integer.parseInt(cmd3.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd3);
     
    
        
        
    }//GEN-LAST:event_cmd3ActionPerformed
    
    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        // TODO add your handlin"g code here:
        String scmd4 = String.format("%02d", Integer.parseInt(cmd4.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd4);
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
        // TODO add your handling code here:
        String scmd6 = String.format("%02d", Integer.parseInt(cmd6.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd6);
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        // TODO add your handling code here:
         String scmd7 = String.format("%02d", Integer.parseInt(cmd7.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
         System.out.println(scmd7);
         
    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        // TODO add your handling code here:
//        System.out.println(cmd1.getText());
        String scmd1 = String.format("%02d", Integer.parseInt(cmd1.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
         System.out.println(scmd1);
    }//GEN-LAST:event_cmd1ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
        // TODO add your handling code here:
      String scmd2 = String.format("%02d", Integer.parseInt(cmd2.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd2);
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
        // TODO add your handling code here:
         String scmd8 = String.format("%02d", Integer.parseInt(cmd8.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd8);
    }//GEN-LAST:event_cmd8ActionPerformed

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        // TODO add your handling code here:
    String scmd9 = String.format("%02d", Integer.parseInt(cmd9.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
    System.out.println(scmd9);;
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd10ActionPerformed
        // TODO add your handling code here:
    String scmd10 = String.format("%02d", Integer.parseInt(cmd10.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
    System.out.println(scmd10);
    
    }//GEN-LAST:event_cmd10ActionPerformed

    private void cmd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd11ActionPerformed
        // TODO add your handling code here:
      String scmd11 = String.format("%02d", Integer.parseInt(cmd11.getText()))
              + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd11);
    }//GEN-LAST:event_cmd11ActionPerformed

    private void cmd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd12ActionPerformed
        // TODO add your handling code here:
        String scmd12 = String.format("%02d", Integer.parseInt(cmd12.getText()))
                + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd12);
    }//GEN-LAST:event_cmd12ActionPerformed

    private void cmd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd13ActionPerformed
        // TODO add your handling code here:
        String scmd13 = String.format("%02d", Integer.parseInt(cmd13.getText()))
                + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd13);
    }//GEN-LAST:event_cmd13ActionPerformed

    private void cmd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd14ActionPerformed
        // TODO add your handling code here:
        String scmd14 = String.format("%02d", Integer.parseInt(cmd14.getText()))
                + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd14);
    }//GEN-LAST:event_cmd14ActionPerformed

    private void cmd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd15ActionPerformed
        // TODO add your handling code here:
       String scmd15 = String.format("%02d", Integer.parseInt(cmd15.getText()))
               + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd15);
    }//GEN-LAST:event_cmd15ActionPerformed

    private void cmd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd16ActionPerformed
        // TODO add your handling code here:
       String scmd16 = String.format("%02d", Integer.parseInt(cmd16.getText())) + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd16);
    }//GEN-LAST:event_cmd16ActionPerformed

    private void cmd18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd18ActionPerformed
        // TODO add your handling code here:
       String scmd18 = cmd18.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd18);
    }//GEN-LAST:event_cmd18ActionPerformed

    private void cmd19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd19ActionPerformed
        // TODO add your handling code here:
        String scmd19 = cmd19.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd19);
    }//GEN-LAST:event_cmd19ActionPerformed

    private void cmd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd20ActionPerformed
        // TODO add your handling code here:
        String scmd20 = cmd20.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd20);
    }//GEN-LAST:event_cmd20ActionPerformed

    private void cmd21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd21ActionPerformed
        // TODO add your handling code here:
        String scmd21 = cmd21.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd21);
    }//GEN-LAST:event_cmd21ActionPerformed

    private void cmd22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd22ActionPerformed
        // TODO add your handling code here:
        String scmd22 = cmd22.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd22);
        
    }//GEN-LAST:event_cmd22ActionPerformed

    private void cmd23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd23ActionPerformed
        // TODO add your handling code here:
        String scmd23 = cmd23.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
        System.out.println(scmd23);
    }//GEN-LAST:event_cmd23ActionPerformed

    private void cmd24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd24ActionPerformed
        // TODO add your handling code here:
        String scmd24 = cmd24.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd24);
    }//GEN-LAST:event_cmd24ActionPerformed

    private void cmd25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd25ActionPerformed
        // TODO add your handling code here:
       String scmd25 = cmd25.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd25);
    }//GEN-LAST:event_cmd25ActionPerformed

    private void cmd26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd26ActionPerformed
        // TODO add your handling code here:
        String scmd26 = cmd26.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd26);
    }//GEN-LAST:event_cmd26ActionPerformed

    private void cmd27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd27ActionPerformed
        // TODO add your handling code here:
        String scmd27 = cmd27.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd27);
    }//GEN-LAST:event_cmd27ActionPerformed

    private void cmd28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd28ActionPerformed
        // TODO add your handling code here:
        String scmd28 = cmd28.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd28);
    }//GEN-LAST:event_cmd28ActionPerformed

    private void cmd29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd29ActionPerformed
        // TODO add your handling code here:
        String scmd29 = cmd29.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd29);
    }//GEN-LAST:event_cmd29ActionPerformed

    private void cmd30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd30ActionPerformed
        // TODO add your handling code here:
        String scmd30 = cmd30.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd30);
    }//GEN-LAST:event_cmd30ActionPerformed

    private void cmd31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd31ActionPerformed
        // TODO add your handling code here:
       String scmd31 = cmd31.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd31);
    }//GEN-LAST:event_cmd31ActionPerformed

    private void cmd32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd32ActionPerformed
        // TODO add your handling code here:
          String scmd32 = cmd32.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd32);
    }//GEN-LAST:event_cmd32ActionPerformed

    private void cmd33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd33ActionPerformed
        // TODO add your handling code here:
        String scmd33 = cmd33.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd33);
        
        
//        return scmd33;
        
//          String scmd33 = cmd33.getText();
//        System.out.println(scmd33);
    }//GEN-LAST:event_cmd33ActionPerformed

    private void cmd34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd34ActionPerformed
        // TODO add your handling code here:
          String scmd34 = cmd34.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd34);
    }//GEN-LAST:event_cmd34ActionPerformed

    private void cmd35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd35ActionPerformed
        // TODO add your handling code here:
         String scmd35 = cmd35.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd35);
    }//GEN-LAST:event_cmd35ActionPerformed

    private void cmd36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd36ActionPerformed
        // TODO add your handling code here:
          String scmd36 = cmd36.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd36);
    }//GEN-LAST:event_cmd36ActionPerformed

    private void cmd37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd37ActionPerformed
        // TODO add your handling code here:
         String scmd37 = cmd37.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd37);
    }//GEN-LAST:event_cmd37ActionPerformed

    private void cmd38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd38ActionPerformed
        // TODO add your handling code here:
        String scmd38 = cmd38.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd38);
    }//GEN-LAST:event_cmd38ActionPerformed

    private void cmd39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd39ActionPerformed
        // TODO add your handling code here:
         String scmd39 = cmd39.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd39);
    }//GEN-LAST:event_cmd39ActionPerformed

    private void cmd40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd40ActionPerformed
        // TODO add your handling code here:
         String scmd40 = cmd40.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd40);
    }//GEN-LAST:event_cmd40ActionPerformed

    private void cmd41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd41ActionPerformed
        // TODO add your handling code here:
         String scmd41 = cmd41.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd41);
    }//GEN-LAST:event_cmd41ActionPerformed

    private void cmd42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd42ActionPerformed
        // TODO add your handling code here:
        String scmd42 = cmd42.getText() + "/" + Main.dateChooser1.getCmdMonth() + "/" + Main.dateChooser1.getCmdYear();
      System.out.println(scmd42);
    }//GEN-LAST:event_cmd42ActionPerformed
   
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.Button cmd1;
    private com.raven.datechooser.Button cmd10;
    private com.raven.datechooser.Button cmd11;
    private com.raven.datechooser.Button cmd12;
    private com.raven.datechooser.Button cmd13;
    private com.raven.datechooser.Button cmd14;
    private com.raven.datechooser.Button cmd15;
    private com.raven.datechooser.Button cmd16;
    private com.raven.datechooser.Button cmd17;
    private com.raven.datechooser.Button cmd18;
    private com.raven.datechooser.Button cmd19;
    private com.raven.datechooser.Button cmd2;
    private com.raven.datechooser.Button cmd20;
    private com.raven.datechooser.Button cmd21;
    private com.raven.datechooser.Button cmd22;
    private com.raven.datechooser.Button cmd23;
    private com.raven.datechooser.Button cmd24;
    private com.raven.datechooser.Button cmd25;
    private com.raven.datechooser.Button cmd26;
    private com.raven.datechooser.Button cmd27;
    private com.raven.datechooser.Button cmd28;
    private com.raven.datechooser.Button cmd29;
    private com.raven.datechooser.Button cmd3;
    private com.raven.datechooser.Button cmd30;
    private com.raven.datechooser.Button cmd31;
    private com.raven.datechooser.Button cmd32;
    public com.raven.datechooser.Button cmd33;
    private com.raven.datechooser.Button cmd34;
    private com.raven.datechooser.Button cmd35;
    private com.raven.datechooser.Button cmd36;
    private com.raven.datechooser.Button cmd37;
    private com.raven.datechooser.Button cmd38;
    private com.raven.datechooser.Button cmd39;
    private com.raven.datechooser.Button cmd4;
    private com.raven.datechooser.Button cmd40;
    private com.raven.datechooser.Button cmd41;
    private com.raven.datechooser.Button cmd42;
    private com.raven.datechooser.Button cmd5;
    private com.raven.datechooser.Button cmd6;
    private com.raven.datechooser.Button cmd7;
    private com.raven.datechooser.Button cmd8;
    private com.raven.datechooser.Button cmd9;
    private com.raven.datechooser.Button cmdFr;
    private com.raven.datechooser.Button cmdMo;
    private com.raven.datechooser.Button cmdSa;
    private com.raven.datechooser.Button cmdSu;
    private com.raven.datechooser.Button cmdTh;
    private com.raven.datechooser.Button cmdTu;
    private com.raven.datechooser.Button cmdWe;
    // End of variables declaration//GEN-END:variables

    public void next() {
        if (selectDay == max_of_month) {
            selectDay = 0;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 1);
        String n = cmd.getText();
        if (!n.equals("") && Integer.valueOf(n) <= max_of_month) {
            selectDay++;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void back() {
        if (selectDay <= 1) {
            selectDay = max_of_month + 1;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 1);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay--;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void up() {
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 7);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay -= 7;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void down() {
        if (getComponents().length > startDate - 1 + selectDay + 7) {
            JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 7);
            String n = cmd.getText();
            if (!n.equals("") && cmd.getName() != null) {
                selectDay += 7;
                event.execute(null, selectDay);
                cmd.setBackground(new Color(206, 110, 245));
            }
        }
    }

}