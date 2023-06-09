/*
 * 13. Create a Java program that connects to a PostgreSQL database and executes a
batch update. The program should read the input data from a file and insert it into the
database using JDBC batch updates.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QUESTION03 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/teja";
        String username = "root";
        String password = "Kiran@5327";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String filePath = "data.txt";
            String insertQuery = "insert into records (name, age) values (?, ?)";

            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(",");

                    String name = data[0].trim();
                    int age = Integer.parseInt(data[1].trim());

                    preparedStatement.setString(1, name);
                    preparedStatement.setInt(2, age);
                    preparedStatement.addBatch();
                }

                int[] result = preparedStatement.executeBatch();

                System.out.println("Records inserted: " + result.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
