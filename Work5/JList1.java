import javax.swing.*;

public class JList1 extends JFrame {
    
    public JList1() {

        DefaultListModel<String> lM = new DefaultListModel<>();
        lM.addElement("1");
        lM.addElement("2");
        lM.addElement("3");
        lM.addElement("4");

        JList<String> list = new JList<>(lM);
        list.setBounds(100, 100, 100, 100);

        add(list);
        
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JList1();
    }
    
}