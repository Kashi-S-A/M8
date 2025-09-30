package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/employeedb";
		String username = "postgres";
		String password = "root";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String update = "UPDATE employee SET salary=95000 WHERE name='Tony'";

//			System.out.println(stm.execute(update));

//			ResultSet rs = stm.executeQuery(update);//Exception

			int result = stm.executeUpdate(update);
			System.out.println(result);

			con.close();

			System.out.println("record updated and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
