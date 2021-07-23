package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/second" }, loadOnStartup = 20)
public class SecondServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("SecondServlet loading");
	}

	public SecondServlet() {
		System.out.println("SecondServlet Instantiation");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("SecondServlet initialization");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("<h1>SecondServlet:Writing servlet using GenericServlet</h1>");
		System.out.println("service() method executed");
	}
	
	public void destroy() {
		System.out.println("SecondServlet Deinstantiation");
	}
}
