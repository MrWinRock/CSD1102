import java.util.Scanner;
import java.io.*;

public class ProductSelling1 {
    public static void main(String[] args) throws IOException{
        writeFile();
    }
    
    public static void writeFile() throws IOException {

        Scanner input = new Scanner(System.in);
        
        String fileName, productName;
        int quantity, price;
        
        System.out.print("Enter Item Number: ");
        int item = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter File Name: ");
        fileName = input.next();
        input.nextLine();

        FileWriter fWriter = new FileWriter(fileName + ".txt"); 
        PrintWriter outputFile = new PrintWriter(fWriter);

        for (int i = 1; i <= item; i++) {
            System.out.print("Enter Product Name " + i + ": ");
            productName = input.nextLine(); 
            outputFile.println(productName); 

            System.out.print("Enter Quantity of Product " + i + ": ");
            quantity = input.nextInt(); 
            input.nextLine();
            outputFile.println(quantity); 

            System.out.print("Enter Price of Product " + i + ": ");
            price = input.nextInt(); 
            input.nextLine();
            outputFile.println(price); 
        }

        outputFile.close();
        input.close();

        
    }
}
