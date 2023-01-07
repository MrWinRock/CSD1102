import javax.swing.*;
import java.awt.*;

public class pro1_3_GridLayout extends JFrame {
    
    public static void main(String[] args) {
        new pro1_3_GridLayout();
    }

    public pro1_3_GridLayout() {
        setTitle("Tic Tac Toe: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 3, 5, 5));
        Font font = new Font("Microsoft Sans Serif", Font.PLAIN, 14);
        String label = "O";
        JButton button;
        for (int i = 1; i <= 9; i++) {
            label = label.equals("O") ? "X" : "O";
            button = new JButton(label);
            button.setFont(font);
            add(button);
        }

        setVisible(true);
    }
}
