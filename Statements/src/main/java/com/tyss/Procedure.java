package com.tyss;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Procedure {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app?user=postgres&password=root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			String sql1 = "call procedurename(?,?,?,?)";// command to call procedure
			String sql2 = "select function_name(?)";// command to call function

			CallableStatement cstm = con.prepareCall(sql1);
			cstm.setInt(1, 101);
			cstm.setString(2, "Smith");
			cstm.setString(3, "smith@gmail.com");
			cstm.setLong(4, 876545678);

			cstm.execute();

			con.close();

			System.out.println("procedure executed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
