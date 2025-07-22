import javax.swing.*;
import java.awt.*;

public class image {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image in JPanel - IntelliJ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel imagePanel = new JPanel() {
            final Image backgroundImage = new ImageIcon("image/space.jpg").getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        frame.add(imagePanel);
        frame.setVisible(true);
    }
}