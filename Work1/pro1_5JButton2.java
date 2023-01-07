import javax.swing.*;;

public class pro1_5JButton2 extends JFrame {
    
    pro1_5JButton2() {
        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        add(b);
        setTitle("JButton Example");
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new pro1_5JButton2();
    }
}
