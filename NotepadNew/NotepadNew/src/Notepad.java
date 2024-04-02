import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
public class Notepad extends JTextPane implements MouseListener, MouseMotionListener, Serializable{
        private boolean eraseOn = false;
        private boolean freeHandOn = true;
        private boolean darkModeOn = false;
        private ArrayList<ArrayList<Point>> lines = new ArrayList<>();
        private ArrayList<Point> currentLine = new ArrayList<>();

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

    public boolean isEraseOn() {
        return eraseOn;
    }

    public void setEraseOn(boolean eraseOn) {
        this.eraseOn = eraseOn;
    }

    public boolean isFreeHandOn() {
        return freeHandOn;
    }

    public void setFreeHandOn(boolean freeHandOn) {
        this.freeHandOn = freeHandOn;
    }

    public boolean isDarkModeOn() {
        return darkModeOn;
    }

    public void setDarkModeOn(boolean darkModeOn) {
        this.darkModeOn = darkModeOn;
    }

    public ArrayList<ArrayList<Point>> getLines() {
        return lines;
    }

    public void setLines(ArrayList<ArrayList<Point>> lines) {
        this.lines = lines;
    }

    public ArrayList<Point> getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(ArrayList<Point> currentLine) {
        this.currentLine = currentLine;
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
            this.setSelectionColor(Color.WHITE);
            this.setCaretColor(Color.WHITE);
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

