import javax.swing.*;
import java.awt.*;

public class JTabbedPane2 extends JFrame {

    public JTabbedPane2() {
        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));

        setSize(450, 150);
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        String[] tabNames = { "Name", "Football Clubs", "Actors", "Vegetable", "Fruits" };
        String[][] labels = { { "ปฏิวัฒน์ กฤษฏิ์สุภารัตน์" },
                { "Chelsea", "Tottenhem Hotspur", "Arsenal" },
                { "Tom Cruise", "Tom Hollad", "Tom Hardy" },
                { "คะน้า", "ต้นหอม", "กุยช่าย", "ผักกาด", "ผักบุ้ง" },
                { "กล้วย", "แอปเปิ้ล", "แตงโม", "ทุเรียน", "น้อนหน่า" } };

        JTabbedPane tabPane = new JTabbedPane();

        for (int i = 0; i < tabNames.length; i++) {
            JPanel panel = new JPanel(new GridLayout(0, 1));
            for (String labelName : labels[i]) {
                panel.add(new JLabel(labelName), BorderLayout.CENTER);
            }
            tabPane.addTab(tabNames[i], panel);
        }

        add(tabPane);
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
        new JTabbedPane2();
    }
}