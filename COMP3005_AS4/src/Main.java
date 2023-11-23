import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        StudentApp Jay = new StudentApp();

        // Add a new student

        Jay.addStudent("YUNTAO", "YU", "yuntaoyu@gmail.com", Date.valueOf("2000-05-27"));

        // Update a student's email
        Jay.updateStudentEmail(2, "jayjay@gmail.com");

        // Delete a student
        Jay.deleteStudent(3);

        // Get all students
        Jay.getAllStudents();
    }
}
