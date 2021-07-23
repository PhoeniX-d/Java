package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class CookieDemoServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		Cookie c = new Cookie(name, value);
		c.setMaxAge(180);
		response.addCookie(c);
		out.println("<html><h3>Cookie Added successfully</h3></html>");
		RequestDispatcher rd = request.getRequestDispatcher("cookie.html");
		rd.include(request, response);
	}
}
