package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagea")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is Servlet PageA");

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Welcome to Servlet PageA</h1></body></html>");

		System.out.println("request forwarded");
		
		String userId = "User101";
		int userAge = 35;
		
		req.setAttribute("id", userId);
		req.setAttribute("age", userAge);

		RequestDispatcher rd = req.getRequestDispatcher("pageb");// to dispatch request to servlet then enter url of servlet
//		rd.forward(req, resp);										//to dispatch request to jsp then enter the name of jsp and to html enter the name of html
		rd.include(req, resp);
	}
}
