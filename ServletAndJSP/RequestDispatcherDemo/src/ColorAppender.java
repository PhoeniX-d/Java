import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ColorAppender
 */
@WebServlet("/hello")
public class ColorAppender extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// Using URL Pattern
		//RequestDispatcher rd = request.getRequestDispatcher("/next");
		
		// Using class name
		RequestDispatcher rd = getServletContext().getNamedDispatcher("HelloServlet");
		// First came here then after that gone to HelloServlet
		out.println("<body style = 'background-color:cyan;'>");
		rd.include(request, response);
		out.println("</body>");
	}
}
