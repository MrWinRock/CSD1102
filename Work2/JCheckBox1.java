import javax.swing.*;

public class JCheckBox1 {
    JCheckBox1() {
        JFrame f = new JFrame("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        JCheckBox checkBox1 = new JCheckBox("CheckBox 1");
        checkBox1.setBounds(100, 100, 150, 50);
        JCheckBox checkBox2 = new JCheckBox("CheckBox 2", true);
        checkBox2.setBounds(100, 150, 150, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JCheckBox1();
    }
}
