/*
*	By Extending GenericServlet
*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

// Without using Deployement description use annotationss
//@WebServlet("/welcome")
public class ServletByGenericServlet extends GenericServlet
{
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        PrintWriter out = resp.getWriter();
        out.println("<h1> Welcom to Servlet");
    }
}
