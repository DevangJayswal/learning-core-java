package com.example.jdbc.src.dao;

import java.sql.*;

public class Jdbc1Example {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		Connection con = DriverManager.getConnection(url, "hr", "oracle");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		String query = "select employee_id, first_name, last_name, salary from employees where employee_id=100";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.println(rs.getInt("employee_id") + " " + rs.getString("first_name")  + " " + rs.getString("last_name") + " " + rs.getDouble("salary"));
		}
		stmt.close();
		System.out.println("ok");
	}
}