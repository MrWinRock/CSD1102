import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener {

    JTextField fileNameF, productNameF, quanF, priceF;
    
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public Main() throws IOException {
        setSize(500, 500);
        setTitle("QQQ");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p1 = new JPanel(new GridLayout(0, 1));
        fileNameF = new JTextField();
        productNameF = new JTextField();
        quanF = new JTextField();
        priceF = new JTextField();

        JButton button = new JButton("Calc");

        p1.add(fileNameF);
        // p1.add(productNameF);
        // p1.add(quanF);
        // p1.add(priceF);
        p1.add(button, BorderLayout.CENTER);

        add(p1, BorderLayout.CENTER);

        button.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        String fileName = fileNameF.getText();


        // String productName = productNameF.getText();
        // int quan = Integer.parseInt(quanF.getText());
        // int price = Integer.parseInt(priceF.getText());
        
        try {
            writeFileResult(fileName);
        } catch(Exception ex) {
            ex.getMessage();
        }
        
    }

    public static void writeFileResult(String fileName) throws IOException {
        String[][][] data = calcPrice(fileName);

        String[][] baseData = data[0];
        String[][] totalPrice = data[1];

        String productName;
        int quantity, price, totalEach;

        FileWriter fWriter = new FileWriter("ProductTotal.txt");
        PrintWriter outputFile = new PrintWriter(fWriter);

        outputFile.println("Product Name | Unit | Price | total");

        try {
            for (int i = 0; i < baseData.length; i++) {
                productName = baseData[i][0];
                quantity = Integer.parseInt(baseData[i][1]);
                price = Integer.parseInt(baseData[i][2]);
                totalEach = Integer.parseInt(baseData[i][3]);

                outputFile.println(productName + "\t" + quantity + "\t" + price + "\t" + totalEach);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        outputFile.println("Total\t" + totalPrice[0][0]);
        outputFile.println("Vat 7%\t" + totalPrice[0][1]);
        outputFile.println("Total Price\t" + totalPrice[0][2]);

        outputFile.close();
    }

    public static String[][] readFile(String fileName) throws IOException {

        // Scanner inputFileName = new Scanner(System.in);
        // // System.out.print("Enter File Name: ");
        // // String fileName = inputFileName.nextLine();
        // inputFileName.close();

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

    public static String[][][] calcPrice(String fileName) throws IOException {
        String[][] product = readFile(fileName);
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
