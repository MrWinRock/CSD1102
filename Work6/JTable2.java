import javax.swing.*;
import java.awt.*;

public class JTable2 extends JFrame {

    public JTable2() {

        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(250, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //

        Object[] columns = {"สินค้า", "ราคา"};
        Object[][] rows = new Object[5][2];

        rows[0] = new Object[] {"เมาส์", 2000};
        rows[1] = new Object[] {"คีย์บอร์ด", 3000};
        rows[2] = new Object[] {"หูฟัง", 1500};
        rows[3] = new Object[] {"มอนิเตอร์", 6000};
        rows[4] = new Object[] {"คอมพิวเตอร์", 20000};

        JTable table = new JTable(rows, columns);
        JScrollPane sp = new JScrollPane(table);
        setLayout(new GridLayout(1, 1));
        add(sp);

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
        new JTable2();
    }
}