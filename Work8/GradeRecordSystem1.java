import java.util.Scanner;
import java.io.*;

public class GradeRecordSystem1 {
    public static void main(String[] args) throws IOException{
        new GradeRecordSystem1();
    }

    public GradeRecordSystem1() throws IOException {
        writeFile();
    }
    
    public static void writeFile() throws IOException {

        Scanner input = new Scanner(System.in);
        
        String fileName, subject, grade;
        double credit;
        
        System.out.print("Enter Number of Subject: ");
        int sub = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter File Name: ");
        fileName = input.next();
        input.nextLine();

        FileWriter fWriter = new FileWriter(fileName + ".txt"); 
        PrintWriter outputFile = new PrintWriter(fWriter);

        for (int i = 1; i <= sub; i++) {
            System.out.print("Enter Subject Name " + i + ": ");
            subject = input.nextLine(); 
            outputFile.println(subject); 

            System.out.print("Enter credit of Subject " + i + ": ");
            credit = input.nextDouble(); 
            input.nextLine();
            outputFile.println(credit); 

            System.out.print("Enter grade of Subject " + i + ": ");
            grade = input.next(); 
            input.nextLine();
            outputFile.println(grade); 
        }

        outputFile.close();
        input.close();

        
    }
}
