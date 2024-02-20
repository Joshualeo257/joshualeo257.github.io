
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
     // Get the value from the form submission
     String inputValue = request.getParameter("inputValue");

     // Call the method in ExampleJavaClass with the received value
     Searchmain exampleJavaClass = new Searchmain();
     Searchmain.processValue(inputValue);
     List<String> result = Searchmain.finallst;
     List<String> result2 = Searchmain.URL;

     // Set the result as an attribute in the request
     request.setAttribute("result", result);
     request.setAttribute("result2", result2);

     // Forward to the same JSP page
     //response.sendRedirect("searchResults.jsp");
     getServletContext().getRequestDispatcher("/SearchR.jsp").forward(request, response);
    }
}
