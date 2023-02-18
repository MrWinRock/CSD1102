import java.io.FileWriter;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame {
    JTextField num, name, count, price, filename;
    JButton click;
    JLabel l1, l2;

    public Test1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setTitle("ณัฐกานต์ กลองกระโทก 65122250069");

        l1 = new JLabel("Enter Item Number");
        num = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(num);
        panel.setBounds(90, 50, 200, 50);
        getContentPane().add(panel);
        getContentPane().setLayout(null);

        click = new JButton("Submit");
        click.addActionListener(new Calcbuttonlistener());
        JPanel panel1 = new JPanel();
        panel1.add(click);
        panel1.setBounds(245, 150, 100, 50);
        getContentPane().add(panel1);
        getContentPane().setLayout(null);

        l2 = new JLabel("Enter Filename");
        filename = new JTextField(10);
        JPanel panel2 = new JPanel();
        panel2.add(l2);
        panel2.add(filename);
        panel2.setBounds(300, 50, 200, 50);
        getContentPane().add(panel2);
        getContentPane().setLayout(null);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public class Calcbuttonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == click) {
                String number, fname;
                number = num.getText();
                fname = filename.getText();
                int count = Integer.parseInt(number);
                for (int i = 0; i < count; i++) {
                    String ms = JOptionPane.showInputDialog(null, "input name", "กรุณาใส่ชื่อสินค้า",
                            JOptionPane.INFORMATION_MESSAGE);
                    String ms1 = JOptionPane.showInputDialog(null, "input count", "กรุณาใส่จำนวนสินค้า",
                            JOptionPane.INFORMATION_MESSAGE);
                    String ms2 = JOptionPane.showInputDialog(null, "input price", "กรุณาใส่ราคาสินค้า",
                            JOptionPane.INFORMATION_MESSAGE);
                    try {
                        FileWriter writer = new FileWriter(fname, true);
                        writer.write(ms);
                        writer.write("\n");
                        writer.write(ms1);
                        writer.write("\n");
                        writer.write(ms2);
                        writer.write("\n");
                        writer.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Test1();
    }
}