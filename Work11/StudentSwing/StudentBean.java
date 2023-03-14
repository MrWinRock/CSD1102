public class StudentBean {
    private String firstName;
    private String lastName;
    private String id;
    private String course;
    private String address;
    private String email;

    private StudentRefInterface view;

    public StudentBean(StudentRefInterface v) {

        firstName = "";
        lastName = "";
        id = "";
        course = "";
        address = "";
        email = "";

        view = v;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentRefInterface getView() {
        return view;
    }

    public void setView(StudentRefInterface view) {
        this.view = view;
    }
}
