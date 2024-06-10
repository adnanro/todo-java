    package classes;


    import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;

    import javax.swing.BorderFactory;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class Tasks extends JPanel {
        
        JLabel index;
        JTextField exampleTask;
        JButton finished;

        private boolean checkmarked;

        Tasks() {
            this.setPreferredSize(new Dimension(40,20));
            this.setBackground(new Color(255,255,0));

            this.setLayout(new BorderLayout());

            checkmarked  = false;

            index = new JLabel("");
            index.setPreferredSize(new Dimension(20,20));
            index.setFont(new Font("Ink Free", Font.BOLD,15));
            index.setHorizontalAlignment(JLabel.CENTER);
            this.add(index, BorderLayout.WEST);

            exampleTask = new JTextField("Enter Your Duty Here");
            exampleTask.setBorder(BorderFactory.createEmptyBorder());
            exampleTask.setBackground(new Color(0,0,0));
            exampleTask.setForeground(Color.white);
            

            this.add(exampleTask, BorderLayout.CENTER);

            finished = new JButton("Done");
            finished.setPreferredSize(new Dimension(40,20));
            finished.setBorder(BorderFactory.createEmptyBorder());
            finished.setFocusPainted(false);
            finished.setBackground(new Color(255,255,0));
            finished.setForeground(new Color(0,0,0));
            finished.setFont(new Font("Ink Free", Font.BOLD,15));
            
            

            this.add(finished, BorderLayout.EAST);



        }

        public void countOn(int num) {

            this.index.setText(num+". ");
            this.revalidate();
        }
        public JButton finishedTask() {
            return finished;
        }


        public void changeColor() {
            this.setBackground(Color.green);
            exampleTask.setBackground(Color.green);
            finished.setBackground(Color.green);
            checkmarked = true;
            
        }
        public boolean checkFinished() {
            return checkmarked;
        }

    
    }
