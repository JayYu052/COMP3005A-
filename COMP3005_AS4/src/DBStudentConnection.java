import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBStudentConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/students";
    private static final String user = "postgres";
    private static final String password = "newpassword";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void main (String[] args) {
        try{
            //Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null) {
                System.out.println("Connected to PostgreSQL successfully");
            } else {
                System.out.println("Faild to establish connection.");
            }
            //conn.close();
        }
        //ClassNotFoundException |
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}