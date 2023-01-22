import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;

public class JTable4 extends JFrame implements ListSelectionListener {

    JTable table;
    JLabel lb;

    public JTable4() {

        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN, 14));
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //

        DefaultTableModel model = new DefaultTableModel();

        Object[] columns = { "ชื่อ", "เงินเดือน" };
        model.addColumn(columns[0]);
        model.addColumn(columns[1]);
        model.addRow(new Object[] { "สมชาย", "100000" });
        model.addRow(new Object[] { "สมหญิง", "200000" });
        model.addRow(new Object[] { "สมน้ำหน้า", "300000" });

        table = new JTable(model);

        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.addListSelectionListener(this);

        lb = new JLabel("");
        lb.setHorizontalAlignment(
                SwingConstants.CENTER);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(lb, BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        if (!e.getValueIsAdjusting()) {
            int row = table.getSelectedRow();
            int col = table.getSelectedColumn();

            lb.setText("ข้อมูลที่ถูกเลือก: " + table.getValueAt(row, col));
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
        new JTable4();
    }

}