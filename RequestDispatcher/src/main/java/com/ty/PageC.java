package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagec")
public class PageC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("This is servlet PageC");

//		resp.getWriter().print("<html><body><h1>Welcome to Servlet PageC</h1></body></html>");

//		resp.sendRedirect("https://www.wikipedia.org/");//url of third party website

		resp.sendRedirect("register.jsp");// servlet,jsp,html
	}
}
