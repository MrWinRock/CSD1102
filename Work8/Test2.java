import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String item = "", grade = "";
        int totalCredit = 0;
        double numGrade = 0, avgGradeEach = 0, avgGrade = 0, credit = 0;
        try {
            Scanner in = new Scanner(new FileReader("grade1.txt"));
            while (in.hasNext()) {
                {
                    item = in.nextLine();
                    credit = Double.parseDouble(in.nextLine());
                    grade = in.nextLine();
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
                }
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        avgGrade = avgGrade / totalCredit;

        System.out.println(avgGrade);

    }
}