import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        JLabel headingLabel = new JLabel("Registration Form", JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headingLabel.setOpaque(true);
        headingLabel.setBackground(new Color(180, 200, 255)); // Light blue background
        headingLabel.setForeground(Color.DARK_GRAY);
        headingLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));


        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBackground(new Color(230, 240, 255));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        formPanel.add(new JLabel("Name:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Address:"));
        formPanel.add(new JTextField());

        formPanel.add(new JLabel("Mobile No:"));
        formPanel.add(new JTextField());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.PINK);
        buttonPanel.add(new JButton("Submit"));
        buttonPanel.add(new JButton("Reset"));

        frame.add(headingLabel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}