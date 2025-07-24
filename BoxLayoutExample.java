import javax.swing.*;
import java.awt.*;
public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame frame= new JFrame("BoxLayout- vertical list");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);

        //created a JPanel
        JPanel panel= new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20,50,20,50));

        //adds buttons vertically
        panel.add(new JButton("Dashboard"));
        panel.add(Box.createVerticalStrut(10));//gap between components

        panel.add(new JButton("Profile"));
        panel.add(Box.createVerticalStrut(10));//gap between components

        panel.add(new JButton("Settings"));
        panel.add(Box.createVerticalStrut(10));//gap between components

        panel.add(new JButton("Logout"));

        //add to frame
        frame.add(panel);
        frame.setVisible(true);

    }
}
