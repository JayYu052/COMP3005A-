import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        StudentApp dao = new StudentApp();

        // Add a new student

        //dao.addStudent("YUNTAO", "YU", "yuntaoyu@gmail.com", Date.valueOf("2000-05-27"));

        // Update a student's email
        dao.updateStudentEmail(2, "jayjay@gmail.com");

        // Delete a student
        dao.deleteStudent(3);

        // Get all students
        dao.getAllStudents();
    }
}