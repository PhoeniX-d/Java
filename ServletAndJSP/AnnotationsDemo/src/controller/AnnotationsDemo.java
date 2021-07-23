package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnnotationsDemo
 */
@WebServlet(
		name = "AnnotatedServlet",
		urlPatterns = { "/welcome" }, 
		loadOnStartup = 1,
		initParams = { 
				@WebInitParam(name = "a", value = "AAA"), 
				@WebInitParam(name = "b", value = "BBB")
		})
public class AnnotationsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		out.println("<html><body><h2>Welcome To HttpServlet");
		out.println("Annotations<br>");
		out.println("Logical Name		: " + config.getServletName() + "<br>");
		out.println("a	: " + config.getInitParameter("a") + "<br>");
		out.println("b	: " + config.getInitParameter("b") + "<br>");		
		out.println("</h2></body></html>");
	}

}
