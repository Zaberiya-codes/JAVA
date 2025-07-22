import javax.swing.*;
import java.awt.*;

public class panelDemo3_Size {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sized JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(null);

        JPanel panel= new JPanel();
        panel.setBackground(Color.pink);
        panel.setBounds(50,50,200,100);

        frame.add(panel);
        frame.setVisible(true);
    }
}
