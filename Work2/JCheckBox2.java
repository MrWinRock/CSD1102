import javax.swing.*;
import java.awt.event.*;

public class JCheckBox2 {
    JCheckBox2() {
        JFrame f = new JFrame("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100, 140, 400, 100);
        JCheckBox checkbox1 = new JCheckBox("CheckBox 1");
        checkbox1.setBounds(230, 230, 150, 50);
        JCheckBox checkbox2 = new JCheckBox("CheckBox 2");
        checkbox2.setBounds(230, 280, 150, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.add(label);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("CheckBox 1 Checkbox: "
                        + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("CheckBox 2 Checkbox: "
                        + (e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });
        f.setSize(600, 600);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JCheckBox2();
    }
}
