package Student;

public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo, String studentSurname,
            String studentCourse, String studentAddress, String studentEmail) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Surname: " + studentSurname);
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Course: " + studentCourse);
        System.out.println("Address: " + studentAddress);
        System.out.println("Email: " + studentEmail);
        System.out.println();
    }
}