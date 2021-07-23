package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello this is SecondServlet</h1>");
		out.println("<h1>Forward Request Attributes</h1>");
		Enumeration<String> e = request.getAttributeNames();
		while(e.hasMoreElements())
		{
			String name= (String)e.nextElement();
			Object value = request.getAttribute(name);
			out.println(name+"....."+value+"<br>");
		}
	}
}
