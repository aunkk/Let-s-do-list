import java.awt.*;
import java.util.List;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yarnisar
 */
public class SetNoti implements ActionListener,WindowListener{
    private JFrame fr;
    private JDesktopPane desktop;
    private JInternalFrame inframe;
    private ButtonGroup rg;
    private JCheckBox r1day, r2day, r5day, r1week, r2week, r3week, r1month, r2month, r3month;
    private JPanel p1, p2,p3;
    private JLabel lb;
    private JButton btDone, btDotsave;
    private String total;
    private LocalDate currentDate, oneDayBefore, twoDaysBefore, fiveDaysBefore, oneWeekBefore, twoWeeksBefore, threeWeeksBefore, oneMonthBefore, twoMonthsBefore, threeMonthsBefore, dueDate, oneDayAfter, twoDaysAfter, fiveDaysAfter, oneWeekAfter, twoWeeksAfter, threeWeeksAfter, oneMonthAfter, twoMonthsAfter, threeMonthsAfter;
    private String condition;
    private HashMap<LocalDate, List<String>>notificationConditions;
    private List<LocalDate>keysList;
    
    public SetNoti(){
        condition = new String();
        fr = new JFrame();
        desktop = new JDesktopPane();
        inframe = new JInternalFrame("Noti",false,true,false,false);
        p1 = new JPanel(); p2 = new JPanel(); p3 = new JPanel();
        lb = new JLabel("How many days in advance should i be notified");
        btDotsave = new JButton("not notify me.");
        btDone = new JButton("Done");
        r1day = new JCheckBox("1 day");
        r2day = new JCheckBox("2 days");
        r5day = new JCheckBox("5 days");
        r1week = new JCheckBox("1 week");
        r2week = new JCheckBox("2 weeks");
        r3week = new JCheckBox("3 weeks");
        r1month = new JCheckBox("1 month");
        r2month = new JCheckBox("2 months");
        r3month = new JCheckBox("3 months");

        notificationConditions = new HashMap<>();
        keysList = new ArrayList<>();
        
        UIManager.put("OptionPane.messageFont", new Font("Comic Sans MS", 1, 13));
        UIManager.put("OptionPane.titleFont", new Font("Comic Sans MS", 1, 13));
        UIManager.put("OptionPane.buttonFont", new Font("Comic Sans MS", 1, 13));
        inframe.setFont(new Font("Comic Sans MS", 1, 13));
        btDone.setFont(new Font("Comic Sans MS", 1, 13));
        btDotsave.setFont(new Font("Comic Sans MS", 1, 13));
        r1day.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r2day.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r5day.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r1week.setFont(new Font("Comic Sans MS", 1, 13));
        r2week.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r3week.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r1month.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r2month.setFont(new Font("Comic Sans MS", 1, 13)) ;
        r3month.setFont(new Font("Comic Sans MS", 1, 13)) ;
        
        
        
        r1day.setBackground(new Color(255, 244, 254  ));
        r2day.setBackground(new Color(255, 244, 254 )) ;
        r5day.setBackground(new Color(255, 244, 254 ));
        r1week.setBackground(new Color(255, 244, 254  ));
        r2week.setBackground(new Color(255, 244, 254  )) ;
        r3week.setBackground(new Color(255, 244, 254 ));
        r1month.setBackground(new Color(255, 244, 254  ));
        r2month.setBackground(new Color(255, 244, 254 ));
        r3month.setBackground(new Color(255, 244, 254  ));

        
        p1.setLayout(new FlowLayout());
        p1.add(lb);
        
        p2.setLayout(new GridLayout(3,1));
        p2.add(r1day);
        p2.add(r1week);
        p2.add(r1month);
        p2.add(r2day);
        p2.add(r2week);
        p2.add(r2month);      
        p2.add(r5day);
        p2.add(r3week);
        p2.add(r3month);

        p3.setBackground(new Color(255, 244, 254 ));
        btDone.setBackground(new Color(200, 251, 255 ) );
        btDotsave.setBackground(new Color(249, 154, 116 ));
        p3.add(btDone);
        p3.add(btDotsave);
        
        inframe.getContentPane().setLayout(new BorderLayout());
        inframe.getContentPane().add(p2, BorderLayout.CENTER);
        inframe.getContentPane().add(p3, BorderLayout.SOUTH);
        inframe.getContentPane().setBackground(Color.PINK);
        inframe.setBackground(Color.PINK);
        inframe.pack();
        inframe.setVisible(true);
        
        desktop.add(inframe);
        
        fr.setLayout(new BorderLayout());
        fr.add(desktop, BorderLayout.CENTER);
        
        btDone.addActionListener(this);
        btDotsave.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,250);
        fr.setVisible(true);

