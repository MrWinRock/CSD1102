import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Work4 extends JFrame implements ActionListener {

    JLabel topLbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lblq1, lblq2, lblq3, lblq4, lblq5,
            lblq6, lblq7, lblq8, lblq9, lblq10, sumLbl;
    JTextField f1, f2, f3, f4, f5;
    JButton calcBtn;
    JCheckBox carC1, carC2, carC3, carC4, carC5, roomC1, roomC2, roomC3, roomC4, roomC5;

    public Work4() {

        setUIFont(new javax.swing.plaf.FontUIResource("Microsoft Sans Serif", Font.PLAIN,
                14));
        setTitle("โปรแกรมค่าทัวร์พร้อมแพ็คเกจเสริม: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        setSize(1000, 800);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // สร้าง Label
        topLbl = new JLabel("โปรแกรมค่าทัวร์พร้อมแพ็คเกจเสริม: ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        lbl1 = new JLabel("1) แพ็คเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน");
        lbl2 = new JLabel("2) แพ็คเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน");
        lbl3 = new JLabel("3) แพ็คเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน");
        lbl4 = new JLabel("4) แพ็คเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน");
        lbl5 = new JLabel("5) แพ็คเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน");
        lbl6 = new JLabel("");
        lbl7 = new JLabel("");
        lbl8 = new JLabel("");
        lbl9 = new JLabel("");
        lbl10 = new JLabel("");
        lblq1 = new JLabel("จำนวน");
        lblq2 = new JLabel("จำนวน");
        lblq3 = new JLabel("จำนวน");
        lblq4 = new JLabel("จำนวน");
        lblq5 = new JLabel("จำนวน");
        lblq6 = new JLabel("คน  เช่ารถ                  ห้องพักเพิ่มเติม");
        lblq7 = new JLabel("คน  เช่ารถ                  ห้องพักเพิ่มเติม");
        lblq8 = new JLabel("คน  เช่ารถ                  ห้องพักเพิ่มเติม");
        lblq9 = new JLabel("คน  เช่ารถ                  ห้องพักเพิ่มเติม");
        lblq10 = new JLabel("คน  เช่ารถ                 ห้องพักเพิ่มเติม");
        sumLbl = new JLabel("");

        // สร้าง JTextField
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        f4 = new JTextField();
        f5 = new JTextField();

        // สร้าง JButton
        calcBtn = new JButton("คำนวณค่าทัวร์");

        // สร้าง JCheckBox
        carC1 = new JCheckBox(); 
        carC2 = new JCheckBox(); 
        carC3 = new JCheckBox(); 
        carC4 = new JCheckBox(); 
        carC5 = new JCheckBox(); 
        roomC1 = new JCheckBox(); 
        roomC2 = new JCheckBox(); 
        roomC3 = new JCheckBox();
        roomC4 = new JCheckBox();
        roomC5 = new JCheckBox();

        // พื้นที่ JLabel
        topLbl.setBounds(320, 15, 400, 17);
        lbl1.setBounds(70,83, 360, 25);
        lbl2.setBounds(70,132, 360, 25);
        lbl3.setBounds(70,180, 360, 25);
        lbl4.setBounds(70,227, 360, 25);
        lbl5.setBounds(70,271, 360, 25);
        lbl6.setBounds(70, 458, 830, 25);
        lbl7.setBounds(70, 496, 830, 25);
        lbl8.setBounds(70, 529, 830, 25);
        lbl9.setBounds(70, 562, 830, 25);
        lbl10.setBounds(70, 595, 830, 25);
        lblq1.setBounds(446, 83, 51, 25);
        lblq2.setBounds(446, 132, 51, 25);
        lblq3.setBounds(446, 180, 51, 25);
        lblq4.setBounds(446, 227, 51, 25);
        lblq5.setBounds(446,271 , 51, 25);
        lblq6.setBounds(583, 83, 250, 25);
        lblq7.setBounds(583, 132, 250, 25);
        lblq8.setBounds(583, 180, 250, 25);
        lblq9.setBounds(583, 227, 250, 25);
        lblq10.setBounds(583, 271, 250, 25);
        sumLbl.setBounds(432, 634, 250, 25);

        // พื้นที่ JButton
        calcBtn.setBounds(345, 345, 224, 50);

        // พื้นที่ JTextField
        f1.setBounds(504, 73, 60, 35);
        f2.setBounds(504, 121, 60, 35);
        f3.setBounds(504, 166, 60, 35);
        f4.setBounds(504, 217, 60, 35);
        f5.setBounds(504, 264, 60, 35);

        // พื้นที่ JCheckBox
        carC1.setBounds(660, 85, 20, 20);
        carC2.setBounds(660, 130, 20, 20);
        carC3.setBounds(660, 176, 20, 20);
        carC4.setBounds(660, 225, 20, 20);
        carC5.setBounds(660, 273, 20, 20);
        roomC1.setBounds(805, 85, 20, 20);
        roomC2.setBounds(805, 130, 20, 20);
        roomC3.setBounds(805, 176, 20, 20);
        roomC4.setBounds(805, 225, 20, 20);
        roomC5.setBounds(805, 273, 20, 20);

        // add
        add(topLbl);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lbl10);
        add(lblq1);
        add(lblq2);
        add(lblq3);
        add(lblq4);
        add(lblq5);
        add(lblq6);
        add(lblq7);
        add(lblq8);
        add(lblq9);
        add(lblq10);
        add(sumLbl);
        add(calcBtn);
        add(f1);
        add(f2);
        add(f3);
        add(f4);
        add(f5);
        add(carC1);
        add(carC2);
        add(carC3);
        add(carC4);
        add(carC5);
        add(roomC1);
        add(roomC2);
        add(roomC3);
        add(roomC4);
        add(roomC5);

        calcBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        double q1, q2, q3, q4, q5, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, 
        por = 50000, // 3 days/person
        bal = 49000, // 4 days/person
        pol = 48000, // 5 days/person
        mon = 47000, // 6 days/person
        spa = 46000, // 6 days/person
        car = 2000, // /day
        roomPor = 2000, // /day/person
        roomBal = 1500, // /day/person
        roomPol = 1200, // /day/person
        roomMon = 1600, // /day/person
        roomSpa = 2100, // /day/person
        carRPor = 0, 
        carRBal = 0, 
        carRPol = 0, 
        carRMon = 0, 
        carRSpa = 0, 
        roomRPor = 0,
        roomRBal = 0,
        roomRPol = 0,
        roomRMon = 0,
        roomRSpa = 0,
        sum = 0;

        q1 = Double.parseDouble(f1.getText());
        q2 = Double.parseDouble(f2.getText());
        q3 = Double.parseDouble(f3.getText());
        q4 = Double.parseDouble(f4.getText());
        q5 = Double.parseDouble(f5.getText());

        if(e.getSource() == calcBtn) {
            // Portugal =====================================
            if(carC1.isSelected() && roomC1.isSelected()) {
                if(q1/4 > 1 && q1/2 > 1) { // car over & room over
                    carRPor = (car * Math.ceil(q1/4))*3;
                    roomRPor = (roomPor * Math.ceil(q1/2))*3;
                    p1 = por*q1;
                }
                else if(q1/4 > 1) { // car over
                    carRPor = (car * Math.ceil(q1/4))*3;
                    roomRPor = roomPor*3;
                    p1 = por*q1;
                }
                else if(q1/2 > 1) { // room over
                    carRPor = car*3;
                    roomRPor = (roomPor * Math.ceil(q1/2))*3;
                    p1 = por*q1;
                }
                else { // less or equal
                    carRPor = car*3;
                    roomRPor = roomPor*3;
                    p1 = por*q1;
                }
            }
            else if(carC1.isSelected()) {
                if(q1/4 > 1) { // car over
                    carRPor = (car * Math.ceil(q1/4))*3;
                    roomRPor = 0;
                    p1 = por*q1;
                }
                else { // less or equal
                    carRPor = car*3;
                    roomRPor = 0;
                    p1 = por*q1;
                }
            }
            else if(roomC1.isSelected()){
                if(q1/2 > 1) { // room over
                    carRPor = 0;
                    roomRPor = (roomPor * Math.ceil(q1/2))*3;
                    p1 = por*q1;
                }
                else { // less or equal
                    carRPor = 0;
                    roomRPor = roomPor*3;
                    p1 = por*q1;
                }
            }
            else {
                carRPor = 0;
                roomRPor = 0;
                p1 = por*q1;
            }

            // Balgaria =====================================
            if(carC2.isSelected() && roomC2.isSelected()) {
                if(q2/4 > 1 && q2/2 > 1) { // car over & room over
                    carRBal = (car * Math.ceil(q2/4))*4;
                    roomRBal = (roomBal * Math.ceil(q2/2))*4;
                    p2 = bal*q2;
                }
                else if(q2/4 > 1) { // car over
                    carRBal = (car * Math.ceil(q2/4))*4;
                    roomRBal = roomBal*4;
                    p2 = bal*q2;
                }
                else if(q2/2 > 1) { // room over
                    carRBal = car*4;
                    roomRBal = (roomBal * Math.ceil(q2/2))*4;
                    p2 = bal*q2;
                }
                else { // less or equal
                    carRBal = car*4;
                    roomRBal = roomBal*4;
                    p2 = bal*q2;
                }
            }
            else if(carC2.isSelected()) {
                if(q2/4 > 1) { // car over
                    carRBal = (car * Math.ceil(q2/4))*4;
                    roomRBal = 0;
                    p2 = bal*q2;
                }
                else { // less or equal
                    carRBal = car*4;
                    roomRBal = 0;
                    p2 = bal*q2;
                }
            }
            else if(roomC2.isSelected()){
                if(q2/2 > 1) { // room over
                    carRBal = 0;
                    roomRBal = (roomBal * Math.ceil(q2/2))*4;
                    p2 = bal*q2;
                }
                else { // less or equal
                    carRBal = 0;
                    roomRBal = roomBal*4;
                    p2 = bal*q2;
                }
            }
            else {
                carRBal = 0;
                roomRBal = 0;
                p2 = bal*q2;
            }

            // Poland =====================================
            if(carC3.isSelected() && roomC3.isSelected()) {
                if(q3/4 > 1 && q3/2 > 1) { // car over & room over
                    carRPol = (car * Math.ceil(q3/4))*5;
                    roomRPol = (roomPol * Math.ceil(q3/2))*5;
                    p3 = pol*q3;
                }
                else if(q3/4 > 1) { // car over
                    carRPol = (car * Math.ceil(q3/4))*5;
                    roomRPol = roomPol*5;
                    p3 = pol*q3;
                }
                else if(q3/2 > 1) { // room over
                    carRPol = car*5;
                    roomRPol = (roomPol * Math.ceil(q3/2))*5;
                    p3 = pol*q3;
                }
                else { // less or equal
                    carRPol = car*5;
                    roomRPol = roomPol*5;
                    p3 = pol*q3;
                }
            }
            else if(carC3.isSelected()) {
                if(q3/4 > 1) { // car over
                    carRPol = (car * Math.ceil(q3/4))*5;
                    roomRPol = 0;
                    p3 = pol*q3;
                }
                else { // less or equal
                    carRPol = car*5;
                    roomRPol = 0;
                    p3 = pol*q3;
                }
            }
            else if(roomC3.isSelected()){
                if(q3/2 > 1) { // room over
                    carRPol = 0;
                    roomRPol = (roomPol * Math.ceil(q3/2))*5;
                    p3 = pol*q3;
                }
                else { // less or equal
                    carRPol = 0;
                    roomRPol = roomPol*5;
                    p3 = pol*q3;
                }
            }
            else {
                carRPol = 0;
                roomRPol = 0;
                p3 = pol*q3;
            }

            // Monaco =====================================
            if(carC4.isSelected() && roomC4.isSelected()) {
                if(q4/4 > 1 && q4/2 > 1) { // car over & room over
                    carRMon = (car * Math.ceil(q4/4))*6;
                    roomRMon = (roomMon * Math.ceil(q4/2))*6;
                    p4 = mon*q4;
                }
                else if(q4/4 > 1) { // car over
                    carRMon = (car * Math.ceil(q4/4))*6;
                    roomRMon = roomMon*6;
                    p4 = mon*q4;
                }
                else if(q4/2 > 1) { // room over
                    carRMon = car*6;
                    roomRMon = (roomMon * Math.ceil(q4/2))*6;
                    p4 = mon*q4;
                }
                else { // less or equal
                    carRMon = car*6;
                    roomRMon = roomMon*6;
                    p4 = mon*q4;
                }
            }
            else if(carC4.isSelected()) {
                if(q4/4 > 1) { // car over
                    carRMon = (car * Math.ceil(q4/4))*6;
                    roomRMon = 0;
                    p4 = mon*q4;
                }
                else { // less or equal
                    carRMon = car*6;
                    roomRMon = 0;
                    p4 = mon*q4;
                }
            }
            else if(roomC4.isSelected()){
                if(q4/2 > 1) { // room over
                    carRMon = 0;
                    roomRMon = (roomMon * Math.ceil(q4/2))*6;
                    p4 = mon*q4;
                }
                else { // less or equal
                    carRMon = 0;
                    roomRMon = roomMon*6;
                    p4 = mon*q4;
                }
            }
            else {
                carRMon = 0;
                roomRMon = 0;
                p4 = mon*q4;
            }

            // Spain =====================================
            if(carC5.isSelected() && roomC5.isSelected()) {
                if(q5/4 > 1 && q5/2 > 1) { // car over & room over
                    carRSpa = (car * Math.ceil(q5/4))*6;
                    roomRSpa = (roomSpa * Math.ceil(q5/2))*6;
                    p5 = spa*q5;
                }
                else if(q5/4 > 1) { // car over
                    carRSpa = (car * Math.ceil(q5/4))*6;
                    roomRSpa = roomSpa*6;
                    p5 = spa*q5;
                }
                else if(q5/2 > 1) { // room over
                    carRSpa = car*6;
                    roomRSpa = (roomSpa * Math.ceil(q5/2))*6;
                    p5 = spa*q5;
                }
                else { // less or equal
                    carRSpa = car*6;
                    roomRSpa = roomSpa*6;
                    p5 = spa*q5;
                }
            }
            else if(carC5.isSelected()) {
                if(q5/4 > 1) { // car over
                    carRSpa = (car * Math.ceil(q5/4))*6;
                    roomRSpa = 0;
                    p5 = spa*q5;
                }
                else { // less or equal
                    carRSpa = car*6;
                    roomRSpa = 0;
                    p5 = spa*q5;
                }
            }
            else if(roomC5.isSelected()){
                if(q5/2 > 1) { // room over
                    carRSpa = 0;
                    roomRSpa = (roomSpa * Math.ceil(q5/2))*6;
                    p5 = spa*q5;
                }
                else { // less or equal
                    carRSpa = 0;
                    roomRSpa = roomSpa*6;
                    p5 = spa*q5;
                }
            }
            else {
                carRSpa = 0;
                roomRSpa = 0;
                p5 = spa*q5;
            }

            sum = p1 + p2 + p3 + p4 + p5 + carRPor + carRBal + carRPol + carRMon + carRSpa + roomRPor + roomRBal + roomRPol + roomRMon + roomRSpa;

            // Display =====================================
            lbl6.setText("1) แพ็คเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน จำนวน " + (int) q1 + " คน = " + (int) p1 + " บาท เช่ารถ " + (int) carRPor + " บาท ห้องพัก " + (int) roomRPor + " บาท");
            lbl7.setText("2) แพ็คเกจทัวร์ประเทศบัลแกเรีย ราคา 49,000 บาท / คน จำนวน " + (int) q2 + " คน = " + (int) p2 + " บาท เช่ารถ " + (int) carRBal + " บาท ห้องพัก " + (int) roomRBal + " บาท");
            lbl8.setText("3) แพ็คเกจทัวร์ประเทศโปแลนด์ ราคา 48,000 บาท / คน จำนวน " + (int) q3 + " คน = " + (int) p3 + " บาท เช่ารถ " + (int) carRPol + " บาท ห้องพัก " + (int) roomRPol + " บาท");
            lbl9.setText("4) แพ็คเกจทัวร์ประเทศโมนาโก ราคา 47,000 บาท / คน จำนวน " + (int) q4 + " คน = " + (int) p4 + " บาท เช่ารถ " + (int) carRMon + " บาท ห้องพัก " + (int) roomRMon + " บาท");
            lbl10.setText("5) แพ็คเกจทัวร์ประเทศสเปน ราคา 46,000 บาท / คน จำนวน " + (int) q5 + " คน = " + (int) p5 + " บาท เช่ารถ " + (int) carRSpa + " บาท ห้องพัก " + (int) roomRSpa + " บาท");
            sumLbl.setText("รวมทั้งสิ้น = " + (int) sum + " บาท");
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
        new Work4();
    }
}