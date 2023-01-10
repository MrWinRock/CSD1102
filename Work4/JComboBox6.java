import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBox6 extends JFrame implements ActionListener {

    JLabel l, resultLbl;
    JComboBox cb;

    public JComboBox6() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setBounds(100, 100, 400, 300);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        l = new JLabel("โปรดเลือกโปรแกรมที่ท่านชำนาญ: ");
        resultLbl = new JLabel("");

        JButton showBtn = new JButton("คลิกเลือก");

        String proLang[] = { "Javascript", "Java", "C", "C++", "C#", "PHP", "GOLANG", "Kotlin", "Pascal", "Ruby", "R",
                "Swift", "Typescript", "SQL", "MATLAB", "Rust", "Dart" };
        cb = new JComboBox(proLang);

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

        String show = "โปรแกรมที่ท่านเลือก: " + cb.getItemAt(cb.getSelectedIndex());
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
        new JComboBox6();
    }
}