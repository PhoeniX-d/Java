package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet2
 */
@WebServlet("/test2")
public class SessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession(false);
		if(hs == null) {
			out.println("<h2>No Session information is available");
		}
		else {
			Enumeration<String> e = hs.getAttributeNames();
			out.println("<table border=2><tr><th>Session Attribute Name</th><th>Session Attribute Value</th></tr>");
			while(e.hasMoreElements()) {
				String name = (String)e.nextElement();
				String value = (String)hs.getAttribute(name);
				out.println("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
			}
			
			out.println("</table>");
			long l1 = hs.getCreationTime();
			long l2 = hs.getLastAccessedTime();
			int l3 = hs.getMaxInactiveInterval();
			out.println("<h3>The Creation time is " + new Date(l1) + "</h3>");
			out.println("<h3>The Last accessed time " + new Date(l2) + "</h3>");
			out.println("<h3>The Max inactive interval  " + l3 + "</h3>");
		}
	}
}
