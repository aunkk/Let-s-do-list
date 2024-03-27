
import java.awt.*;
import java.lang.*;
import javax.swing.*;
//import java.util.*;
//Gam : clean code 
//Aun : task
//Logor : timer
//Noey : learn about calendar


public class AllJFrame extends JFrame{
//    private JFrame jframe;
    private JPanel leftp, rightp, upperp, lowerp, todolist, timer, calendar, searchTool, music,noteDisplay,noteEdit;
    private JButton tasknote;
    private JTextField textsearch;
    private GroupLayout timerLayout, leftpLayout, calendarLayout, musicLayout, searchToolLayout,
            upperPLayout, noteDisplayLayout, noteEditLayout,lowerpLayout,layout, rightPLayout;
    private JLabel labeltodolist;
    private CircleButton addButton;
    
    public AllJFrame() {
//    jframe = new JFrame();
    leftp = new JPanel();
    upperp = new JPanel();
    lowerp = new JPanel();
    todolist = new JPanel();
    timer = new JPanel();
//    calendar = new RoundedPanel(50,50);
    calendar = new JPanel();
    searchTool = new JPanel();
    music = new JPanel();
    noteDisplay = new JPanel();
    noteEdit = new JPanel(); 
    tasknote = new JButton();
    textsearch = new JTextField();
    labeltodolist = new JLabel();
    addButton = new CircleButton();
    
    setBackground( new Color(0,0,0));
    
    leftp.setBackground(new Color(255,255,255));
    leftp.setForeground(new Color(255,255,255));    
    timer.setBackground(new Color(235,212,235));
    
    timerLayout = new GroupLayout(timer);
    timer.setLayout(timerLayout);
    timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGap(0,0,Short.MAX_VALUE)

     );timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)                              
                .addGap(0,0,Short.MAX_VALUE)
     );
     
    labeltodolist.setFont(new Font("Comic Sans Ms",0,22));
    labeltodolist.setForeground(new Color(0,153,204));
    labeltodolist.setHorizontalAlignment(SwingConstants.CENTER);
    labeltodolist.setText("Today's Task");
    
    leftpLayout = new GroupLayout(leftp);
    leftp.setLayout(leftpLayout);
    leftpLayout.setHorizontalGroup(
            leftpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)   
           .addComponent(timer,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
           .addComponent(todolist,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE) 
           .addGroup(leftpLayout.createSequentialGroup())
                 .addGap(30,30,30)
                  .addComponent(labeltodolist,GroupLayout.DEFAULT_SIZE,372,Short.MAX_VALUE)
                   .addGap(36,36,36)       
                   
    );
    leftpLayout.setVerticalGroup(
            leftpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(leftpLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labeltodolist, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(todolist, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

    
        rightp.setBackground(new Color(255, 255, 255));
        rightp.setForeground(new Color(255, 255, 255));
        upperp.setBackground(new Color(211, 235, 221));
        calendar.setBackground(new Color(255, 255, 255));

        
        calendarLayout = new GroupLayout(calendar);
        calendar.setLayout(calendarLayout);
        calendarLayout.setHorizontalGroup(
            calendarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        calendarLayout.setVerticalGroup(
            calendarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        music.setBackground(new java.awt.Color(255, 255, 255));

        musicLayout = new GroupLayout(music);
        music.setLayout(musicLayout);
        musicLayout.setHorizontalGroup(
            musicLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        musicLayout.setVerticalGroup(
            musicLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        searchTool.setBackground(new Color(255, 255, 255));

        searchToolLayout = new GroupLayout(searchTool);
        searchTool.setLayout(searchToolLayout);
        searchToolLayout.setHorizontalGroup(
            searchToolLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        searchToolLayout.setVerticalGroup(
            searchToolLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        upperPLayout = new GroupLayout(upperp);
        upperp.setLayout(upperPLayout);
        upperPLayout.setHorizontalGroup(
            upperPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(upperPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(upperPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(calendar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTool, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(music, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        upperPLayout.setVerticalGroup(
            upperPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, upperPLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(upperPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(music, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(upperPLayout.createSequentialGroup()
                        .addComponent(calendar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTool, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );

        lowerp.setBackground(new Color(212, 235, 231));

        noteDisplay.setBackground(new Color(255, 255, 255));

        noteDisplayLayout = new GroupLayout(noteDisplay);
        noteDisplay.setLayout(noteDisplayLayout);
        noteDisplayLayout.setHorizontalGroup(
            noteDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        noteDisplayLayout.setVerticalGroup(
            noteDisplayLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        noteEdit.setBackground(new Color(255, 255, 255));

        noteEditLayout = new GroupLayout(noteEdit);
        noteEdit.setLayout(noteEditLayout);
        noteEditLayout.setHorizontalGroup(
            noteEditLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        noteEditLayout.setVerticalGroup(
            noteEditLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        tasknote.setText("...");

        lowerpLayout = new GroupLayout(lowerp);
        lowerp.setLayout(lowerpLayout);
        lowerpLayout.setHorizontalGroup(
            lowerpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            lowerpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerpLayout.createSequentialGroup()
                .addGroup(lowerpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lowerpLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(noteDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lowerpLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(searchTool, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tasknote, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGap(18, 18, 18)
                .addComponent(noteEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        lowerpLayout.setVerticalGroup(
            lowerpLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerpLayout.createSequentialGroup()
                .addGroup(lowerpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lowerpLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lowerpLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(lowerpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lowerpLayout.createSequentialGroup()
                                .addComponent(noteDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(lowerpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tasknote)
                                    .addComponent(searchTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(noteEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );

        rightPLayout = new GroupLayout(rightp);
        rightp.setLayout(rightPLayout);
        rightPLayout.setHorizontalGroup(
            rightPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, rightPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(upperp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightPLayout.setVerticalGroup(
            rightPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, rightPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upperp, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(rightp, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(leftp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllJFrame().setVisible(true);
            }
        });
    }

//    private void setVisible(boolean b) {

    }
    
//}


       