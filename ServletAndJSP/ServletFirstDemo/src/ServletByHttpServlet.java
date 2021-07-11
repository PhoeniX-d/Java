/*
*	By Extending HttpServlet
*/

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

// Without using Deployement description use annotationss
//@WebServlet("/welcome")
public class ServletByHttpServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is from doGet() method.....</h1>");
	}
	
	 public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is from doPost() method.....</h1>");
	}
}
