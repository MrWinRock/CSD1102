import java.util.Scanner;
import java.io.*;

public class ProductSelling2 {
    public static void main(String[] args) throws IOException {
        new ProductSelling2();
    }

    public ProductSelling2() throws IOException {
        writeFile();
    }

    public static void writeFile() throws IOException {
        String[][][] data = calcPrice();

        String[][] baseData = data[0];
        String[][] totalPrice = data[1];

        String productName;
        int quantity, price, totalEach;

        FileWriter fWriter = new FileWriter("ProductTotal.txt");
        PrintWriter outputFile = new PrintWriter(fWriter);

        outputFile.println("Product Name \tUnit\tPrice\ttotal");

        try {
            for (int i = 0; i < baseData.length; i++) {
                productName = baseData[i][0];
                quantity = Integer.parseInt(baseData[i][1]);
                price = Integer.parseInt(baseData[i][2]);
                totalEach = Integer.parseInt(baseData[i][3]);

                outputFile.println(productName + "\t\t\t " + quantity + "\t\t" + price + "\t" + totalEach);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        outputFile.println("\tTotal\t\t\t" + totalPrice[0][0]);
        outputFile.println("\tVat 7%\t\t\t" + totalPrice[0][1]);
        outputFile.println("\tTotal Price\t\t" + totalPrice[0][2]);

        outputFile.close();
    }

    public static String[][] readFile() throws IOException {

        Scanner inputFileName = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = inputFileName.nextLine();
        inputFileName.close();

        Scanner scanner = new Scanner(new FileReader(fileName + ".txt"));

        String[][] product = new String[10][3];
        int i = 0;
        while (scanner.hasNext()) {
            for (int j = 0; j < 3; j++) {
                String data = scanner.nextLine();
                product[i][j] = data;
                if (j == 2)
                    i++;
            }
        }

        // for (int k = 0; k < product.length; k++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println(product[k][j]);
        //     }
        // }

        scanner.close();
        return product;
    }

    public static String[][][] calcPrice() throws IOException {
        String[][] product = readFile();
        int quan = 0, price = 0, total = 0, totalEach[] = new int[product.length];
        String[][][] data = new String[2][10][4];

        try {
            for (int i = 0; i < product.length; i++) {
                data[0][i][0] = product[i][0];

                quan = Integer.parseInt(product[i][1]);
                data[0][i][1] = Integer.toString(quan);

                price = Integer.parseInt(product[i][2]);
                data[0][i][2] = Integer.toString(price);

                totalEach[i] = quan * price;
                total += totalEach[i];
                data[0][i][3] = Integer.toString(total);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        double vat = total * 0.07;
        double totalPrice = total + vat;

        data[1][0][0] = Integer.toString(total);
        data[1][0][1] = Double.toString(vat);
        data[1][0][2] = Double.toString(totalPrice);

        return data;
    }

}
