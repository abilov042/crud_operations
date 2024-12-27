package work.digigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection instance;
    private Connection connection;

    // Constructor for initialize connection
    private DbConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/crud_operations";
            String username = "postgres";
            String password = "1234";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to PostgreSQL database established.");
        }
        catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Create instance of Db connection
    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }



    // Get connection
    public Connection getConnection() {
        return connection;
    }
}
