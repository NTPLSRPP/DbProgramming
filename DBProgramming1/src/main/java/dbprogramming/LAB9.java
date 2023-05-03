package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {
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
            String sql = "INSERT INTO student(studentID, firstName, lastName, email, deptID) VALUES (65130500020, 'Nathaphat', 'Lertsiriphongphan', 'nathaphat.n07@gmail.com', 'IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
