import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Work3 extends JFrame implements ActionListener {

    JLabel topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lblq1, lblq2, lblq3, lblq4, lblq5,
            sumLbl;
    JTextField f1, f2, f3, f4, f5;
    JButton calcBtn;

    public Work3() {

        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setTitle("โปรแกรมค่าทัวร์: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // สร้าง Label
        topLbl = new JLabel("โปรแกรมค่าทัวร์: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        lbl1 = new JLabel("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน");
        lbl2 = new JLabel("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน");
        lbl3 = new JLabel("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน");
        lbl4 = new JLabel("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน");
        lbl5 = new JLabel("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน");
        lblq1 = new JLabel("จำนวน");
        lblq2 = new JLabel("จำนวน");
        lblq3 = new JLabel("จำนวน");
        lblq4 = new JLabel("จำนวน");
        lblq5 = new JLabel("จำนวน");
        lbl6 = new JLabel("");
        lbl7 = new JLabel("");
        lbl8 = new JLabel("");
        lbl9 = new JLabel("");
        lbl10 = new JLabel("");
        sumLbl = new JLabel("");

        // สร้าง JTextField
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        f4 = new JTextField();
        f5 = new JTextField();

        // สร้าง JButton
        calcBtn = new JButton("คำนวณค่าทัวร์");

        // พื้นที่ JLabel
        topLbl.setBounds(292, 88, 220, 17);
        lbl1.setBounds(120, 153, 325, 29);
        lbl2.setBounds(120, 203, 325, 29);
        lbl3.setBounds(120, 246, 325, 29);
        lbl4.setBounds(120, 294, 325, 29);
        lbl5.setBounds(120, 337, 325, 29);
        lblq1.setBounds(535, 153, 100, 27);
        lblq2.setBounds(535, 198, 100, 27);
        lblq3.setBounds(535, 248, 100, 27);
        lblq4.setBounds(535, 290, 100, 27);
        lblq5.setBounds(535, 338, 100, 27);
        lbl6.setBounds(120, 527, 700, 29);
        lbl7.setBounds(120, 564, 700, 29);
        lbl8.setBounds(120, 597, 700, 29);
        lbl9.setBounds(120, 631, 700, 29);
        lbl10.setBounds(120, 664, 700, 29);
        sumLbl.setBounds(385, 707, 162, 27);

        // พื้นที่ JButton
        calcBtn.setBounds(298, 418, 244, 50);

        // พื้นที่ JTextField
        f1.setBounds(574, 146, 60, 35);
        f2.setBounds(574, 191, 60, 35);
        f3.setBounds(574, 239, 60, 35);
        f4.setBounds(574, 284, 60, 35);
        f5.setBounds(574, 330, 60, 35);

        // add
        add(topLbl);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lbl10);
        add(lblq1);
        add(lblq2);
        add(lblq3);
        add(lblq4);
        add(lblq5);
        add(sumLbl);
        add(calcBtn);
        add(f1);
        add(f2);
        add(f3);
        add(f4);
        add(f5);

        calcBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int q1, q2, q3, q4, q5, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, sum = 0,
                por = 50000,
                bal = 49000,
                pol = 48000,
                mon = 47000,
                spa = 46000;

        q1 = Integer.parseInt(f1.getText());
        q2 = Integer.parseInt(f2.getText());
        q3 = Integer.parseInt(f3.getText());
        q4 = Integer.parseInt(f4.getText());
        q5 = Integer.parseInt(f5.getText());

        if (e.getSource() == calcBtn) {
            p1 = por * q1;
            p2 = bal * q2;
            p3 = pol * q3;
            p4 = mon * q4;
            p5 = spa * q5;
            sum = p1 + p2 + p3 + p4 + p5;
        }

        String porP = String.valueOf(p1);
        String balP = String.valueOf(p2);
        String polP = String.valueOf(p3);
        String monP = String.valueOf(p4);
        String spaP = String.valueOf(p5);
        String sumP = String.valueOf(sum);

        lbl6.setText("1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน    จำนวน " + q1 + " คน = " + porP + " บาท");
        lbl7.setText("2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน    จำนวน " + q2 + " คน = " + balP + " บาท");
        lbl8.setText("3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน    จำนวน " + q3 + " คน = " + polP + " บาท");
        lbl9.setText("4) แพคเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน     จำนวน " + q4 + " คน = " + monP + " บาท");
        lbl10.setText("5) แพคเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน       จำนวน " + q5 + " คน = " + spaP + " บาท");
        sumLbl.setText("รวมทั้งสิ้น = " + sumP + " บาท");
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
        new Work3();

    }

}
