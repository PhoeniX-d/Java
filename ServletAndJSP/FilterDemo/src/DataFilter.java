import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DataFilter
 */
//@WebFilter("/reg")
public class DataFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter init() called");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int marks = 0;
		try {
			marks = Integer.parseInt(request.getParameter("marks"));				
		}catch(Exception e) {out.println(e.getMessage());}
		
		if(name.equals("")) {
			out.println("Name is required");
		}
		else if(email.equals("")) {
			out.println("Email is required");
		}
		else if(marks <= 0) {
			out.println("Enter valid marks");
		}
		else
		{
			// pass the request along the filter chain
			out.println("<div style='border-style:dashed;border-color:red;color:green;font-size:20;'>");
			out.println("<pre>");
			chain.doFilter(request, response);
			out.println("</pre>");
		}	
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filer destroyed");
	}
}
