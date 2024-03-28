package miniCalendar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.*;
public class Cells extends JButton {
    private Date date;
    private boolean title;
    private boolean isToDay;
    
    
    public Cells(){
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
        
        
    }
    public void asTitle(){
        title = true;
    }
    public boolean isTitle(){
        return title;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void currentMonth(boolean act){
        if (act) {
            setForeground(new Color(143, 171, 108));
        } else {
            setForeground(new Color(149,149,149));
        }
    }
    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (title) {
            grphcs.setColor(new Color(213, 213, 213));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
        if (isToDay) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(133,210,203));
            int x = getWidth() / 2 - 17;
            int y = getHeight() / 2 - 17;
            g2.fillRoundRect(x, y, 35, 35, 100, 100);
        }
        super.paintComponent(grphcs);
    }

}
