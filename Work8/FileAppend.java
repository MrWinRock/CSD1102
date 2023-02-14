import java.io.*;
import java.util.Scanner;

public class FileAppend {
    private static PrintWriter pWriter;

    public static void main(String[] args) throws IOException {
        writeFile();
        appendFile();
    }

    private static void writeFile() throws IOException {
        pWriter = new PrintWriter(new FileWriter("friend.txt"));
        pWriter.println("Somjai");
        pWriter.println("Somjit");
        pWriter.println("Somthawin");
        pWriter.close();
    }

    private static void appendFile() throws IOException {
        pWriter = new PrintWriter(new FileWriter("friend.txt", true));
        Scanner scanner = new Scanner(System.in);
        System.out.println("ข ้อมูลที่จะเพิ่มลงในไฟล์:");
        String txt;
        for (int i = 1; i <= 3; i++) {
            System.out.print("บรรทัดที่ #" + i + " >>");
            txt = scanner.nextLine();
            pWriter.println(txt);
        }
        pWriter.close();
        scanner.close();
    }
}