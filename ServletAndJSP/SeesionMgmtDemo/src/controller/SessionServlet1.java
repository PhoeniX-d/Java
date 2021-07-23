package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test1")
public class SessionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession hs = request.getSession();
		if (hs.isNew()) {
			out.println("<h2>New Session got created with Session ID :" + hs.getId() + "</h2>");
		}
		else {
			out.println("<h2>Existing Session only using with Session ID :" + hs.getId() + "</h2>");
		}
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		hs.setAttribute(name, value);
		hs.setMaxInactiveInterval(120);
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.include(request, response);
	}
}
