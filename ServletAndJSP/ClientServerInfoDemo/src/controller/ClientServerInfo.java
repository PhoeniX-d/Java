package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class ClientServerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=green text=white>");
		out.println("<h1>Client IP Address :" + request.getRemoteAddr());
		out.println("<h1>Client Host :" + request.getRemoteHost());
		out.println("<h1>Client Port :" + request.getRemotePort());
		out.println("<h1>Server Name:" + request.getServerName());
		out.println("<h1>Server Port :" + request.getServerPort());
		out.println("</table></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
