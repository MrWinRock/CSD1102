import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {

        String data = "";
        int quan = 0, price = 0, total = 0;
        double vat = 0, sumTotal = 0, result = 0;
        try {
            Scanner scanner = new Scanner(new FileReader("Product.txt")); // เปิดไฟล์
            // Scanner scanner = new Scanner(new FileInputStream("example.txt"));
            while (scanner.hasNext()) { // ถ ้ํายังมีข ้อมูลอยู่
                data = scanner.nextLine(); // อ่ํานข ้อมูลบรรทัดถัดไป
                quan = Integer.parseInt(scanner.nextLine()); // อ่ํานข ้อมูลบรรทัดถัดไป
                price = Integer.parseInt(scanner.nextLine()); // อ่ํานข ้อมูลบรรทัดถัดไป

                total = quan * price;
                System.out.println(data + " " + quan + " " + price + " " + total);
                sumTotal += total;

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        vat = sumTotal * 0.07;
        result = sumTotal + vat;

        System.out.println(sumTotal);
        System.out.println(vat);
        System.out.println(result);

    }
}