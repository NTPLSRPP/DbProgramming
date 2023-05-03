package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB12 {
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
            String sql = "INSERT INTO student (studentID, firstName, lastName, email, deptID) " + "values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "65130500020");
            preparedStatement.setString(2, "Nathaphat");
            preparedStatement.setString(3, "Lertsiriphongphan");
            preparedStatement.setString(4, "nathaphat.n07@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
