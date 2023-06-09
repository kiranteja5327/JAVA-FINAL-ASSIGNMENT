import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/teja";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Kiran@5327";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select id,name,age from studentinfo where id=?");
            		 {

            response.setContentType("text/html");
            response.getWriter().println("<html>");
            response.getWriter().println("<head><title>Data</title></head>");
            response.getWriter().println("<body>");
            response.getWriter().println("<h1>Data from MySQL Database</h1>");
            response.getWriter().println("<table border=\"1\">");
            response.getWriter().println("<tr><th>ID</th><th>Name</th><th>Age</th></tr>");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                response.getWriter().println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + age + "</td></tr>");
            }

            response.getWriter().println("</table>");
            response.getWriter().println("</body>");
            response.getWriter().println("</html>");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
