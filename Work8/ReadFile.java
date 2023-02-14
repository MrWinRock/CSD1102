import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new FileReader("friend.txt")); // เปิดไฟล์
            // Scanner scanner = new Scanner(new FileInputStream("example.txt"));
            while (scanner.hasNext()) { // ถ ้ํายังมีข ้อมูลอยู่
                System.out.println(scanner.nextLine()); // อ่ํานข ้อมูลบรรทัดถัดไป
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}