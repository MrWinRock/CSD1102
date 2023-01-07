import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;

public class Work3 extends JFrame {

    JLabel topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, sumLbl;
    JTextField f1, f2, f3, f4, f5;
    JButton calcBtn;
    JComponent[] components = { topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, sumLbl, f1, f2, f3,
            f4, f5,
            calcBtn };

    public Work3() {

        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setTitle("โปรแกรมค่าทัวร์: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // สร้าง Label
        topLbl = new JLabel("");
        lbl1 = new JLabel("");
        lbl2 = new JLabel("");
        lbl3 = new JLabel("");
        lbl4 = new JLabel("");
        lbl5 = new JLabel("");
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

        // 
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
