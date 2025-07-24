import javax.swing.*;
import java.awt.*;

public class BoxLayoutAnalogy {
    public static void main(String[] args) {
        //create main frame
        JFrame frame= new JFrame("Bookshelf and Toolbox Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setLayout(new GridLayout(1,2));//split window into 2 equal panels
        //================= LEFT PANEL BOOKSHELF=============
        JPanel bookshelPanel = new JPanel();
        bookshelPanel.setLayout(new BoxLayout(bookshelPanel, BoxLayout.Y_AXIS));
        bookshelPanel.setBorder(BorderFactory.createTitledBorder("📚Bookshelf"));

        //add book labels(vertical)

        bookshelPanel.add(new JLabel("📘Java Programming"));
        bookshelPanel.add(Box.createVerticalStrut(10));

        bookshelPanel.add(new JLabel("📗Data structure"));
        bookshelPanel.add(Box.createVerticalStrut(10));

        bookshelPanel.add(new JLabel("📙Operating system"));
        bookshelPanel.add(Box.createVerticalStrut(10));

        bookshelPanel.add(new JLabel("📕Computer networks"));

        //==================RIGHT PANEL- TOOLBOX============
        JPanel toolboxPanel= new JPanel();
        toolboxPanel.setLayout(new BoxLayout(toolboxPanel, BoxLayout.Y_AXIS));
        toolboxPanel.setBorder(BorderFactory.createTitledBorder("🧰Toolbox"));

        //add tool buttons (horizontal)
        toolboxPanel.add(Box.createHorizontalStrut(10));
        toolboxPanel.add(new JButton("🔧Wrench"));

        toolboxPanel.add(Box.createHorizontalStrut(10));
        toolboxPanel.add(new JButton("🔨Hammer"));

        toolboxPanel.add(Box.createHorizontalStrut(10));
        toolboxPanel.add(new JButton("🪛Screwdriver"));

        toolboxPanel.add(Box.createHorizontalStrut(10));
        toolboxPanel.add(new JButton("🪚Saw"));

        //add frames to both panel
        frame.add(bookshelPanel);
        frame.add(toolboxPanel);
        frame.setVisible(true);


    }
}
