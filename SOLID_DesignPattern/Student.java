package SOLID_DesignPattern;

public class Student {
    private String studentName;
    private String studentNumber;

    public Student(String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
    public void borrowResource(Resource resource) {
        resource.borrow();
    }
}
