import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class Notepad extends JTextPane implements MouseListener, MouseMotionListener, Serializable{
        protected boolean eraseOn = false;
        protected boolean freeHandOn = true;
        protected boolean darkModeOn = false;
        protected ArrayList<ArrayList<Point>> lines = new ArrayList<>();
        protected ArrayList<Point> currentLine = new ArrayList<>();

    public Notepad() {
         addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (eraseOn) {
                    erase(e.getPoint());
                } else {
                    currentLine.add(e.getPoint());
                }
                repaint();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                currentLine = new ArrayList<>();
                
                if (eraseOn) {
                    erase(e.getPoint());
                } else {
                    currentLine.add(e.getPoint());
                }
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lines.add(new ArrayList<>(currentLine));
                currentLine.clear();
                repaint();
            }
        });
    }
    
    private void erase(Point point) {
        if (eraseOn==true & freeHandOn==false){
            for (int i = 0; i < lines.size(); i++) {
                ArrayList<Point> line = lines.get(i);
                for (int j = 0; j < line.size(); j++) {
                    Point point2 = line.get(j);
                    if (Math.abs(point2.x - point.x) <= 5 && Math.abs(point2.y - point.y) <= 5) {
                        line.remove(j);
                        j--;
                    }
                }
            }
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (darkModeOn){
            g.setColor(Color.BLACK);
        }
            //old lines
        for (ArrayList<Point> line : lines) {
            for (int i = 1; i < line.size(); i++) {
                Point p1 = line.get(i - 1);
                Point p2 = line.get(i);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
         }
            //present line; dragging line
        if (!currentLine.isEmpty()) {
            for (int i = 1; i < currentLine.size(); i++) {
                Point p1 = currentLine.get(i - 1);
                Point p2 = currentLine.get(i);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

