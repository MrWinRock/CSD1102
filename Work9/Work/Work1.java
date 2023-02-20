package Work;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work1 extends JFrame implements ActionListener {
    JTextField name, quan, price;
    JButton bAddData;
    JLabel hl, l1, l2, l3;

    public Work1() {

        setUIFont(new javax.swing.plaf.FontUIResource("Arial", Font.PLAIN, 16));
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์ 65122250031");
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        hl = new JLabel("Sale Product Item");
        l1 = new JLabel("Product Name");
        l2 = new JLabel("Quantity");
        l3 = new JLabel("Price");

        name = new JTextField();
        quan = new JTextField();
        price = new JTextField();

        bAddData = new JButton("Add Data");

        add(l1);
        add(l2);
        add(l3);
        add(name);
        add(quan);
        add(price);
        add(hl);
        add(bAddData);

        hl.setBounds(220, 10, 200, 30);
        l1.setBounds(40, 50, 100, 30);
        l2.setBounds(220, 50, 100, 30);
        l3.setBounds(400, 50, 100, 30);
        name.setBounds(40, 100, 150, 30);
        quan.setBounds(220, 100, 150, 30);
        price.setBounds(400, 100, 150, 30);
        bAddData.setBounds(220, 180, 120, 40);

        bAddData.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        FileWriter fwriter;
        try {
            fwriter = new FileWriter("Product.txt", true);
            PrintWriter outputFile = new PrintWriter(fwriter);

            if (e.getSource() == bAddData) {
                outputFile.println(name.getText());
                outputFile.println(quan.getText());
                outputFile.println(price.getText());
            }

            outputFile.close();
        } catch (IOException e1) {
            e1.printStackTrace();
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
        new Work1();
    }
}