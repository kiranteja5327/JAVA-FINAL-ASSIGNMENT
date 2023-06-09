@WebServlet("/createPost")
public class CreatePostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the data from the form
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String content = request.getParameter("content");

        // Create a BlogPost object
        BlogPost post = new BlogPost();
        post.setTitle(title);
        post.setDescription(description);
        post.setContent(content);

        // Store the blog post in the database
        // ... code to store the blog post in the database ...

        // Redirect to the view all posts page
        response.sendRedirect("viewAllPosts");
    }
}
