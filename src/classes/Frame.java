    package classes;


    import java.awt.BorderLayout;
    import java.awt.event.MouseAdapter;
    import java.awt.event.MouseEvent;
    import java.awt.event.MouseListener;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JTextArea;

    public class Frame extends JFrame {

        private TextField text;
        private buttonComponent btnComp;
        private CheckList checkList;

        private JButton addTask;
        private JButton clearTasks;

        Frame() {

            this.setVisible(true);
            this.setSize(370, 650);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            text = new TextField();
            btnComp = new buttonComponent();
            checkList = new CheckList();
            this.add(text,BorderLayout.NORTH);
            this.add(btnComp, BorderLayout.SOUTH);
            this.add(checkList, BorderLayout.CENTER);

            addTask = btnComp.getAddTask();
            clearTasks = btnComp.getClearTasks();

            addListeners();
        }

        public void addListeners() {

            addTask.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    Tasks task1 = new Tasks();
                    checkList.add(task1);
                    checkList.updateListsNumbers();
                    task1.finishedTask().addMouseListener(new MouseAdapter () {


                        @Override
                        public void mousePressed(MouseEvent e) {
                            task1.changeColor();
                            revalidate();
                        }

                    });
                    revalidate();
                }
                
            });

            clearTasks.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    checkList.clearCompletedTasks();
                    repaint();
                }
            });

        }

    }
