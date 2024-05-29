import java.sql.*;

public class JDBCClass {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM country WHERE code='KEN'";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        // DDL - Data Definition Language - Creating or changing structure of DB/Table
        // DML - Data Manipulation Language - Managing and manipulating data within a database
        // DQL - Data Query Language - Fetching Data
        // TCL - Transaction Control Language - Granting, Revoking permissions

        ResultSet resultSet = statement.executeQuery(query); //DQL

        resultSet.next();
        String name = resultSet.getString(1);
        System.out.println(name);

        statement.close();
        connection.close();
    }
}
