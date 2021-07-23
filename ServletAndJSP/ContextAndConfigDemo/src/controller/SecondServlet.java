package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet implements Servlet {
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		out.println("<html>");
		out.println("<body><pre>");
		out.println("<h2>");
		out.println("a --> " + context.getInitParameter("a"));
		out.println("b --> " + context.getInitParameter("b"));
		out.println("c --> " + config.getInitParameter("c"));
		out.println("d --> " + config.getInitParameter("d"));
		out.println("e --> " + config.getInitParameter("e"));
		out.println("f --> " + config.getInitParameter("f"));
		out.println("</h2>");
		out.println("</body></pre>");
		out.println("</html>");
	}
}
