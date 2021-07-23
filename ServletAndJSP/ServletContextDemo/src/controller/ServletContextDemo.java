package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletContextDemo extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Get ServletContext
		ServletContext context = getServletContext();
		
		String servletName = context.getServletContextName();
		String driverClass = context.getInitParameter("driverClass");
		String url = context.getInitParameter("url");

		Enumeration e = context.getInitParameterNames();
		String paramNames = "";
		while (e.hasMoreElements()) {
			paramNames = paramNames + e.nextElement() + "<br>";
		}
		context.setAttribute("cid", "C-111");
		context.setAttribute("cname", "Java");
		context.setAttribute("cost", "10000");
		
		String cid = (String) context.getAttribute("cid");
		String cname = (String) context.getAttribute("cname");
		String cost = (String) context.getAttribute("cost");
		
		e = context.getAttributeNames();
		String attrNames = "";
		while (e.hasMoreElements()) {
			attrNames = attrNames + e.nextElement() + "<br>";
		}
		
		out.println("<html><body><pre><h2>");
		out.println("Logical Name : " + servletName);
		out.println("Driver Class : " + driverClass);
		out.println("Driver URL   : " + url);
		out.println("Parameter Names");
		out.println(paramNames);
		out.println("Course ID 	  : " + cid);
		out.println("Course Name  : " + cname);
		out.println("Course cost  : " + cost);
		out.println("Attributes Names");
		out.println(attrNames);
		out.println("<h2></pre></body></html>");
	}
}
