package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterPage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String email = req.getParameter("ue");
		long phone = Long.parseLong(req.getParameter("up"));
		String password = req.getParameter("pwd");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(password);

		PrintWriter pw = resp.getWriter();
		pw.print("<html><body><h1>" + name + " welcome to our service</h1></body></html>");
	}
}
