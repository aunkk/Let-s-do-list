import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ToDoListGUI implements ActionListener {
    private JFrame jf;
    private JPanel jp;
    private JPanel jp2;
    private JLabel jl;
    private JButton bn1;
            
    public ToDoListGUI(){
        jf = new JFrame("ToDoList");
        jp = new JPanel();
        jp2 = new JPanel();
        jl = new JLabel("Today's Task");
        bn1 = new JButton("ADD");
        
        //panel 2
        jp2.setLayout(new FlowLayout());
        jp2.add(bn1);
        bn1.addActionListener(this);
        //bn1.setBounds(20,35,120,200);
        
        //main panel
        jp.setLayout(new BorderLayout());
        jp.add(jl, BorderLayout.NORTH);
        jp.add(jp2, BorderLayout.SOUTH);
        
        jf.add(jp);
        
        //Banner
        jl.setFont(new Font("Arial", Font.PLAIN, 22));
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jf.setSize(300, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new ToDoListGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equalsIgnoreCase("Add Task")){
            Task task = new Task();
            
            task.get
        }
    }
}
