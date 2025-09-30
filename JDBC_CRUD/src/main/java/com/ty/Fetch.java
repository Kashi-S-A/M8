package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/employeedb";
		String username = "postgres";
		String password = "root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);

			Statement stm = con.createStatement();

			String fetch = "select * from employee";

//			System.out.println(stm.executeUpdate(fetch));//Exception

//			System.out.println(stm.execute(fetch));//true

			ResultSet rs = stm.executeQuery(fetch);

			while (rs.next()) {
				int eid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				double salary = rs.getDouble(4);

				System.out.println(eid);
				System.out.println(name);
				System.out.println(email);
				System.out.println(salary);

				System.out.println("===================");
			}

			con.close();
			System.out.println("records fetched");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
