import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class panelDemo4_border {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Bordered Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel= new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(new LineBorder(Color.red,5));

        frame.add(panel);
        frame.setVisible(true);
    }
}
