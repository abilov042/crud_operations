package work.digigo;

import java.sql.*;

public class UserRepository {
    public void save(User user) {

        try {
            Connection connection = DbConnection.getInstance().getConnection();
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void delete(int id) {

        try {
            Connection connection = DbConnection.getInstance().getConnection();
            String query = "DELETE FROM users WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
