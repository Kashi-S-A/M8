package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeedb";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String delete = "DELETE FROM employee WHERE name='Tony'";

//			System.out.println(stm.execute(delete));

			int result = stm.executeUpdate(delete);
			System.out.println(result);

			con.close();

			System.out.println("record deleted and connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
