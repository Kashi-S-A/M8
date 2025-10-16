package com.ty.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.conn.ConnectionPool;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// read the data from register.jsp
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("password");

		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");

		// get connection
		try {
			Connection connection = ConnectionPool.giveConnection();

			String insert = "INSERT INTO users VALUES(?,?,?,?)";

			PreparedStatement pstm = connection.prepareStatement(insert);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setLong(3, phone);
			pstm.setString(4, password);

			// insert record
			int result = pstm.executeUpdate();

			// submit connection
			ConnectionPool.submitConnection(connection);

			if (result > 0) {
				// record inserted successfully return succ message and display login.jsp
				req.setAttribute("succmsg", "Registered Successfully");
				rd.forward(req, resp);
			} else {
				// failed to register message
				req.setAttribute("errmsg", "Failed to Registered");
				rd.forward(req, resp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// if already registered return error message and display login.jsp
			req.setAttribute("errmsg", "Already Registered");
			rd.forward(req, resp);
		}

	}
}
