import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFetchAll {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM country";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        String countryCode = "";
        String countryName = "";
        String countryCodeName = "";

       while(resultSet.next()) {
           countryCode = resultSet.getString(1);
           countryName = resultSet.getString(2);
           countryCodeName = countryCode + " : " + countryName;
           System.out.println(countryCodeName);
       }
        

        statement.close();
        connection.close();
    }
}
