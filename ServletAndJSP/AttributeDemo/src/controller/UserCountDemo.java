package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCountDemo
 */
@WebServlet("/usercnt")
public class UserCountDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		Integer count = (Integer)context.getAttribute("usercount");
		HttpSession session = request.getSession();
		if(session.isNew()) {
			if(count == null) {
				count = 1;
			}
			else {
				count++;
			}
		}
		context.setAttribute("usercount", count);
		out.println("<h1>The number of user login into our application are:" + count + "</h1>");
	}
}
