package Week1.DesignPatterns.MVCPattern.Code;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Sushmitha", 1001, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Sushmitha K");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
