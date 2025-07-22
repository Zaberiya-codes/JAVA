package Swing;
import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args){
        JFrame frame=new JFrame("JButton Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JButton button=new JButton("Click me");
        button.setBackground (Color.magenta);
        button.setForeground(Color.cyan);
        button.setFont(new Font("Arial", Font.BOLD,16 ));
        button.setFocusPainted(false);
        frame.add(button);

        frame.setVisible(true);
    }
}
