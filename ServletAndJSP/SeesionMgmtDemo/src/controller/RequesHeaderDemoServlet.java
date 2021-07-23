package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test3")
public class RequesHeaderDemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Request Headers Information</h1></hr>");
		out.println("<table border=2><tr><th>HeaderName</th><th>Header values</th></tr>");
		Enumeration<String> e = request.getHeaderNames();
		while(e.hasMoreElements()) {
			String hName = (String)e.nextElement();
			out.println("<tr><td>"+hName+"</td><td>"+ request.getHeader(hName)+"</td></tr>");
		}
		out.println("</table></body></html>");
	}
}