        dueDate = LocalDate.of(2024,4,3); // 1 เมษายน 2024
        
        currentDate = LocalDate.now();
        oneDayAfter = currentDate.plus(1, ChronoUnit.DAYS);
        twoDaysAfter = currentDate.plus(2, ChronoUnit.DAYS);
        fiveDaysAfter = currentDate.plus(5, ChronoUnit.DAYS);
        oneWeekAfter = currentDate.plus(1, ChronoUnit.WEEKS);
        twoWeeksAfter = currentDate.plus(2, ChronoUnit.WEEKS);
        threeWeeksAfter = currentDate.plus(3, ChronoUnit.WEEKS);
        oneMonthAfter = currentDate.plus(1,ChronoUnit.MONTHS);
        twoMonthsAfter = currentDate.plus(2,ChronoUnit.MONTHS);
        threeMonthsAfter = currentDate.plus(3,ChronoUnit.MONTHS);
        
        oneDayBefore = dueDate.minus(1, ChronoUnit.DAYS);
        twoDaysBefore = dueDate.minus(2, ChronoUnit.DAYS);
        fiveDaysBefore = dueDate.minus(5, ChronoUnit.DAYS);
        oneWeekBefore = dueDate.minus(1, ChronoUnit.WEEKS);
        twoWeeksBefore = dueDate.minus(2, ChronoUnit.WEEKS);
        threeWeeksBefore = dueDate.minus(3, ChronoUnit.WEEKS);
        oneMonthBefore = dueDate.minus(1,ChronoUnit.MONTHS);
        twoMonthsBefore= dueDate.minus(2,ChronoUnit.MONTHS);
        threeMonthsBefore = dueDate.minus(3,ChronoUnit.MONTHS);        
        
        
    
    }
    
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        new SetNoti();
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btDone)){
            if(dueDate.equals(null)){
                inframe.dispose();
            }
            else{
                List<String> valueList = new ArrayList<>();
                    condition = "";
                if(r1day.isSelected()){
                    condition = ("oneDay");
                    valueList.add(condition);
                    inframe.dispose();
                
                }
                if(r2day.isSelected()){
                    condition = ("twoDays");
                    valueList.add(condition);
                    inframe.dispose();
                  
                }
                if(r5day.isSelected()){
                    condition = ("fiveDays");
                    valueList.add(condition);
                    inframe.dispose();
                  
                }
                if(r1week.isSelected()){
                    condition = ("oneWeek");
                    valueList.add(condition);                
                    inframe.dispose();
                }
                if(r2week.isSelected()){
                    condition = ("twoWeek");
                    valueList.add(condition);                
                    inframe.dispose();
                }
                if(r3week.isSelected()){
                    condition = ("threeWeek");
                    valueList.add(condition);                
                    inframe.dispose();
                }
                if(r1month.isSelected()){
                    condition = ("oneMonth");
                    valueList.add(condition);               
                    inframe.dispose();
                }
                if(r2month.isSelected()){
                    condition = ("twoMonth");
                    valueList.add(condition);               
                    inframe.dispose();
                }
                if(r3month.isSelected()){
                    condition = ("threeMonth");
                    valueList.add(condition);               
                    inframe.dispose();
                }
                    condition = ("dueDatee");
                    valueList.add(condition);
                    inframe.dispose();
                  
                notificationConditions.put(dueDate,valueList);
                System.out.println("Done");
                System.out.println("new "+notificationConditions.entrySet());
                JOptionPane.showMessageDialog(null, "Noti Save", "", JOptionPane.INFORMATION_MESSAGE);
            }
           
        }else if(e.getSource().equals(btDotsave)){
            notificationConditions.remove(dueDate);
            System.out.println("User Do not need to notify");
            inframe.dispose();
        }
       
    }
    public void checkAndShowNotification(){      
        Iterator<LocalDate> iterator = notificationConditions.keySet().iterator();
        while (iterator.hasNext()) {
            LocalDate key = iterator.next();
            List<String> value = notificationConditions.get(key);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String keyString = key.format(formatter);
        if (key.isBefore(currentDate)) {
                iterator.remove();
            System.out.println("Removed key " + keyString);
            }else{
                System.out.println("Key: " + key);
                for (String condition : value) {
                    
                    if (condition.equals("oneDay")&& oneDayAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "One more day! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("oneDayBefore");
                    }
                    if (condition.equals("twoDays")&& twoDaysAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 2 day! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("twoDaysBefore");
                    }
                    if (condition.equals("fiveDays")&& fiveDaysAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 5 day! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("fiveDaysBefore");
                    }
                    if (condition.equals("oneWeek")&& oneWeekAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In another week! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("oneWeekBefore");
                    }
                    if (condition.equals("twoWeek")&& twoWeeksAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 2 week! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("twoWeeksBefore");
                    }
                    if (condition.equals("threeWeek")&& threeWeeksAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 3 week! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("threeWeeksBefore");
                    }
                    if (condition.equals("oneMonth")&& oneMonthAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In another month! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("oneMonthBefore");
                    }
                    if (condition.equals("twoMonth")&& twoMonthsAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 2 month! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("twoMonthsBefore");
                    }
                    if (condition.equals("threeMonth")&& threeMonthsAfter.equals(key)) {
                        JOptionPane.showMessageDialog(null, "In 3 month! Your work will be due.", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("threeMonthsBefore");
                    }
                    if (condition.equals("dueDatee")&& currentDate.equals(key)) {
                        JOptionPane.showMessageDialog(null, "time's up!", "Note "+keyString, JOptionPane.INFORMATION_MESSAGE); 
                        System.out.println("dueDate");
                    }
                }   
            }
        }
    }

    

    @Override
    public void windowOpened(WindowEvent e) {
        File noti = new File("notification.dat");
        System.out.println(oneDayAfter);
            System.out.println(twoDaysAfter);
            System.out.println(fiveDaysAfter);
            System.out.println(oneWeekAfter);
            System.out.println(twoWeeksAfter);
            System.out.println(threeWeeksAfter);
            System.out.println(oneMonthAfter);
            System.out.println(twoMonthsAfter);
            System.out.println(threeMonthsAfter);
        if(noti.exists()){
            if(e.getSource().equals(fr)){
                try (FileInputStream fileIn = new FileInputStream("notification.dat");
                    ObjectInputStream in = new ObjectInputStream(fileIn);){
                    notificationConditions = (HashMap<LocalDate, List<String>>) in.readObject();
                    System.out.println("Opened "+notificationConditions);
                    in.close();
                    fileIn.close();
                    if(e.getSource().equals(fr)){
                      keysList = new ArrayList<>(notificationConditions.keySet());
                      checkAndShowNotification();
                    }
                    System.out.println("Serialized data is loaded from notification.dat");
                    } catch (IOException i) {
                        i.printStackTrace();
                        return;
                    } catch (ClassNotFoundException c) {
                        System.out.println("HashMap<LocalDate, List<String>> class not found");
                        c.printStackTrace();
                        return;
                    }       
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fileOut = new FileOutputStream("notification.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);){
            out.writeObject(notificationConditions);
            System.out.println("All "+notificationConditions.entrySet());
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in notification.dat");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}