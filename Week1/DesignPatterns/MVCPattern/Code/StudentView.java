package Week1.DesignPatterns.MVCPattern.Code;

public class StudentView {
    public void displayStudentDetails(String name, int id, String grade) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}
