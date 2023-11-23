import java.sql.*;


public class StudentApp {
    public void getAllStudents() {
        String sql = "SELECT * FROM students ORDER BY student_id ASC;";

        try (Connection conn = DBStudentConnection.connect();
             Statement stat = conn.createStatement();
             ResultSet rest = stat.executeQuery(sql)) {

            //println every rows in table
            //System.out.println("student_id" +"\t\t" + "first_name"+"\t\t"+"last_name"+"\t\t"+ "email"+"\t\t" +"enrollment_date" +"\t");
            while (rest.next()) {
                System.out.println(rest.getInt("student_id") + "\t\t" +
                        rest.getString("first_name") + "\t\t" +
                        rest.getString("last_name") + "\t\t" +
                        rest.getString("email") + "\t\t" +
                        rest.getDate("enrollment_date"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(String firstName, String lastName, String email, Date enrollmentDate) {
        String sql = "INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBStudentConnection.connect();
             PreparedStatement prepS = conn.prepareStatement(sql)) {

            // update database
            prepS.setString(1, firstName);
            prepS.setString(2, lastName);
            prepS.setString(3, email);
            prepS.setDate(4, enrollmentDate);
            prepS.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStudentEmail(int studentId, String newEmail) {
        String sql = "UPDATE students SET email = ? WHERE student_id = ?";

        try (Connection conn = DBStudentConnection.connect();
             PreparedStatement prepS = conn.prepareStatement(sql)) {

            prepS.setString(1, newEmail);
            prepS.setInt(2, studentId);
            prepS.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int studentId) {
        String sql = "DELETE FROM students WHERE student_id = ?";

        try (Connection conn = DBStudentConnection.connect();
             PreparedStatement prepS = conn.prepareStatement(sql)) {

            prepS.setInt(1, studentId);
            prepS.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
