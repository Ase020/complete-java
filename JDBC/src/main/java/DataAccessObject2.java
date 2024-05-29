import java.sql.*;

class Employee2{
    int id;
    String name;
    String gender;
}

class Employee2DAO{
    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/world";
    String username = "root";
    String password = "root";


    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Employee getEmployee(int id){
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

    public void addEmployee(Employee2 employee){
        String query = "INSERT INTO employees (id, name, gender) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.id);
            preparedStatement.setString(2, employee.name);
            preparedStatement.setString(3, employee.gender);

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public  void  removeEmployee(int employeeId){
        String query = "DELETE FROM employees WHERE id=?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employeeId);

            int count = preparedStatement.executeUpdate();

            System.out.println(count + " row/s affected");

            preparedStatement.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}


public class DataAccessObject2 {
    public static void main(String[] args){
        Employee2DAO employee2DAO = new Employee2DAO();
        Employee2 employee2 = new Employee2();
        employee2.id = 4;
        employee2.name = "Willo Priest";
        employee2.gender = "Male";
        employee2DAO.connect();
//        employee2DAO.addEmployee(employee2);
        employee2DAO.removeEmployee(4);
    }
}
