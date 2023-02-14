import java.io.*;

public class BasicRead {
    public static void main(String[] args) throws IOException {
        FileReader freader = new FileReader("friend.txt"); // เปิดไฟล์เพื่ออ่ําน
        BufferedReader inputFile = new BufferedReader(freader); // สร ้ํางออบเจ็กต์อ่ํานไฟล์
        String str; // ประกําศตัวแปรสตริงเพื่อรับข ้อมูล
        str = inputFile.readLine(); // อ่ํานข ้อมูลบรรทัดแรกขึ้นมํา
        while (str != null) // ตรวจสอบว่ําจบไฟล์หรือยัง ถ ้ํายังอ่ํานต่อ
        {
            System.out.println(str); // แสดงผลข้อมูลที่อ่ํานได้ทํางจอภําพ
            str = inputFile.readLine(); // อ่ํานสตริงขึ้นมําหนึ่งบรรทัด
        }
        inputFile.close(); // ปิดไฟล์
    }
}