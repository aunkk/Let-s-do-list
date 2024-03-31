package decorClass;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class CircleButton extends JButton {

    private int arcWidth;
    private int arcHeight;

    public CircleButton(String text, int arcWidth, int arcHeight) {
        super(text);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }
    public CircleButton(int arcWidth, int arcHeight) {
        this("", arcWidth, arcHeight);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }
    
    public CircleButton() {
        this("+", 1000, 1000);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, arcWidth, arcHeight);

        g2d.setColor(getBackground());
        g2d.fill(roundedRectangle);

        super.paintComponent(g);

        g2d.dispose();
    }
}