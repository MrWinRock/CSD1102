import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Work5 extends JFrame implements ActionListener {

    JLabel topLbl, lbl1, lbl2;
    JButton submitBtn;
    JRadioButton rb1, rb2, rb3, rb4, rb5;
    JTextField inF;

    public Work5() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setTitle("โปรแกรมคำนวณภาษี: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ButtonGroup bGroup = new ButtonGroup();

        // สร้าง JLabel
        topLbl = new JLabel("โปรแกรมคำนวณภาษี");
        lbl1 = new JLabel("จำนวนเงินที่จะคำนวณภาษี");
        lbl2 = new JLabel("เลือกประเภทกิจการ");
        
        // สร้าง JButton
        submitBtn = new JButton("Submit");
        
        // สร่าง JTextField
        inF = new JTextField();
        
        // สร้าง JRadioButton
        rb1 = new JRadioButton("ธนาคาร");
        rb2 = new JRadioButton("ประกันชีวิต");
        rb3 = new JRadioButton("ตลาดหลักทรัพย์");
        rb4 = new JRadioButton("อสังหาริมทรัพย์");
        rb5 = new JRadioButton("ประเภทอื่นๆ");
        
        // set bounds JLabel
        topLbl.setBounds(37, 23, 120, 20);
        lbl1.setBounds(37, 65, 120, 20);
        lbl2.setBounds(37, 91, 120, 20);

        // set bounds JButton
        submitBtn.setBounds(50, 250, 100, 30);

        // set bounds JTextField
        inF.setBounds(175, 61, 115, 25);

        // set bounds JRadioButton
        rb1.setBounds(50, 132, 200, 20);
        rb2.setBounds(50, 151, 200, 20);
        rb3.setBounds(50, 170, 200, 20);
        rb4.setBounds(50, 189, 200, 20);
        rb5.setBounds(50, 208, 200, 20);

        // add to group
        bGroup.add(rb1);
        bGroup.add(rb2);
        bGroup.add(rb3);
        bGroup.add(rb4);
        bGroup.add(rb5);

        // add
        add(topLbl);
        add(lbl1);
        add(lbl2);
        add(submitBtn);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
        add(inF);

        submitBtn.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int num, tax;
        
        if(e.getSource() == submitBtn) {
            if(rb1.isSelected()) {
                
            }
            if(rb2.isSelected()) {

            }
            if(rb3.isSelected()) {

            }
            if(rb4.isSelected()) {

            }
            if(rb5.isSelected()) {

            }
        }
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
        new Work5();
    }
}
