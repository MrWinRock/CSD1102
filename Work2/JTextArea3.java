import java.awt.event.*;
import javax.swing.*;


public class JTextArea3 implements ActionListener {
    JLabel l1;
    JTextArea area;
    JButton b;

    JTextArea3() {
        JFrame f = new JFrame();
        
        l1 = new JLabel();
        l1.setBounds(175, 230, 200, 30);
        area = new JTextArea();
        area.setBounds(175, 100, 130, 50);
        b = new JButton("Button");
        b.setBounds(175, 160, 120, 30);
        b.addActionListener(this);
        f.add(l1);
        f.add(area);
        f.add(b);
        f.setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        f.setSize(500, 450);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l1.setText("Hello : " + area.getText());
        for (String line : area.getText().split("\\n")) {
            System.out.println(line);
        }
    }
    public static void main(String[] args) {
        new JTextArea3();
    }
}