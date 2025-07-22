
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        //create JFrame
        JFrame frame= new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);

        JPanel panel= new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        panel.add(new JButton("North(Top)"), BorderLayout.NORTH);
        panel.add(new JButton("South (Bottom)"), BorderLayout.SOUTH);
        panel.add(new JButton("West(Left)"),BorderLayout.WEST);
        panel.add(new JButton("East(Right)"),BorderLayout.EAST);
        panel.add(new JButton("Center(Main Rea)"),BorderLayout.CENTER);

        frame.add(panel);
        frame.setVisible(true);
    }
}
