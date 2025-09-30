package com.ty.closeConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeed";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		Connection con = null;

		try {
			// step 1 : Load the driver
			Class.forName(driver);
			System.out.println("Driver is loaded into the memory");

			// step 2 : Establish the connection
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection is created");

			// step 3 : Create a Statement
			Statement stm = con.createStatement();
			System.out.println("Statement is created");

			String insert = "INSERT INTO employee VALUES(106,'Tony','tony@gmail.com',78000)";

			// step 4 : execute the query
			int result = stm.executeUpdate(insert);
			System.out.println(result);

			System.out.println("record saved successfully");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					// step 5 : Close the connection
					con.close();
					System.out.println("Connection is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
