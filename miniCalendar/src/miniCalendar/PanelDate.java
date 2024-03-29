
package miniCalendar;

import java.awt.*;
import java.util.*;
import javax.swing.*;
public class PanelDate extends javax.swing.JLayeredPane {
    
    private int month;
    private int year;
    
    
    public PanelDate(int month, int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }
    public void init(){
        SUN.asTitle();
        MON.asTitle();
        TUE.asTitle();
        WED.asTitle();
        THU.asTitle();
        FRI.asTitle();
        SAT.asTitle();
        setDate();
    }
    
    private void setDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK)-1;
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for(Component com:getComponents()){
            Cells cell = (Cells) com;
            if (!cell.isTitle()){
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month-1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))){
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1);
                
            }
        }
    }
    private ToDay getToDay(){
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(new Date());
      return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SUN = new miniCalendar.Cells();
        MON = new miniCalendar.Cells();
        TUE = new miniCalendar.Cells();
        WED = new miniCalendar.Cells();
        THU = new miniCalendar.Cells();
        FRI = new miniCalendar.Cells();
        SAT = new miniCalendar.Cells();
        cells8 = new miniCalendar.Cells();
        cells9 = new miniCalendar.Cells();
        cells10 = new miniCalendar.Cells();
        cells11 = new miniCalendar.Cells();
        cells12 = new miniCalendar.Cells();
        cells13 = new miniCalendar.Cells();
        cells14 = new miniCalendar.Cells();
        cells15 = new miniCalendar.Cells();
        cells16 = new miniCalendar.Cells();
        cells17 = new miniCalendar.Cells();
        cells18 = new miniCalendar.Cells();
        cells19 = new miniCalendar.Cells();
        cells20 = new miniCalendar.Cells();
        cells21 = new miniCalendar.Cells();
        cells22 = new miniCalendar.Cells();
        cells23 = new miniCalendar.Cells();
        cells24 = new miniCalendar.Cells();
        cells25 = new miniCalendar.Cells();
        cells26 = new miniCalendar.Cells();
        cells27 = new miniCalendar.Cells();
        cells28 = new miniCalendar.Cells();
        cells29 = new miniCalendar.Cells();
        cells30 = new miniCalendar.Cells();
        cells31 = new miniCalendar.Cells();
        cells32 = new miniCalendar.Cells();
        cells33 = new miniCalendar.Cells();
        cells34 = new miniCalendar.Cells();
        cells35 = new miniCalendar.Cells();
        cells36 = new miniCalendar.Cells();
        cells37 = new miniCalendar.Cells();
        cells38 = new miniCalendar.Cells();
        cells39 = new miniCalendar.Cells();
        cells40 = new miniCalendar.Cells();
        cells41 = new miniCalendar.Cells();
        cells42 = new miniCalendar.Cells();
        cells43 = new miniCalendar.Cells();
        cells44 = new miniCalendar.Cells();
        cells45 = new miniCalendar.Cells();
        cells46 = new miniCalendar.Cells();
        cells47 = new miniCalendar.Cells();
        cells48 = new miniCalendar.Cells();
        cells49 = new miniCalendar.Cells();

        setBackground(new java.awt.Color(221, 221, 221));
        setLayout(new java.awt.GridLayout(7, 7, 1, 1));

        SUN.setBackground(new java.awt.Color(30, 30, 30));
        SUN.setForeground(new java.awt.Color(30, 30, 30));
        SUN.setText("SUN");
        SUN.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        SUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUNActionPerformed(evt);
            }
        });
        add(SUN);

        MON.setBackground(new java.awt.Color(30, 30, 30));
        MON.setForeground(new java.awt.Color(30, 30, 30));
        MON.setText("MON");
        MON.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(MON);

        TUE.setBackground(new java.awt.Color(30, 30, 30));
        TUE.setForeground(new java.awt.Color(30, 30, 30));
        TUE.setText("TUE");
        TUE.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(TUE);

        WED.setBackground(new java.awt.Color(30, 30, 30));
        WED.setForeground(new java.awt.Color(30, 30, 30));
        WED.setText("WED");
        WED.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(WED);

        THU.setBackground(new java.awt.Color(30, 30, 30));
        THU.setForeground(new java.awt.Color(30, 30, 30));
        THU.setText("THU");
        THU.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(THU);

        FRI.setBackground(new java.awt.Color(30, 30, 30));
        FRI.setForeground(new java.awt.Color(30, 30, 30));
        FRI.setText("FRI");
        FRI.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(FRI);

        SAT.setBackground(new java.awt.Color(30, 30, 30));
        SAT.setForeground(new java.awt.Color(30, 30, 30));
        SAT.setText("SAT");
        SAT.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        add(SAT);

        cells8.setBackground(new java.awt.Color(30, 30, 30));
        cells8.setForeground(new java.awt.Color(30, 30, 30));
        cells8.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells8);

        cells9.setBackground(new java.awt.Color(30, 30, 30));
        cells9.setForeground(new java.awt.Color(30, 30, 30));
        cells9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells9);

        cells10.setBackground(new java.awt.Color(30, 30, 30));
        cells10.setForeground(new java.awt.Color(30, 30, 30));
        cells10.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells10);

        cells11.setBackground(new java.awt.Color(30, 30, 30));
        cells11.setForeground(new java.awt.Color(30, 30, 30));
        cells11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells11);

        cells12.setBackground(new java.awt.Color(30, 30, 30));
        cells12.setForeground(new java.awt.Color(30, 30, 30));
        cells12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells12);

        cells13.setBackground(new java.awt.Color(30, 30, 30));
        cells13.setForeground(new java.awt.Color(30, 30, 30));
        cells13.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells13);

        cells14.setBackground(new java.awt.Color(30, 30, 30));
        cells14.setForeground(new java.awt.Color(30, 30, 30));
        cells14.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells14);

        cells15.setBackground(new java.awt.Color(30, 30, 30));
        cells15.setForeground(new java.awt.Color(30, 30, 30));
        cells15.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells15);

        cells16.setBackground(new java.awt.Color(30, 30, 30));
        cells16.setForeground(new java.awt.Color(30, 30, 30));
        cells16.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells16);

        cells17.setBackground(new java.awt.Color(30, 30, 30));
        cells17.setForeground(new java.awt.Color(30, 30, 30));
        cells17.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells17);

        cells18.setBackground(new java.awt.Color(30, 30, 30));
        cells18.setForeground(new java.awt.Color(30, 30, 30));
        cells18.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells18);

        cells19.setBackground(new java.awt.Color(30, 30, 30));
        cells19.setForeground(new java.awt.Color(30, 30, 30));
        cells19.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells19);

        cells20.setBackground(new java.awt.Color(30, 30, 30));
        cells20.setForeground(new java.awt.Color(30, 30, 30));
        cells20.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells20);

        cells21.setBackground(new java.awt.Color(30, 30, 30));
        cells21.setForeground(new java.awt.Color(30, 30, 30));
        cells21.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells21);

        cells22.setBackground(new java.awt.Color(30, 30, 30));
        cells22.setForeground(new java.awt.Color(30, 30, 30));
        cells22.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells22);

        cells23.setBackground(new java.awt.Color(30, 30, 30));
        cells23.setForeground(new java.awt.Color(30, 30, 30));
        cells23.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells23);

        cells24.setBackground(new java.awt.Color(30, 30, 30));
        cells24.setForeground(new java.awt.Color(30, 30, 30));
        cells24.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells24);

        cells25.setBackground(new java.awt.Color(30, 30, 30));
        cells25.setForeground(new java.awt.Color(30, 30, 30));
        cells25.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells25);

        cells26.setBackground(new java.awt.Color(30, 30, 30));
        cells26.setForeground(new java.awt.Color(30, 30, 30));
        cells26.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells26);

        cells27.setBackground(new java.awt.Color(30, 30, 30));
        cells27.setForeground(new java.awt.Color(30, 30, 30));
        cells27.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells27);

        cells28.setBackground(new java.awt.Color(30, 30, 30));
        cells28.setForeground(new java.awt.Color(30, 30, 30));
        cells28.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells28);

        cells29.setBackground(new java.awt.Color(30, 30, 30));
        cells29.setForeground(new java.awt.Color(30, 30, 30));
        cells29.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells29);

        cells30.setBackground(new java.awt.Color(30, 30, 30));
        cells30.setForeground(new java.awt.Color(30, 30, 30));
        cells30.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells30);

        cells31.setBackground(new java.awt.Color(30, 30, 30));
        cells31.setForeground(new java.awt.Color(30, 30, 30));
        cells31.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells31);

        cells32.setBackground(new java.awt.Color(30, 30, 30));
        cells32.setForeground(new java.awt.Color(30, 30, 30));
        cells32.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells32);

        cells33.setBackground(new java.awt.Color(30, 30, 30));
        cells33.setForeground(new java.awt.Color(30, 30, 30));
        cells33.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells33);

        cells34.setBackground(new java.awt.Color(30, 30, 30));
        cells34.setForeground(new java.awt.Color(30, 30, 30));
        cells34.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells34);

        cells35.setBackground(new java.awt.Color(30, 30, 30));
        cells35.setForeground(new java.awt.Color(30, 30, 30));
        cells35.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells35);

        cells36.setBackground(new java.awt.Color(30, 30, 30));
        cells36.setForeground(new java.awt.Color(30, 30, 30));
        cells36.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells36);

        cells37.setBackground(new java.awt.Color(30, 30, 30));
        cells37.setForeground(new java.awt.Color(30, 30, 30));
        cells37.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells37);

        cells38.setBackground(new java.awt.Color(30, 30, 30));
        cells38.setForeground(new java.awt.Color(30, 30, 30));
        cells38.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells38);

        cells39.setBackground(new java.awt.Color(30, 30, 30));
        cells39.setForeground(new java.awt.Color(30, 30, 30));
        cells39.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells39);

        cells40.setBackground(new java.awt.Color(30, 30, 30));
        cells40.setForeground(new java.awt.Color(30, 30, 30));
        cells40.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells40);

        cells41.setBackground(new java.awt.Color(30, 30, 30));
        cells41.setForeground(new java.awt.Color(30, 30, 30));
        cells41.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells41);

        cells42.setBackground(new java.awt.Color(30, 30, 30));
        cells42.setForeground(new java.awt.Color(30, 30, 30));
        cells42.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells42);

        cells43.setBackground(new java.awt.Color(30, 30, 30));
        cells43.setForeground(new java.awt.Color(30, 30, 30));
        cells43.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells43);

        cells44.setBackground(new java.awt.Color(30, 30, 30));
        cells44.setForeground(new java.awt.Color(30, 30, 30));
        cells44.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells44);

        cells45.setBackground(new java.awt.Color(30, 30, 30));
        cells45.setForeground(new java.awt.Color(30, 30, 30));
        cells45.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells45);

        cells46.setBackground(new java.awt.Color(30, 30, 30));
        cells46.setForeground(new java.awt.Color(30, 30, 30));
        cells46.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells46);

        cells47.setBackground(new java.awt.Color(30, 30, 30));
        cells47.setForeground(new java.awt.Color(30, 30, 30));
        cells47.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells47);

        cells48.setBackground(new java.awt.Color(30, 30, 30));
        cells48.setForeground(new java.awt.Color(30, 30, 30));
        cells48.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells48);

        cells49.setBackground(new java.awt.Color(30, 30, 30));
        cells49.setForeground(new java.awt.Color(30, 30, 30));
        cells49.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        add(cells49);
    }// </editor-fold>//GEN-END:initComponents

    private void SUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private miniCalendar.Cells FRI;
    private miniCalendar.Cells MON;
    private miniCalendar.Cells SAT;
    private miniCalendar.Cells SUN;
    private miniCalendar.Cells THU;
    private miniCalendar.Cells TUE;
    private miniCalendar.Cells WED;
    private miniCalendar.Cells cells10;
    private miniCalendar.Cells cells11;
    private miniCalendar.Cells cells12;
    private miniCalendar.Cells cells13;
    private miniCalendar.Cells cells14;
    private miniCalendar.Cells cells15;
    private miniCalendar.Cells cells16;
    private miniCalendar.Cells cells17;
    private miniCalendar.Cells cells18;
    private miniCalendar.Cells cells19;
    private miniCalendar.Cells cells20;
    private miniCalendar.Cells cells21;
    private miniCalendar.Cells cells22;
    private miniCalendar.Cells cells23;
    private miniCalendar.Cells cells24;
    private miniCalendar.Cells cells25;
    private miniCalendar.Cells cells26;
    private miniCalendar.Cells cells27;
    private miniCalendar.Cells cells28;
    private miniCalendar.Cells cells29;
    private miniCalendar.Cells cells30;
    private miniCalendar.Cells cells31;
    private miniCalendar.Cells cells32;
    private miniCalendar.Cells cells33;
    private miniCalendar.Cells cells34;
    private miniCalendar.Cells cells35;
    private miniCalendar.Cells cells36;
    private miniCalendar.Cells cells37;
    private miniCalendar.Cells cells38;
    private miniCalendar.Cells cells39;
    private miniCalendar.Cells cells40;
    private miniCalendar.Cells cells41;
    private miniCalendar.Cells cells42;
    private miniCalendar.Cells cells43;
    private miniCalendar.Cells cells44;
    private miniCalendar.Cells cells45;
    private miniCalendar.Cells cells46;
    private miniCalendar.Cells cells47;
    private miniCalendar.Cells cells48;
    private miniCalendar.Cells cells49;
    private miniCalendar.Cells cells8;
    private miniCalendar.Cells cells9;
    // End of variables declaration//GEN-END:variables
}
