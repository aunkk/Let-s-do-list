package MainSWM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TaskReal extends JPanel{
    public JCheckBox task;
    public float alpha;
    public TaskReal(){
        this.setSize(400, 200);
        this.alpha = 0;
        setBackground(Color.WHITE);
        
        task = new JCheckBox("Type your task");
        task.setFont(new java.awt.Font("Consolas", 0, 18));
        task.setContentAreaFilled(false);
        task.setIconTextGap(15);
        this.add(task);
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
                    task.setFont(font.deriveFont(Font.ITALIC));
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
