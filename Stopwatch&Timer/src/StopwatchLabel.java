import javax.swing.*;
import java.awt.*;

public class StopwatchLabel extends JPanel{
    private JLabel label, time;
//    private JTextField time;
    private JPanel pLabel, bgPanel;
    public StopwatchLabel(String title){
        setLayout(new BorderLayout());
        
        pLabel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        label = new JLabel(title);
        pLabel.add(label);
        
        time = new JLabel();
        time.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 5));
        time.setHorizontalAlignment(JTextField.CENTER);
        time.setForeground(Color.BLACK);
        time.setFont(new Font(time.getFont().getName(), time.getFont().getStyle(), 32));
        
        bgPanel = new JPanel();
        bgPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        bgPanel.setBackground(Color.WHITE);
        bgPanel.add(time);
        
        add(pLabel, BorderLayout.NORTH);
        add(bgPanel, BorderLayout.CENTER);
    }
    public void setTime(String time){
        this.time.setText(time);
    }
    public int getTime(){
        return Integer.parseInt(this.time.getText());
    }
}
