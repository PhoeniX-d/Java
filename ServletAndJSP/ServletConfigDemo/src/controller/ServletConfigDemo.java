package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletConfigDemo extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String servletName = config.getServletName();
		String driverClass = config.getInitParameter("driverClass");
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");

		Enumeration e = config.getInitParameterNames();
		String paramNames = "";
		while (e.hasMoreElements()) {
			paramNames = paramNames + e.nextElement() + "<br>";
		}
		out.println("<html><body><pre><h2>");
		out.println("Logical Name : " + servletName + "<br>");
		out.println("Driver Class : " + driverClass + "<br>");
		out.println("Driver URL   : " + url + "<br>");
		out.println("User Name    : " + username + "<br>");
		out.println("Password     : " + password + "<br>");
		out.println("Initialization parameter Names;<br>");
		out.println(paramNames);
		out.println("<h2></pre></body></html>");
	}
}
