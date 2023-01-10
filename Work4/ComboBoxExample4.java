import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample4 extends JFrame {

    ComboBoxExample4() {
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        String phones[] = { "IPhone", "Samsung", "Xiao Mi", "Huawei", "Pixel", "OPPO", "VIVO" };
        JComboBox cb = new JComboBox(phones);
        cb.setBounds(150, 70, 90, 20);
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(280, 100);
        JButton b = new JButton("Show");
        b.setBounds(150, 400, 90, 20);
        add(cb);
        add(label);
        add(b);
        setLayout(null);
        setSize(400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Phones Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ComboBoxExample4();
    }

}