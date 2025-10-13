package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageb")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is Servlet PageB");

		String userId = (String) req.getAttribute("id");
		int userAge = (Integer) req.getAttribute("age");

		System.out.println(userAge);
		System.out.println(userId);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>Welcome to Servlet PageB</h1></body></html>");

	}
}
