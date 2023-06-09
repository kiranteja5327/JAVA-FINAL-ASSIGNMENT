/*
 * 
 * 16. Create a Java servlet that uses session management to maintain the state of the
user across multiple requests. The servlet should store the user's name in a session
object and display it on multiple pages of the web application.
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/nameServlet")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    
    {
        String name = request.getParameter("name");

        HttpSession session = request.getSession();

        session.setAttribute("name", name);

        response.sendRedirect("file.jsp");
    }
}
