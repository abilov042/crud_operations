package work.digigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection connection;

    private static final String url = "jdbc:postgresql://localhost:5432/crud_operations";
    private static final String username = "postgres";
    private static final String password = "1234";


    private DbConnection() {}

    public static Connection getConnection() throws ClassNotFoundException {

        if (connection == null) {
            Class.forName("org.postgresql.Driver");
            try {
                connection = DriverManager.getConnection(url, username, password);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
