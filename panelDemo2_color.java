import javax.swing.*;
import java.awt.*;
public class panelDemo2_color {
    public static void main(String[] args) {
        JFrame frame=new JFrame("colored JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);

        frame.add(panel);
        frame.setVisible(true);
    }
}
