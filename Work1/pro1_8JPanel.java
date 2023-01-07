import javax.swing.*;
import java.awt.*;

public class pro1_8JPanel extends JFrame {
    public static void main(String[] args) {
        new pro1_8JPanel();
    }

    public pro1_8JPanel() {
        setSize(250, 250);
        JTextField jtext = new JTextField();
        jtext.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        setTitle("การสร้าง Subcontainer ด้วย JPanel");

        jtext.setBackground(new Color(225, 225, 225));
        add(jtext, BorderLayout.NORTH);

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(5, 3));
        String[] ops = {"0", "+", "-", "*", "/", "="};

        for(int i = 1; i <= 9; i++) {
            jpanel.add(new JButton(i + ""));
        }
        for(int i = 0; i < ops.length; i++) {
            jpanel.add(new JButton(ops[i]));
        }

        add(jpanel, BorderLayout.CENTER);

        setLocale(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
