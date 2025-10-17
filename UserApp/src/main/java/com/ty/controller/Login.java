package com.ty.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.conn.ConnectionPool;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Read email and pwd from req
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println("creds : " + email + " , " + password);

		try {
			// get connection
			Connection con = ConnectionPool.giveConnection();

			String fetch = "SELECT * FROM users WHERE email=? and password=?";

			PreparedStatement pstm = con.prepareStatement(fetch);
			pstm.setString(1, email);
			pstm.setString(2, password);

			// execute select query
			ResultSet rs = pstm.executeQuery();

			ConnectionPool.submitConnection(con);

			if (rs.next()) {
				// credentials are valid display home.jsp
				RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
				rd.forward(req, resp);
			} else {
				// credentials are invalid then display login.jsp with errmsg 'Invalid
				// credentials'
				req.setAttribute("errmsg", "Invalid credentials");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
