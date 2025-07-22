package Swing;
import javax.swing.*;
import java.awt.*;

public class TextFieldDemo {
    public static void main(String[] args){
        JFrame frame=new JFrame("JTextField Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JTextField tf=new JTextField(20);
        frame.add(tf);
        String input= tf.getText();
        System.out.println("You Typed:" + input);
        frame.setVisible(true);
    }
}
