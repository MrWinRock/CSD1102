import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class GradeRecordSystem2 {
    public static void main(String[] args) throws IOException {
        new GradeRecordSystem2();
    }

    public GradeRecordSystem2() throws IOException {
        writeFile();
    }

    public static void writeFile() throws IOException {
        String grade = calcGrade();

        FileWriter fWriter = new FileWriter("GradeTotal.txt");
        PrintWriter outputFile = new PrintWriter(fWriter);

        outputFile.println("Grade Point Average = " + grade);

        outputFile.close();
    }

    public static String[][] readFile() throws IOException {

        try (Scanner inputFileName = new Scanner(System.in)) {
            System.out.print("Enter File Name: ");
            String fileName = inputFileName.nextLine();

            Scanner scanner = new Scanner(new FileReader(fileName + ".txt"));

            String[][] gradeData = new String[10][3];
            int i = 0;
            while (scanner.hasNext()) {
                for (int j = 0; j < 3; j++) {
                    String data = scanner.nextLine();
                    gradeData[i][j] = data;
                    if (j == 2)
                        i++;
                }
            }

            // for (int k = 0; k < gradeData.length; k++) {
            // for (int j = 0; j < 3; j++) {
            // System.out.println(gradeData[k][j]);
            // }
            // }

            scanner.close();
            return gradeData;
        }
    }

    public static String calcGrade() throws IOException {
        String[][] gradeData = readFile();
        double credit = 0;
        double numGrade = 0, avgGrade = 0, avgGradeEach = 0, totalCredit = 0;
        String grade = "";

        try {
            for (int i = 0; i < gradeData.length; i++) {
                credit = Double.parseDouble(gradeData[i][1]);

                grade = gradeData[i][2];
                if (grade.equals("A"))
                    numGrade = 4.0;
                else if (grade.equals("B+"))
                    numGrade = 3.5;
                else if (grade.equals("B"))
                    numGrade = 3.0;
                else if (grade.equals("C+"))
                    numGrade = 2.5;
                else if (grade.equals("C"))
                    numGrade = 2.0;
                else if (grade.equals("D+"))
                    numGrade = 1.5;
                else if (grade.equals("D"))
                    numGrade = 1.0;
                else if (grade.equals("F"))
                    numGrade = 0;

                avgGradeEach = numGrade * credit;
                totalCredit += credit;
                avgGrade += avgGradeEach;

                System.out.println(avgGradeEach);
            }

        } catch (Exception e) {
            e.getMessage();
        }

        avgGrade /= totalCredit;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(avgGrade));

        return df.format(avgGrade);
    }

}
