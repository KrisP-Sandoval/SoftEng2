package SOLID_DesignPattern;

public class TestProgram {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        Journal journal = new Journal("Nature");

        Student student = new Student("Jon", "001");

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Number: " + student.getStudentNumber());

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}
