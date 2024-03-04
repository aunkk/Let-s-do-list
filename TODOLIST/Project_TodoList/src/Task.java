import javax.swing.*;
import java.awt.*;
public class Task {
    private JCheckBox cb;
    private JTextPane tp;
    private JButton bndel;
    private JPanel jp;
    
    public Task(){
        tp = new JTextPane();
        cb = new JCheckBox();
        bndel = new JButton("DELETE");
        jp = new JPanel();
        
        jp.add(tp);
        jp.add(cb);
        jp.add(bndel);
        
        
    }
}
