/*
*	By Extending Servlet
*/

import javax.servlet.*;
import java.io.*;
import java.util.*;

// Without using Deployement description use annotationss
//@WebServlet("/welcome")
public class ServletByServlet implements Servlet
{
	static
	{
		System.out.println("Servlet class loading");
	}
	
	public ServletByServlet()
	{
		System.out.println("Servlet instantiation");
	}
	
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init() method execution");
	}
	
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
		resp.setContentType("text/html");
		System.out.println("service() method execution");
		PrintWriter out = resp.getWriter();
        out.println("<h1> Welcom to Servlet here we implement Servlet interface");
		out.println("<h1>Server time is:" + new Date() + "</h1>");
    }
	
	public void destroy()
	{
		System.out.println("destroy() method execution");
	}
	
	public ServletConfig getServletConfig()
	{
		return null;
	}
	
	public String getServletInfo()
	{
		return "Developed by Pranav";
	}
}
