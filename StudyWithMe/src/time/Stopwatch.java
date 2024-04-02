package time;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;

public class Stopwatch extends JPanel implements ActionListener, MouseListener{
    private StopwatchLabel timeLableHr, timeLableMin, timeLableSec,
            timeLableHr2, timeLableMin2, timeLableSec2;
    private JLabel colon1, colon2, colon3, colon4, name;
    private JPanel timePanel, btnPanel, namePanel, lowerPanel, 
            time2Panel,btn2Panel, layerPanel, stopwatchPanel, timerPanel;
    private RoundedButton btnStart, btnEdit, btnReset, btnStart2, btnReset2,
            btnOK, btnCancel;
    private JButton btnChange;
    private Color color1, color2, color1hover, color2hover,
            color1press, color2press, textcolorhover, textcolorpress;
    private boolean isStopwatch, showEdit;
    private JFrame editFrame;
    private JComboBox combohr, combomin, combosec;
    private final int millisecond;
    
    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String seconds_str = String.format("%02d", seconds);
    String minutes_str = String.format("%02d", minutes);
    String hours_str = String.format("%02d", hours);
    
    int second2 = 0;
    int minute2 = 0;
    int hour2 = 0;
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            elapsedTime += millisecond;
            hours = (elapsedTime/3600000);
            minutes = (elapsedTime/60000)%60;
            seconds = (elapsedTime/1000)%60;
            
