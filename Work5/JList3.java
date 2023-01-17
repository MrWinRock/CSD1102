import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JList3 extends JFrame implements ActionListener {

    JList<String> listAnimals;
    JLabel lb;

    public JList3() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));

        lb = new JLabel("");
        JButton btn = new JButton("แสดง");
        DefaultListModel<String> animals = new DefaultListModel<>();

        animals.addElement("สุนัข");
        animals.addElement("แมว");
        animals.addElement("สิงโต");
        animals.addElement("มังกร");
        animals.addElement("ยูนิคอร์น");
        animals.addElement("ม้านิลมังกร");
        animals.addElement("ปลาทอง");
        
        listAnimals = new JList<>(animals);

        lb.setBounds(140, 50, 400, 30);
        btn.setBounds(150, 300, 80, 30);
        listAnimals.setBounds(150, 100, 100, 150);

        add(btn);
        add(lb);
        add(listAnimals);

        btn.addActionListener(this);

        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String data = "";

        if(listAnimals.getSelectedIndex() != -1) {
            data = "สัตว์ที่เลือก: " + listAnimals.getSelectedValue();
        }
        lb.setText(data);
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
        new JList3();
    }
    
}
