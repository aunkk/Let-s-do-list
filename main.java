import java.awt.*;
import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        Stopwatch st = new Stopwatch();
        fr.add(st);
        
        fr.setSize(300, 235);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