            seconds_str = String.format("%02d", seconds);
            minutes_str = String.format("%02d", minutes);
            hours_str = String.format("%02d", hours);
            timeLableHr.setTime(hours_str);
            timeLableMin.setTime(minutes_str);
            timeLableSec.setTime(seconds_str);
        }
    });
    
    int totalSeconds = hour2*3600 + minute2*60 + second2;
    Timer timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalSeconds -= 1;
                if(totalSeconds >= 0){
                    int remainHr = totalSeconds/3600;
                    int remainMin = totalSeconds/60;
                    int remainSec = totalSeconds%60;
                    timeLableHr2.setTime(String.format("%02d", remainHr));
                    timeLableMin2.setTime(String.format("%02d", remainMin));
                    timeLableSec2.setTime(String.format("%02d", remainSec));
                }else{
                    timer2.stop();
                    btnStart2.setText("Start");
                    JOptionPane timeup = new JOptionPane();
                    JOptionPane.showMessageDialog(editFrame, "Time's up!!!");
                    timeup.setFont(new Font(name.getFont().getName(), Font.BOLD, 48));
                }
            }
        });
    
    public Stopwatch(){
        textcolorhover = new Color(215, 217, 222);
        textcolorpress = new Color(199, 200, 204);
        color1 = new Color(212, 99, 167);
        color2 = new Color(87, 131, 219);
        color1hover = new Color(196, 92, 155);
        color2hover = new Color(79, 120, 201);
        color1press = new Color(179, 84, 141);
        color2press = new Color(72, 109, 184);
        
        isStopwatch = true;
        
        setLayout(new BorderLayout());
        
        
        
        stopwatchPanel = new JPanel(new BorderLayout());
        timerPanel = new JPanel(new BorderLayout());
        
        name = new JLabel("Stopwatch");
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        name.setBackground(color1);
        name.setOpaque(true);
        name.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        name.setHorizontalAlignment(JLabel.CENTER);
        namePanel = new JPanel(new BorderLayout());
        namePanel.add(name, BorderLayout.CENTER);
        
        timePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        timeLableHr = new StopwatchLabel("hour");
        timeLableHr.setTime(hours_str);
        timeLableMin = new StopwatchLabel("min");
        timeLableMin.setTime(minutes_str);
        timeLableSec = new StopwatchLabel("sec");
        timeLableSec.setTime(seconds_str);
        
        colon1 = new JLabel(":");
        colon2 = new JLabel(":");
        colon1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        colon2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        
        
        JPanel p1 = new JPanel(new BorderLayout());
        JLabel space1 = new JLabel(" ");
        p1.add(space1, BorderLayout.CENTER);
        p1.add(colon1, BorderLayout.SOUTH);
        
        JPanel p2 = new JPanel(new BorderLayout());
        JLabel space2 = new JLabel(" ");
        p2.add(space2, BorderLayout.CENTER);
        p2.add(colon2, BorderLayout.SOUTH);
        
        timePanel.add(timeLableHr); timePanel.add(p1);
        timePanel.add(timeLableMin); timePanel.add(p2);
        timePanel.add(timeLableSec);
        
        time2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        timeLableHr2 = new StopwatchLabel("hour");
        timeLableHr2.setTime(hours_str);
        timeLableMin2 = new StopwatchLabel("min");
        timeLableMin2.setTime(minutes_str);
        timeLableSec2 = new StopwatchLabel("sec");
        timeLableSec2.setTime(seconds_str);
        
        colon3 = new JLabel(":");
        colon4 = new JLabel(":");
        colon3.setFont(new Font(colon1.getFont().getName(), colon1.getFont().getStyle(), 20));
        colon4.setFont(new Font(colon1.getFont().getName(), colon1.getFont().getStyle(), 20));
        
        JPanel p3 = new JPanel(new BorderLayout());
        JLabel space3 = new JLabel(" ");
        p3.add(space3, BorderLayout.CENTER);
        p3.add(colon3, BorderLayout.SOUTH);
        
        JPanel p4 = new JPanel(new BorderLayout());
        JLabel space4 = new JLabel(" ");
        p4.add(space4, BorderLayout.CENTER);
        p4.add(colon4, BorderLayout.SOUTH);
        
        time2Panel.add(timeLableHr2); time2Panel.add(p3);
        time2Panel.add(timeLableMin2); time2Panel.add(p4);
        time2Panel.add(timeLableSec2);
        
        
        btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 8));
        btnStart = new RoundedButton("Start", 10, 10);
        btnReset = new RoundedButton("Reset", 10, 10);
        btnStart.setBackground(color1);
        btnStart.setForeground(Color.WHITE);
        btnReset.setForeground(color1);
        btnReset.setBackground(Color.WHITE);
        
        btnPanel.add(btnStart); btnPanel.add(btnReset);
        
        btnStart2 = new RoundedButton("Start", 10, 10);
        btnEdit = new RoundedButton("Edit", 10, 10);
        btnReset2 = new RoundedButton("Reset", 10, 10);
        btnEdit.setForeground(color2);
        btnEdit.setBackground(Color.WHITE);
        btnStart2.setBackground(color2);
        btnStart2.setForeground(Color.WHITE);
        btnReset2.setForeground(color2);
        btnReset2.setBackground(Color.WHITE);
        
        btnStart.addActionListener(this);
        btnReset.addActionListener(this);
        
        btnStart2.addActionListener(this);
        btnEdit.addActionListener(this);
        btnReset2.addActionListener(this);
        
        btnStart.addMouseListener(this);
        btnReset.addMouseListener(this);
        
        btnStart2.addMouseListener(this);
        btnEdit.addMouseListener(this);
        btnReset2.addMouseListener(this);
        
        btn2Panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 8));
        btn2Panel.add(btnStart2); btn2Panel.add(btnEdit); btn2Panel.add(btnReset2);
        
        editFrame = new JFrame("Timer");
        JLabel messageLabel = new JLabel("Set your timer!");
        messageLabel.setForeground(color2);
        messageLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        JPanel messageLabelPanel = new JPanel();
        messageLabelPanel.add(messageLabel);
        JLabel lb1 = new JLabel("hour");
        JLabel lb2 = new JLabel("min");
        JLabel lb3 = new JLabel("sec");
        lb1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        lb2.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        lb3.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        JPanel editPanel = new JPanel(new BorderLayout());
        JPanel comboBoxPanel = new JPanel();
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "15", "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
            "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
            "51", "52", "53", "54", "55", "56", "57", "58", "59"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "15", "16", "17", "18", "19", "20", 
            "21", "22", "23"};
        combohr = new JComboBox(num);
        combomin = new JComboBox(nums);
        combosec = new JComboBox(nums);
        combohr.setBackground(Color.WHITE);
        combomin.setBackground(Color.WHITE);
        combosec.setBackground(Color.WHITE);
        JPanel editBtnPanel = new JPanel();
        btnOK = new RoundedButton("OK", 10, 10);
        btnCancel = new RoundedButton("Cancel", 10, 10);
        btnOK.setBackground(color2);
        btnOK.setForeground(Color.WHITE);
        btnCancel.setBackground(Color.WHITE);
        btnCancel.setForeground(color2);
        editBtnPanel.add(btnOK); editBtnPanel.add(btnCancel);
        
        btnOK.addActionListener(this);
        btnCancel.addActionListener(this);
        
        btnOK.addMouseListener(this);
        btnCancel.addMouseListener(this);
        
        btnStart.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnStart2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnEdit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnReset.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnReset2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnOK.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btnCancel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        
        editPanel.add(messageLabelPanel, BorderLayout.NORTH);
        comboBoxPanel.add(lb1);
        comboBoxPanel.add(combohr);
        comboBoxPanel.add(lb2);
        comboBoxPanel.add(combomin);
        comboBoxPanel.add(lb3);
        comboBoxPanel.add(combosec);
        editPanel.add(comboBoxPanel, BorderLayout.CENTER);
        editPanel.add(editBtnPanel, BorderLayout.SOUTH);
        editPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        editFrame.add(editPanel);
        editFrame.pack();
        editFrame.setResizable(false);
        editFrame.setBounds(23, 40, editFrame.getWidth(), editFrame.getHeight());
        editFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        editFrame.setVisible(false);
        showEdit = false;
        
        btnChange = new JButton();
        ImageIcon icon = new ImageIcon("refresh.png");
        btnChange.setPreferredSize(new Dimension(20, 20));
        int width = btnChange.getPreferredSize().width;
        int height = btnChange.getPreferredSize().height;
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(img);
        btnChange.setIcon(resizedIcon);
        btnChange.setContentAreaFilled(false);
        btnChange.setBorderPainted(false);
        JPanel btnchgPanel = new JPanel();
        btnchgPanel.add(btnChange);
        
        btnChange.addActionListener(this);
        btnChange.addMouseListener(this);
        
        stopwatchPanel.add(timePanel, BorderLayout.CENTER);
        stopwatchPanel.add(btnPanel, BorderLayout.SOUTH);
        timerPanel.setVisible(false);
        
        timerPanel.add(time2Panel, BorderLayout.CENTER);
        timerPanel.add(btn2Panel, BorderLayout.SOUTH);
        
        lowerPanel = new JPanel(new BorderLayout());
