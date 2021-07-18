import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Without using Deployement descriptor use annotations
//@WebServlet("/welcome")
public class HelloServlet2 extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
    	int id = Integer.parseInt(req.getParameter("id"));
    	String name = req.getParameter("name");
    	String email = req.getParameter("email");
    	String address = req.getParameter("address");
    	resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + name + " .... Welcome to Servlet </h1>");
        out.println("<h4> Your ID is " + id + "</h4>");
        out.println("<h4> Your EmailID is " + email + "</h4>");
        out.println("<h4> Your Address is " + address + "</h4>");
        ServletContext scxt = this.getServletContext();
        ServletConfig scfg = this.getServletConfig();
        System.out.println(scfg.getInitParameter("HelloServlet2"));
        System.out.println(scxt.getInitParameter("GlobalParam"));
    }
}
