package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName="bad", urlPatterns="/wrapper")
public class BadWordFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside Filter");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		CustomizedRequest req = new CustomizedRequest((HttpServletRequest)request);
		chain.doFilter(req, response);
	}

	public void destroy() {
		System.out.println("Inside destroy");
	}

}
