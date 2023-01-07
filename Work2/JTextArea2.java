import java.awt.event.*;
import javax.swing.*;

public class JTextArea2 extends JFrame implements ActionListener{
    
    JLabel l1, l2;
    JTextArea area;
    JButton b;

    public JTextArea2() {
        l1 = new JLabel();
        l1.setBounds(100, 50, 125, 35);
        l2 = new JLabel();
        l2.setBounds(165, 50, 125, 35);
        area = new JTextArea();
        area.setBounds(100, 75, 275, 225);
        b = new JButton("Count Words");
        b.setBounds(125, 325, 245, 35);
        b.addActionListener(this);
        
        add(l1);
        add(l2);
        add(area);
        add(b);
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String text = area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: " + words.length);
        l2.setText("Characters: " + text.length());
    }

    public static void main(String[] args) {
        new JTextArea2();
    }
}
