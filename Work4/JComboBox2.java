import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBox2 extends JFrame implements ActionListener {

    JLabel l, resultLbl;
    JComboBox cb;

    public JComboBox2() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setBounds(100, 100, 343, 273);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        l = new JLabel("โปรดเลือกสัตว์ที่ชอบ");
        resultLbl = new JLabel("");

        JButton showBtn = new JButton("คลิกเลือก");

        String animals[] = { "จระเข้", "ตัวเงินตัวทอง", "มังกร", "ไดโนเสาร์", "สิงโตภูเขา", "ยูนิคอร์น", "ครุฑ" };
        cb = new JComboBox(animals);

        l.setBounds(80, 30, 300, 20);
        resultLbl.setBounds(80, 180, 300, 20);
        cb.setBounds(113, 76, 107, 20);
        showBtn.setBounds(126, 123, 81, 30);

        getContentPane().add(l);
        getContentPane().add(showBtn);
        getContentPane().add(cb);
        getContentPane().add(resultLbl);
        getContentPane().setLayout(null);

        showBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String show = "สัตว์ที่ท่านเลือก: " + cb.getItemAt(cb.getSelectedIndex());
        resultLbl.setText(show);
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
        new JComboBox2();
    }
}