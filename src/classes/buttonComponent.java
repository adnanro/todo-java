    package classes;


    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;

    import javax.swing.BorderFactory;
    import javax.swing.Box;
    import javax.swing.JButton;
    import javax.swing.JPanel;
    import javax.swing.JTextArea;
    import javax.swing.border.Border;

    public class buttonComponent extends JPanel{

        JButton addTask;
        JButton clearTasks;

        Border empty = BorderFactory.createEmptyBorder();

        buttonComponent() {
        
            this.setPreferredSize(new Dimension(370, 60));
            this.setBackground(new Color(182,182,182));

            addTask = new JButton("+");
            addTask.setBorder(empty);
            addTask.setPreferredSize(new Dimension(50,25));
            addTask.setFont(new Font("Ink Free", Font.BOLD, 22));
            addTask.setBackground(new Color(0,0,0));
            addTask.setForeground(Color.white);
            addTask.setVerticalAlignment(JButton.BOTTOM);

            this.add(addTask);
            this.add(Box.createHorizontalStrut(30));
            

            clearTasks = new JButton("Clear Finished");
            clearTasks.setBorder(empty);
            clearTasks.setFont(new Font("Ink Free", Font.BOLD, 20));
            clearTasks.setBackground(new Color(0,0,0));
            clearTasks.setForeground(Color.white);

            this.add(clearTasks);


        }

        public JButton getAddTask() {
            return addTask;
        }

        public JButton getClearTasks() {
            return clearTasks;
        }
        
    }
