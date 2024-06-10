    package classes;


    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;

    import javax.swing.JLabel;
    import javax.swing.JPanel;

    public class TextField extends JPanel {

        TextField() {
            this.setPreferredSize(new Dimension(370, 70));
            this.setBackground(new Color(0,0,0));
            
            JLabel text = new JLabel("THINGS TO DO:");
            text.setFont(new Font("Ink Free", Font.BOLD,20));
            text.setPreferredSize(new Dimension(200,40));
            text.setForeground(new Color(255,255,255));
            text.setBackground(new Color(0,204,204));
            text.setHorizontalAlignment(JLabel.CENTER);
            this.add(text);

        }

    }
