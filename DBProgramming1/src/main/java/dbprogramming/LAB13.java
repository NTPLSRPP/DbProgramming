package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB13 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();
            String sql = "UPDATE student SET email = ? " + "where studentID = ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "12345@gmail.com");
            preparedStatement.setString(2, "65130500020");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
