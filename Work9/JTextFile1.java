import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFile1 implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    String s1, s2, s3;
    String filename;
    JFrame f;

    JTextFile1() {

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("CSD1102 การโปรแกรมคอมพิวเตอร์ชั้นสูง");
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 80, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 110, 150, 20);

        b1 = new JButton("Add Data");
        b1.setBounds(50, 200, 100, 50);
        b1.addActionListener((java.awt.event.ActionListener) this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.setSize(450, 300);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(e1 -> {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("TestFile.txt"));
                bw.write(tf1.getText());
                bw.newLine();
                bw.write(tf2.getText());
                bw.newLine();
                bw.write(tf3.getText());
                bw.newLine();
                bw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

    } //

    public static void main(String[] args) {
        new JTextFile1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

} // end class