import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Employee{
    int id;
    String name;
    String gender;
}

class EmployeeDAO{
    public Employee getEmployee(int id){

        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "root";
        String query = "select * from employees where id="+id;
        try {

        Employee employee1 = new Employee();
        employee1.id = id;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        employee1.name = resultSet.getString(2);
        employee1.gender = resultSet.getString(3);

        return employee1;
        } catch (Exception e){
            System.out.println(e);
        }

        return null;

    }


}


public class DataAccessObject {
    public static void main(String[] args){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee2 = employeeDAO.getEmployee(2);
        System.out.println(employee2.name);
        System.out.println(employee2.gender);
    }
}
