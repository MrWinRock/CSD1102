import javax.swing.*;
import java.awt.event.*;

public class JList2 extends JFrame implements ActionListener {

    JList<String> listPrograms, listCPP, listJava, listJS, listPy;
    JLabel lb;

    public JList2() {
        lb = new JLabel("");
        JButton btn = new JButton("Show");
        DefaultListModel<String> lmPrograms = new DefaultListModel<>();
        DefaultListModel<String> fwCPP = new DefaultListModel<>();
        DefaultListModel<String> fwJava = new DefaultListModel<>();
        DefaultListModel<String> fwJS = new DefaultListModel<>();
        DefaultListModel<String> fwPy = new DefaultListModel<>();

        lmPrograms.addElement("C++");
        lmPrograms.addElement("Java");
        lmPrograms.addElement("Javascirpt");
        lmPrograms.addElement("Python");

        fwCPP.addElement("Apache");
        fwCPP.addElement("Boost");
        fwCPP.addElement("ROOT");

        fwJava.addElement("Spring");
        fwJava.addElement("Hibernate");
        fwJava.addElement("Struts");

        fwJS.addElement("React");
        fwJS.addElement("Angular");
        fwJS.addElement("Vue");

        fwPy.addElement("Bottle");
        fwPy.addElement("CherryPy");
        fwPy.addElement("Django");

        listPrograms = new JList<>(lmPrograms);
        listCPP = new JList<>(fwCPP);
        listJava = new JList<>(fwJava);
        listJS = new JList<>(fwJS);
        listPy = new JList<>(fwPy);

        lb.setBounds(100, 50, 550, 30);
        btn.setBounds(250, 200, 80, 30);
        listPrograms.setBounds(225, 100, 100, 80);
        listCPP.setBounds(225, 350, 100, 60);
        listJava.setBounds(225, 350, 100, 60);
        listJS.setBounds(225, 350, 100, 60);
        listPy.setBounds(225, 350, 100, 60);

        add(btn);
        add(lb);
        add(listPrograms);
        add(listCPP);
        add(listJava);
        add(listJS);
        add(listPy);

        listCPP.setVisible(false);
        listJava.setVisible(false);
        listJS.setVisible(false);
        listPy.setVisible(false);

        btn.addActionListener(this);

        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String data = "";

        if (listPrograms.getSelectedIndex() == 0) {
            data = "Programming Language Selected: " + listPrograms.getSelectedValue();
            lb.setText(data);

            listCPP.setVisible(true);
            listJava.setVisible(false);
            listJS.setVisible(false);
            listPy.setVisible(false);

            if (listCPP.getSelectedIndex() != -1) {
                data += ", Framework Selected: " + listCPP.getSelectedValue();
            }
            lb.setText(data);
        }
        if (listPrograms.getSelectedIndex() == 1) {
            data = "Programming Language Selected: " + listPrograms.getSelectedValue();
            lb.setText(data);

            listCPP.setVisible(false);
            listJava.setVisible(true);
            listJS.setVisible(false);
            listPy.setVisible(false);

            if (listJava.getSelectedIndex() != -1) {
                data += ", Framework Selected: " + listJava.getSelectedValue();
            }
            lb.setText(data);
        }
        if (listPrograms.getSelectedIndex() == 2) {
            data = "Programming Language Selected: " + listPrograms.getSelectedValue();
            lb.setText(data);

            listCPP.setVisible(false);
            listJava.setVisible(false);
            listJS.setVisible(true);
            listPy.setVisible(false);

            if (listJS.getSelectedIndex() != -1) {
                data += ", Framework Selected: " + listJS.getSelectedValue();
            }
            lb.setText(data);
        }
        if (listPrograms.getSelectedIndex() == 3) {
            data = "Programming Language Selected: " + listPrograms.getSelectedValue();
            lb.setText(data);

            listCPP.setVisible(false);
            listJava.setVisible(false);
            listJS.setVisible(false);
            listPy.setVisible(true);

            if (listPy.getSelectedIndex() != -1) {
                data += ", Framework Selected: " + listPy.getSelectedValue();
            }
            lb.setText(data);
        }

    }

    public static void main(String[] args) {
        new JList2();
    }

}
