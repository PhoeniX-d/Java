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

@WebServlet("/test")
public class RequestHeadersDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=green text=white>");
		out.println("<h1>Request Headers Information</h1><hr>");
		out.println("<table border=2><tr><th>HeaderName</th><th>Header Values</th></tr>");
		Enumeration<String> e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String hname = (String) e.nextElement();
			String hvalue = request.getHeader(hname);
			out.println("<tr><td>" + hname + "</td><td>" + hvalue + "</td></tr>");
		}
		out.println("</table></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
