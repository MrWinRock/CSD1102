import javax.swing.*;

public class pro1_6JPanel extends JFrame {
    public static void main(String[] args) {
        new pro1_6JPanel();
    }

    public pro1_6JPanel() {
        setBounds(100, 100, 458, 287);
        setTitle("การสร้าง Subcontainer ด้วย JPanel");
        getContentPane().setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(38, 34, 133, 92);
        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));
        panel1.add(new JButton("Button 3"));
        getContentPane().add(panel1);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(223, 67, 133, 92);
        panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
        JLabel label1 = new JLabel("Label 1");
        panel2.add(label1);
        panel2.add(new JLabel("Label 2"));
        getContentPane().add(panel2);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
