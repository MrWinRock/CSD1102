import javax.swing.*;

public class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
        f = new JFrame("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        String country[] = { "India", "Australia", "U.S.A", "England", "Newzealand" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(150, 70, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}