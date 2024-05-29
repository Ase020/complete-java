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
        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();
        String name = resultSet.getString("Region");
        System.out.println(name);

        statement.close();
        connection.close();
    }
}
