import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoField;

public class JTabbedPane1 extends JFrame {

    public JTabbedPane1() {
        setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

        JTabbedPane tabPane = new JTabbedPane();

        JPanel p1, p2, p3;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel lbName = new JLabel("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        JLabel lbDate = new JLabel();
        JLabel lbTime = new JLabel();

        p1.add(lbName);
        lbName.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));

        ThaiBuddhistDate date = ThaiBuddhistDate.now();
        String[] months = { "มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน",
                "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม" };

        int d = date.get(ChronoField.DAY_OF_MONTH);
        int m = date.get(ChronoField.MONTH_OF_YEAR);
        int y = date.get(ChronoField.YEAR);
        lbDate.setText(d + " " + months[m - 1] + " " + y);
        lbDate.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        p2.add(lbDate);

        p3.setLayout(p1.getLayout());
        JLabel labelTime = new JLabel();
        labelTime.setFont(lbDate.getFont());
        updateTime(lbTime);
        p3.add(labelTime);
        tabPane.addChangeListener(e -> updateTime(labelTime));

        tabPane.addTab("Name", p1);
        tabPane.addTab("Date", p2);
        tabPane.addTab("Time", p3);

        add(tabPane);

    }

    private void updateTime(JLabel jLabel) {
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        jLabel.setText(h + ":" + m);
    }

    public static void main(String args[]) {
        new JTabbedPane1();
    }

}