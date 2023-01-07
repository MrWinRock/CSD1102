import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work1 extends JFrame {

    JLabel topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, sumLbl, avgLbl;
    JButton calcBtn;
    JTextField f1, f2, f3, f4, f5, sumF, avgF;
    JComponent[] components = { topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, sumLbl, avgLbl, calcBtn, f1, f2, f3, f4, f5, sumF,
            avgF };

    public Work1() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setTitle("โปรแกรมหาค่ารวมและค่าเฉลี่ย: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
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
        sumF = new JTextField();
        avgF = new JTextField();

        // พื้นที่ JLabel
        topLbl.setBounds(153, 70, 295, 17);
        lbl1.setBounds(242, 145, 50, 17);
        lbl2.setBounds(242, 191, 50, 17);
        lbl3.setBounds(242, 224, 50, 17);
        lbl4.setBounds(242, 277, 50, 17);
        lbl5.setBounds(242, 317, 50, 17);
        sumLbl.setBounds(242, 478, 50, 17);
        avgLbl.setBounds(242, 518, 50, 17);

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
        for (JComponent component : components) {
            add(component);
        }

        // 

        setVisible(true);
    }

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        // Get the current look and feel
        java.util.Enumeration keys = UIManager.getDefaults().keys();

        // Iterate over all UI elements and set their font
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