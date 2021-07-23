package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class CookieServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Cookie[] c = request.getCookies();
		if (c == null) {
			out.println("<h2> No cookies are assiciated with the request</h2>");
		} else {
			out.println("<table border=2><tr><th>Cookie Name</th><th>Cookie Value</th></tr>");
		}

		for (Cookie c1 : c) {
			String name = c1.getName();
			String value = c1.getValue();
			out.println("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
		}
		out.println("</table>");
	}
}
