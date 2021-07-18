import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Without using Deployement descriptor use annotations
//@WebServlet("/welcome")
public class HelloServlet1 extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
    	String name = req.getParameter("p1");
    	resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + name + " .... Welcome to Servlet </h1>");
    }
}
