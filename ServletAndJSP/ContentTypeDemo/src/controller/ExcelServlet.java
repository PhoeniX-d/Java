package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excel")
public class ExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/vnd.ms-excel");
		out.println("<h1><table border=1>");
		out.println("<tr><th>NAME</th><th>Runs</th></tr>");
		out.println("<tr><td>Sachin</td><td>18000</td></tr>");
		out.println("<tr><td>Virat</td><td>15000</td></tr>");
		out.println("<tr><td>Rohit</td><td>9000</td></tr>");
		out.println("<tr><td>MS Dhoni</td><td>10000</td></tr></h1>");
		
		/*// Send requests to other servlet
		response.setStatus(302);
		response.setHeader("Location", "./word");		
		*/
		/* Way 2 */
		//response.sendRedirect("./word");
	}
}
