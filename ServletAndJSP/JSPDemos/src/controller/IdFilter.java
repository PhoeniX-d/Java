package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addPerson")
public class IdFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
				
		System.out.println("Inside Filter");
		HttpServletRequest req = (HttpServletRequest) request;
		int pid = Integer.parseInt(request.getParameter("pid"));
		if (pid > 1) {
			chain.doFilter(req, response);
		}else {
			out.println("Invalid ID entered");
		}
	}

	public void destroy() {

	}
}
