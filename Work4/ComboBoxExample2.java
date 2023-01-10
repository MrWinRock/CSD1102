import javax.swing.*;

public class ComboBoxExample2 {
    JFrame f;

    ComboBoxExample2() {
        f = new JFrame("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        String phones[] = { "IPhone", "Samsung", "Xiao Mi", "Huawei", "Pixel", "OPPO", "VIVO" };
        JComboBox cb = new JComboBox(phones);
        cb.setBounds(150, 70, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample2();
    }
}