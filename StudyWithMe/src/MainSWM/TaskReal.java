package MainSWM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import decorClass.*;

public class TaskReal extends JPanel{
    public JCheckBox task;
    public float alpha;
    public RoundedPanel plate;
    public TaskReal(){
        this.setSize(400, 200);
        this.alpha = 0;
        setBackground(null);
        
        plate = new RoundedPanel();
        setBackground(new Color(198,227,193));
        
        task = new JCheckBox("Type your task");
        task.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        task.setContentAreaFilled(false);
        task.setIconTextGap(15);
        plate.add(task);
        this.add(plate);
        task.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    task.setForeground(Color.LIGHT_GRAY);
                    Font font = task.getFont();
                    task.setFont(font.deriveFont(Font.ITALIC));
                }
                else{
                    task.setForeground(Color.BLACK);
                    Font font = task.getFont();
                    task.setFont(font.deriveFont(Font.BOLD));
                }
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        
        // กำหนด Alpha Composite
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        g2d.setComposite(alphaComposite);
        
        // วาดพื้นหลัง
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
        g2d.dispose();
    }    
}
