package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Without using Deployement descriptor use annotations
//@WebServlet("/welcome")
public class HelloServlet1 implements Servlet {
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("p1");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>" + name + " .... Welcome to Servlet </h1>");
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(arg0.getInitParameter("HelloServlet1"));
		ServletContext scxt = arg0.getServletContext();
		System.out.println(scxt.getInitParameter("GlobalParam"));
	}
}
