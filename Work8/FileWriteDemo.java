import java.util.Scanner;
import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        String filename; // ประกําศตัวแปรเก็บชอื่ ไฟลท์ จี่ ะสรํา้ง
        String friendName; // ประกําศตัวแปรกับชอื่
        int numFriends; // ประกําศตัวแปรเก็บจ ํานวนเพื่อน
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many friends do you have?  ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the filename: "); // ถํามชอื่ ไฟล์
        filename = keyboard.nextLine(); // รับชอื่ ไฟลเ์ป็นสตรงิ
        FileWriter fwriter = new FileWriter(filename + ".txt"); // สร ้ํางไฟล์บนดิสก์
        PrintWriter outputFile = new PrintWriter(fwriter); // สร ้ํางอ็อบเจกต์เพื่อเขียนไฟล์
        for (int i = 1; i <= numFriends; i++) // วนลูปตํามจ ํานวนเพื่อนที่ป้อนเข ้ํามํา
        {
            System.out.print("Enter the name of friend " + "number " + i + ": ");
            friendName = keyboard.nextLine(); // ป้อนชอื่ เพอื่ นเก็บในตัวแปร friendName
            outputFile.println(friendName); // น ําชอื่ เขยีนลงไฟล์
        }
        outputFile.close(); // ปิดไฟล์
        keyboard.close();
        System.out.println("Data written to the file.");
    }
}