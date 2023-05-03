package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB8 {

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
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);

            while (results.next()) {
                for (int i = 1; i <= 5 ; i++) {
                    System.out.print(results.getString(i) + " " );
                }
                System.out.println();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}