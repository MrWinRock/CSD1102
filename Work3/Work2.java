import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work2 extends JFrame implements ActionListener{
    
    JLabel topLbl, lbl1, disLbl, sumLbl;
    JTextField f1, disF, sumF;
    JButton calcBtn;

    public Work2() {

        setTitle("โปรแกรมค่าสินค้า: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // สร้าง JLabel
        topLbl = new JLabel("โปรแกรมค่าสินค้า: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        lbl1 = new JLabel("ราคาสินค้า");
        disLbl = new JLabel("ส่วนลด");
        sumLbl = new JLabel("ราคาสุทธิ");

        // สร้าง JButton
        calcBtn = new JButton("คำนวณ");

        // สร้าง JTextField
        f1 = new JTextField();
        disF = new JTextField("");
        sumF = new JTextField("");

        disF.setEditable(false);
        sumF.setEditable(false);

        // พื้นที่ JLabel
        topLbl.setBounds(236, 62, 227,17);
        lbl1.setBounds(251, 134, 60, 16);
        disLbl.setBounds(251, 344, 60, 16);
        sumLbl.setBounds(251, 397, 60, 16);

        // พื้นที่ JButton
        calcBtn.setBounds(291, 225, 117, 43);

        // พื้นที่ JTextField
        f1.setBounds(336, 125, 106, 33);
        disF.setBounds(336, 335, 106, 33);
        sumF.setBounds(336, 390, 106, 33);

        // add
        add(topLbl); 
        add(lbl1);
        add(disLbl);
        add(sumLbl);
        add(calcBtn);
        add(f1);
        add(disF);
        add(sumF);

        calcBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double dis = 0, sum = 0;
        int price = Integer.parseInt(f1.getText());

        if(e.getSource() == calcBtn) {
            if(price > 100000) {
                dis = price * 0.1;
                sum = price - dis;
            }
            else if(price > 10000) {
                dis = price * 0.05;
                sum = price - dis;
            }
            else if(price >= 0) {
                dis = price * 0.03;
                sum = price - dis;
            }
        }

        String r_sum = String.valueOf(sum);
        String r_dis = String.valueOf(dis);

        sumF.setText(r_sum);
        disF.setText(r_dis);

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
        new Work2();
    }
}