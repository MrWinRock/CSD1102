import java.util.Scanner;
import java.io.*;

public class GradeRecordSystem2 {
    public static void main(String[] args) throws IOException {
        new GradeRecordSystem2();
    }

    public GradeRecordSystem2() throws IOException {
        writeFile();
    }

    public static void writeFile() throws IOException {
        double grade = calcGrade();

        FileWriter fWriter = new FileWriter("GradeTotal.txt");
        PrintWriter outputFile = new PrintWriter(fWriter);

        outputFile.println("Average Grade = " + grade);

        outputFile.close();
    }

    public static String[][] readFile() throws IOException {

        Scanner inputFileName = new Scanner(System.in);
        System.out.print("Enter File Name: ");
        String fileName = inputFileName.nextLine();
        inputFileName.close();

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

    public static double calcGrade() throws IOException {
        String[][] gradeData = readFile();
        int credit = 0;
        double numGrade = 0, avgGrade = 0, avgGradeEach = 0;
        String grade = "";

        try {
            for (int i = 0; i < gradeData.length; i++) {

                credit = Integer.parseInt(gradeData[i][1]);

                grade = gradeData[i][2];
                if (grade == "A")
                    numGrade = 4.0;
                else if (grade == "B+")
                    numGrade = 3.5;
                else if (grade == "B")
                    numGrade = 3.0;
                else if (grade == "C+")
                    numGrade = 2.5;
                else if (grade == "C")
                    numGrade = 2.0;
                else if (grade == "D+")
                    numGrade = 1.5;
                else if (grade == "D")
                    numGrade = 1.0;
                else if (grade == "F")
                    numGrade = 0;

                avgGradeEach = numGrade * credit;
                avgGrade += avgGradeEach;

                System.out.println(avgGradeEach);
            }
        } catch (Exception e) {
            e.getMessage();
        }

        avgGrade /= gradeData.length;
        System.out.println(gradeData.length);
        System.out.println(avgGradeEach);

        return avgGrade;
    }

}
