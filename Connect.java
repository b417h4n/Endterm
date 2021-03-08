import java.sql.Connection;
import java.sql.DriverManager;
public class Connect {
    public static void main(String[] args) {
        Connection connection =null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/endterm","postgres","postgres");
            if (connection != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println();
    }
}