//        lowerPanel.add(btnPanel, BorderLayout.CENTER);
        lowerPanel.add(btnchgPanel, BorderLayout.SOUTH);
        lowerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
        
        layerPanel = new JPanel();
        layerPanel.add(stopwatchPanel);
        layerPanel.add(timerPanel);
        
        
        add(namePanel, BorderLayout.NORTH);
        add(layerPanel, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);
    }
    
    public void start(){
        timer.start();
    }
    public void stop(){
        timer.stop();
    }
    public void reset(){
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        
        seconds_str = String.format("%02d", seconds);
        minutes_str = String.format("%02d", minutes);
        hours_str = String.format("%02d", hours);
        timeLableHr.setTime(hours_str);
        timeLableMin.setTime(minutes_str);
        timeLableSec.setTime(seconds_str);
    }
    
    public void startTimer(){
        if(timeLableHr2.getTime()==0 && timeLableMin2.getTime()==0 && timeLableSec2.getTime()==0){
            JOptionPane alert = new JOptionPane();
            alert.showMessageDialog(editFrame, "Please set up your timer.");
            alert.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
            btnStart2.setText("Start");
        }else{
            hour2 = timeLableHr2.getTime();
            minute2 = timeLableMin2.getTime();
            second2 = timeLableSec2.getTime();
            totalSeconds = hour2*3600 + minute2*60 + second2;

            timer2.start();
        }
    }
    public void stopTimer(){
        timer2.stop();
    }
    public void resetTimer(){
        timer2.stop();
        seconds_str = String.format("%02d", 0);
        minutes_str = String.format("%02d", 0);
        hours_str = String.format("%02d", 0);
        timeLableHr2.setTime(hours_str);
        timeLableMin2.setTime(minutes_str);
        timeLableSec2.setTime(seconds_str);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStopwatch){
            if(e.getSource().equals(btnStart)){
                if(started == false){
                    started = true;
                    btnStart.setText("Stop");
                    start();
                }else{
                    started = false;
                    btnStart.setText("Start");
                    stop();
                }
            }
            if(e.getSource().equals(btnReset)){
                started = false;
                btnStart.setText("Start");
                reset();
            }
        }else{
            if(e.getSource().equals(btnEdit)){
                showEdit = true;
                editFrame.setVisible(true);
            }
            if(showEdit = true){
                if(e.getSource().equals(btnOK)){
                    showEdit = false;
                    editFrame.setVisible(false);
                    seconds_str = String.format("%02d", Integer.parseInt(String.valueOf(combosec.getSelectedItem())));
                    minutes_str = String.format("%02d", Integer.parseInt(String.valueOf(combomin.getSelectedItem())));
                    hours_str = String.format("%02d", Integer.parseInt(String.valueOf(combohr.getSelectedItem())));
                    timeLableHr2.setTime(hours_str);
                    timeLableMin2.setTime(minutes_str);
                    timeLableSec2.setTime(seconds_str);
                }else if((e.getSource().equals(btnCancel))) {
                    showEdit = false;
                    editFrame.setVisible(false);
                }
            }
            
            if(e.getSource().equals(btnStart2)){
                if(started == false){
                    started = true;
                    btnStart2.setText("Stop");
                    startTimer();
                }else{
                    started = false;
                    btnStart2.setText("Start");
                    stopTimer();
                }
            }
            if(e.getSource().equals(btnReset2)){
                btnStart2.setText("Start");
                combohr.setSelectedIndex(0);
                combomin.setSelectedIndex(0);
                combosec.setSelectedIndex(0);
                resetTimer();
            }
            
        }
        
        if(e.getSource().equals(btnChange)){
            if(isStopwatch){
                isStopwatch = false;
                name.setText("Timer");
                timerPanel.setVisible(true);
                stopwatchPanel.setVisible(false);
                name.setBackground(color2);
//                reset();
//                btnStart.setText("Start");
            } else {
                isStopwatch = true;
                name.setText("Stopwatch");
                timerPanel.setVisible(false);
                stopwatchPanel.setVisible(true);
                name.setBackground(color1);
            }
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(btnStart)){
            btnStart.setBackground(color1press);
            btnStart.setForeground(textcolorpress);
        }else if(e.getSource().equals(btnReset)){
            btnReset.setBackground(textcolorpress);
            btnReset.setForeground(color1press);
        }else if(e.getSource().equals(btnStart2)){
            btnStart2.setBackground(color2press);
            btnStart2.setForeground(textcolorpress);
        }else if(e.getSource().equals(btnOK)){
            btnOK.setBackground(color2press);
            btnOK.setForeground(textcolorpress);
        }else if(e.getSource().equals(btnEdit)){
            btnEdit.setBackground(textcolorpress);
            btnEdit.setForeground(color2press);
        }else if(e.getSource().equals(btnReset2)){
            btnReset2.setBackground(textcolorpress);
            btnReset2.setForeground(color2press);
        }else if(e.getSource().equals(btnCancel)){
            btnCancel.setBackground(textcolorpress);
            btnCancel.setForeground(color2press);
        }else if(e.getSource().equals(btnChange)){
            btnChange.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.WHITE, Color.BLACK));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(btnStart)){
            btnStart.setBackground(color1hover);
            btnStart.setForeground(textcolorhover);
        }else if(e.getSource().equals(btnReset)){
            btnReset.setBackground(textcolorhover);
            btnReset.setForeground(color1hover);
        }else if(e.getSource().equals(btnStart2)){
            btnStart2.setBackground(color2hover);
            btnStart2.setForeground(textcolorhover);
        }else if(e.getSource().equals(btnOK)){
            btnOK.setBackground(color2hover);
            btnOK.setForeground(textcolorhover);
        }else if(e.getSource().equals(btnEdit)){
            btnEdit.setBackground(textcolorhover);
            btnEdit.setForeground(color2hover);
        }else if(e.getSource().equals(btnReset2)){
            btnReset2.setBackground(textcolorhover);
            btnReset2.setForeground(color2hover);
        }else if(e.getSource().equals(btnCancel)){
            btnCancel.setBackground(textcolorhover);
            btnCancel.setForeground(color2hover);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(btnStart)){
            btnStart.setBackground(color1);
            btnStart.setForeground(Color.WHITE);
        }else if(e.getSource().equals(btnReset)){
            btnReset.setBackground(Color.WHITE);
            btnReset.setForeground(color1);
        }else if(e.getSource().equals(btnStart2)){
            btnStart2.setBackground(color2);
            btnStart2.setForeground(Color.WHITE);
        }else if(e.getSource().equals(btnOK)){
            btnOK.setBackground(color2);
            btnOK.setForeground(Color.WHITE);
        }else if(e.getSource().equals(btnEdit)){
            btnEdit.setBackground(Color.WHITE);
            btnEdit.setForeground(color2);
        }else if(e.getSource().equals(btnReset2)){
            btnReset2.setBackground(Color.WHITE);
            btnReset2.setForeground(color2);
        }else if(e.getSource().equals(btnCancel)){
            btnCancel.setBackground(Color.WHITE);
            btnCancel.setForeground(color2);
        }
    }
    
    
}
