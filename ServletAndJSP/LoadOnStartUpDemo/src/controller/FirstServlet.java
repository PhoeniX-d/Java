package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/first" }, loadOnStartup = 10)
public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("FirstServlet loading");
	}
	
	public FirstServlet() {
		System.out.println("FirstServlet Instantiation");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet initialization");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("<h1>FirstServlet:Writing servlet using GenericServlet</h1>");
		System.out.println("service() method executed");
	}
	
	public void destroy() {
		System.out.println("FirstServlet Deinstantiation");
	}
}
