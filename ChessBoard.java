import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class ChessBoard {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("chess board- Gridlayout example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        //created panel with 8x8 grid layout
        JPanel board = new JPanel (new GridLayout(8,8));

        //loop throgh rows and columns
        for(int row= 0; row<8; row++){
            for(int col= 0; col<8; col++){
                JLabel square = new JLabel();
                square.setOpaque(true);//necessary for background color

                //set alternating colors using chessboard logic
                if((row +col)%2==0) {
                    square.setBackground(Color.white);
                }else{
                    square.setBackground(Color.DARK_GRAY);
                }
                board.add(square);
            }
        }
        //add board to frame
        frame.add(board);
        frame.setVisible(true);
    }
}
