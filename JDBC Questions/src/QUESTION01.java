/*
 * 11. Write a Java program that connects to a MySQL database using JDBC. The program
       should read data from a table and display the results in the console.
 * 
 */
import java.sql.*;

public class QUESTION01 {
    public static void main(String[] args)
    {
       
        String url = "jdbc:mysql://localhost:3306/teja";
        String username = "root";
        String password = "Kiran@5327";

        
        String query = "insert into persondetails(id,name,age) values(?,?,?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
