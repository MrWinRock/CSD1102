package Student;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentSurname(String surname) {
        model.setSurname(surname);
    }

    public String getStudentSurname() {
        return model.getSurname();
    }

    public void setStudentCourse(String course) {
        model.setCourse(course);
    }

    public String getStudentCourse() {
        return model.getCourse();
    }

    public void setStudentAddress(String address) {
        model.setAddress(address);
    }

    public String getStudentAddress() {
        return model.getAddress();
    }

    public void setStudentEmail(String email) {
        model.setEmail(email);
    }

    public String getStudentEmail() {
        return model.getEmail();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo(), model.getSurname(), model.getCourse(),
                model.getAddress(), model.getEmail());
    }
}
