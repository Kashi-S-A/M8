package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/student_app?user=postgres&password=root";
		String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url);

			String sql = "INSERT INTO student VALUES(?,?,?,?)";

			String delete = "DELETE FROM student WHERE sid=?";

			String update = "UPDATE student SET phone=? WHERE sid=?";

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, 8);
			pstm.setString(2, "Rahul");
			pstm.setString(3, "rahul@gmail.com");
			pstm.setLong(4, 876543456);

			pstm.execute();

			con.close();

			System.out.println("record saved");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
