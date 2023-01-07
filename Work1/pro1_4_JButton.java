import javax.swing.*;

public class pro1_4_JButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("JButton Example: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์"); 

        JButton b = new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        f.add(b);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
