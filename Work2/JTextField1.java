import java.awt.event.*;
import javax.swing.*;

public class JTextField1 extends JFrame {

    JLabel l1, l2;
    JTextArea area;
    JButton b;

    public JTextField1() {

        setTitle("CSD1102 ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setBounds(600, 350, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        final JTextField txt = new JTextField();
        txt.setBounds(225, 100, 120, 32);
        getContentPane().add(txt);
        txt.setColumns(20);

        final JLabel lbl = new JLabel();
        lbl.setBounds(225, 200, 120, 60);
        getContentPane().add(lbl);

        JButton btn1 = new JButton("Click");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lbl.setText("Hello: " + txt.getText());
            }
        });

        btn1.setBounds(235, 150, 99, 23);
        getContentPane().add(btn1);

        setVisible(true);

    }
    
    public static void main(String[] args) {
        new JTextField1();        
    }


}