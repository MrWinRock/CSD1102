package Student;

public class Main {
    public static void main(String[] args) {
        // fetch student record based on his roll no from the database
        Student model = retriveStudentFromDatabase();
        // Create a view : to write student details on console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        // update model data
        controller.setStudentName("Pharthiwath");
        controller.setStudentSurname("Gristsoopharruth");
        controller.setStudentRollNo("65122250031");
        controller.setStudentCourse("Computer Science");
        controller.setStudentAddress("Home");
        controller.setStudentEmail("mrwinrock11@gmail.com");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Somchai");
        student.setSurname("Chaichai");
        student.setRollNo("00001");
        student.setCourse("Computer Science");
        student.setAddress("Homeless");
        student.setEmail("somchai_chaichai@gmail.com");
        return student;
    }
}
