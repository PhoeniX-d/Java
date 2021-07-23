package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCountDemo
 */
@WebServlet("/attr")
public class GetAttributeInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		Enumeration<String> e = context.getAttributeNames();
		out.println("<html><body><pre>");
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			Object value = context.getAttribute(name);
			out.println(name + "---->" + value + "<br>");
		}
		out.println("</pre></body></html>");
	}
}
