import javax.swing.*;

public class panelDemo1_simple {
    public static void main(String[] args) {
        JFrame frame= new JFrame("simple Jpanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JPanel panel= new JPanel();
        frame.add(panel);

        frame.setVisible(true)    ;
    }
}
