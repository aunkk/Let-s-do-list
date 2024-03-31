package com.raven.datechooser;

//import DateInTable.Chooser;//import from folder file Chooser
//import DateInTable.JFrameChooser;
import static com.raven.datechooser.Dates.state;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class Button extends JButton{
        
        JPanel panel = new JPanel();
        JButton bn = new JButton();
        //EDIT NAJA
     
        
       
        
    public boolean isPaintBackground() {
        return paintBackground;
    }

       public void setPanel(JPanel panel){
        this.panel = panel;
    }
    
    
    public JPanel getPanel(){
        return panel;
    }
    
    public void setPaintBackground(boolean paintBackground) {
        this.paintBackground = paintBackground;
    }

    private Event event;
    private boolean paintBackground = true;
    private Color colorSelected;

    public Button() {
        setBorder(null);
        setContentAreaFilled(false);
        setFocusable(false);
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                if (me.getClickCount() == 2 && !me.isConsumed()) {
                    me.consume(); // Consume the event to prevent double events
                   System.out.println("ss");
        }
                    
//                    if (!getText().equals("") && getName() != null) {
//                        if (Dates.getState() == 0) { //Class.medthod
//                            Chooser panelChooser = new Chooser();
//                            panelChooser.add(panel);
//                            
//                            Dates.setState("available");
//                            System.out.println(state + "Edit?");
//                        } else {
//                            System.out.println(state);
//                            System.out.println("dsdsd");
                        
                        
                        if (Dates.getState() == 0) {
//                            JFrameChooser newFrame = new JFrameChooser();
//                            newFrame.setVisible(true);
//                            Dates.setState("available");
//                            System.out.println(state + " if");
                        } else {
                            System.out.println(state + " else");
                            
                        }
                    
                }//set jbutton 
            
        });
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent me) {
//                if (!getText().equals("") && getName() != null) {
//                    if (getName().equals("day") || getName().equals("year")) {
//                        event.execute(me, Integer.valueOf(getText()));
//                    } else {
//                        event.execute(me, Integer.valueOf(getName()));
//                    }
//                    setBackground(getColorSelected());
//                    setForeground(new Color(255, 255, 255));
//                }
//            }
//        });
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public void paint(Graphics grphcs) {
        if (paintBackground) {
            int width = getWidth();
            int height = getHeight();
            int size = Math.min(width, height);
            int x = (width - size) / 2;
            int y = (height - size) / 2;
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillOval(x, y, size, size);
        }
        super.paint(grphcs);
    }

    public Color getColorSelected() {
        return colorSelected;
    }

    public void setColorSelected(Color colorSelected) {
        this.colorSelected = colorSelected;
    }

    
    
}
