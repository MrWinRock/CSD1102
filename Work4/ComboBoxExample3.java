import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample3 extends JFrame {

    ComboBoxExample3() {
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(380, 100);
        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String languages[] = { "C", "C++", "C#", "Java", "PHP" };
        JComboBox cb = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);
        add(cb);
        add(label);
        add(b);
        setLayout(null);
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ComboBoxExample3();
    }
}
