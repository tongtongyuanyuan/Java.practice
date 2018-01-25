import java.awt.*;
//import java.awt.Color;
import javax.swing.*;


public class GridLayoutTest extends JFrame {
    public GridLayoutTest(String title, int w, int h, Color color) {
        super(title);
        setSize(w, h);
        Container c = this.getContentPane();
        c.setBackground(color);
        JButton b = new JButton("OK");
        c.add(BorderLayout.EAST, b);

        JPanel p = new JPanel();
        p.setBackground(new Color(150, 0, 150));
        p.setLayout(new GridLayout(3, 4,5,10));
        for (int i = 0; i < 12; i++) {
            b = new JButton(i + "");
            p.add(b);
        }
        c.add(BorderLayout.CENTER, p);
// GridBagLayout for fancier layout where some boxes are bigger than others


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        }
    public static void main(String[] args) {
       GridLayoutTest w1 = new GridLayoutTest("My clock",400,400,Color.YELLOW);
    }
}
