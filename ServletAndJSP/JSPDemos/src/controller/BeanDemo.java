package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerBean;

/**
 * Servlet implementation class BeanDemo
 */
@WebServlet("/BeanDemo")
public class BeanDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<CustomerBean> customers = new ArrayList<>();
		customers.add(new CustomerBean("Pranav", "prnv@gmail.com", 2771));
		customers.add(new CustomerBean("Akash", "aksh@gmail.com", 7357));
		customers.add(new CustomerBean("Manoj", "manoj@gmail.com", 2098));
		customers.add(new CustomerBean("Ishan", "ishan23@gmail.com", 4788));
		customers.add(new CustomerBean("Kartik", "kartik11@gmail.com", 2395));

		request.setAttribute("customers", customers);
		RequestDispatcher rd = request.getRequestDispatcher("jstldemo.jsp");
		rd.forward(request, response);
	}
}
