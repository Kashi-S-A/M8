package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeedb";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";
		try {
			// step 1 : Load the driver
			Class.forName(driver);
			System.out.println("Driver is loaded into the memory");

			// step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is created");

			// step 3 : Create a Statement
			Statement stm = con.createStatement();
			System.out.println("Statement is created");

			String insert = "INSERT INTO employee VALUES(102,'John','john@gmail.com',48000)";

			// step 4 : Execute the query
			System.out.println(stm.execute(insert));
			System.out.println("record saved successfully");

			// step 5 : Close the connection
			con.close();
			System.out.println("Connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
