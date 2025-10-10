package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("ReadData servlet is triggered");

		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		String pwd = req.getParameter("userpassword");

		System.out.println(name);
		System.out.println(email);
		System.out.println(pwd);

		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ "<body>"
				+ "<h1>Hey, " + name+".........!!! Welcome to ReadData Servlet</h1><br>"
				+ "<h2>You account is created successfully with email : "+ email + "</h2>"
				+ "</body>"
				+ "</html>");
	}
}
