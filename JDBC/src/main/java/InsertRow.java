import java.sql.*;

public class InsertRow {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";
        String query = "INSERT INTO users (user_id, name, age, city) VALUES (?,?,?,?)";

        int user_id = 7;
        String name = "Willo";
        int age = 18;
        String city = "Mali";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(query); //PreparedStatement
        statement.setInt(1, user_id);
        statement.setString(2, name);
        statement.setInt(3, age);
        statement.setString(4, city);

        int count = statement.executeUpdate(); //DML

        System.out.println(count + " row/s affected");
        statement.close();
        connection.close();
    }
}
