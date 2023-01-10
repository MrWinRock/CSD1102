import javax.swing.*;
import java.awt.*;

public class JComboBox1 extends JFrame {

    JLabel l;

    public JComboBox1() {
        setTitle("หลักการเขียนโปรแกรมคอมพิวเตอร์: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        String[] petString = { "นก", "แมว", "หมา", "กระต่าย", "หมู" };
        final JComboBox comboBox = new JComboBox(petString);
        comboBox.setSelectedIndex(4);
        comboBox.setBounds(120, 80, 110, 20);
        getContentPane().add(comboBox);

        JButton btn = new JButton("คลิกเลือก");
        btn.setBounds(130, 130, 89, 30);
        getContentPane().add(btn);
    }

    public void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource)
                UIManager.put(key, f);
        }
    }

    public static void main(String[] args) {
        new JComboBox1();
    }
}