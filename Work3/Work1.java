import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work1 extends JFrame implements ActionListener {

    JLabel topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, sumLbl, avgLbl;
    JButton calcBtn;
    JTextField f1, f2, f3, f4, f5, sumF, avgF;

    public Work1() {
        setTitle("โปรแกรมหาค่ารวมและค่าเฉลี่ย: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // สร้าง JLabel
        topLbl = new JLabel("โปรแกรมหาค่ารวมและค่าเฉลี่ย: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        lbl1 = new JLabel("จำนวนที่ 1");
        lbl2 = new JLabel("จำนวนที่ 2");
        lbl3 = new JLabel("จำนวนที่ 3");
        lbl4 = new JLabel("จำนวนที่ 4");
        lbl5 = new JLabel("จำนวนที่ 5");
        sumLbl = new JLabel("ค่ารวม");
        avgLbl = new JLabel("ค่าเฉลี่ย");

        // สร้าง JButton
        calcBtn = new JButton("คำนวณ");

        // สร้าง JTextField
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        f4 = new JTextField();
        f5 = new JTextField();
        sumF = new JTextField("");
        avgF = new JTextField("");

        sumF.setEditable(false);
        avgF.setEditable(false);

        // พื้นที่ JLabel
        topLbl.setBounds(153, 70, 300, 17);
        lbl1.setBounds(242, 143, 70, 17);
        lbl2.setBounds(242, 188, 70, 17);
        lbl3.setBounds(242, 230, 70, 17);
        lbl4.setBounds(242, 272, 70, 17);
        lbl5.setBounds(242, 317, 70, 17);
        sumLbl.setBounds(242, 473, 50, 17);
        avgLbl.setBounds(242, 513, 50, 17);

        // พื้นที่ JButton
        calcBtn.setBounds(248, 362, 80, 50);

        // พื้นที่ JTextField
        f1.setBounds(330, 135, 60, 30);
        f2.setBounds(330, 180, 60, 30);
        f3.setBounds(330, 223, 60, 30);
        f4.setBounds(330, 264, 60, 30);
        f5.setBounds(330, 307, 60, 30);
        sumF.setBounds(330, 466, 60, 30);
        avgF.setBounds(330, 508, 60, 30);

        // add
        add(topLbl);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(sumLbl);
        add(avgLbl);
        add(calcBtn);
        add(f1);
        add(f2);
        add(f3);
        add(f4);
        add(f5);
        add(sumF);
        add(avgF);

        // add event listener
        calcBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int n1, n2, n3, n4, n5;
        double sum, avg;
        n1 = Integer.parseInt(f1.getText());
        n2 = Integer.parseInt(f2.getText());
        n3 = Integer.parseInt(f3.getText());
        n4 = Integer.parseInt(f4.getText());
        n5 = Integer.parseInt(f5.getText());
        sum = 0;
        avg = 0;

        if (e.getSource() == calcBtn) {
            sum = n1 + n2 + n3 + n4 + n5;
            avg = sum / 5;
        }

        String r_sum = String.valueOf(sum);
        String r_avg = String.valueOf(avg);

        sumF.setText(r_sum);
        avgF.setText(r_avg);
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
        new Work1();
    }

}