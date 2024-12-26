package work.digigo;

import java.sql.*;

public class UserRepository {
    public void save(User user) throws ClassNotFoundException {

        try (Connection connection = DbConnection.getConnection()){

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

    public void delete(int id) throws ClassNotFoundException {

        try (Connection connection = DbConnection.getConnection()){

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
