    package classes;


    import java.awt.Color;
    import java.awt.Component;
    import java.awt.Dimension;
    import java.awt.GridLayout;

    import javax.swing.JPanel;

    public class CheckList extends JPanel {

        CheckList() { 
        GridLayout grid = new GridLayout(11,1);
        grid.setVgap(5);
        this.setLayout(grid);
        this.setBackground(new Color(63,65,67));

    }

    public void updateListsNumbers() {


        Component[] listItem = this.getComponents();

        for(int i = 0; i < listItem.length; i++) {
            if(listItem[i] instanceof Tasks) {
                ((Tasks)listItem[i]).countOn(i+1);
            }
        }


    }

        public void clearCompletedTasks() {
            for(Component c : getComponents()) {
                if(c instanceof Tasks) {
                    if(((Tasks)c).checkFinished()) {
                        remove(c);
                        updateListsNumbers();
                    }
                }
            }
        }
    }

