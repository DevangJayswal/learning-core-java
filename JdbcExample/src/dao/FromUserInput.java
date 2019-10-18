package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FromUserInput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter employee id");
//		int employeeId = sc.nextInt();
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		Connection con = DriverManager.getConnection(url, "hr", "oracle");
//		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		String query = "select employee_id, first_name, last_name, salary from employees where employee_id="  + 100;

//		String query = "insert into departments values (280, 'MCIT Help Desk', 100, 1700)";
		
//		String query = "update departments set department_name='College Help Desk' where department_id=280";
		
//		PreparedStatement ps =
//				con.prepareStatement(query);//		
//		ps.setInt(1, 100);
		
		ResultSet rs = stmt.executeQuery(query);

		int count = stmt.executeUpdate(query);
		
		
		ArrayList<String> columnNames = new ArrayList<String>();
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();
		for(int i=1; i<=columnCount; i++) {
			columnNames.add(metaData.getColumnName(i));
		}
		System.out.println(columnNames);
		
		
//		while (rs.next()) {
//			System.out.println(rs.getInt("employee_id") + " " + rs.getString("first_name") + " "
//					+ rs.getString("last_name") + " " + rs.getDouble("salary"));
//		}
		
		
		
		
		stmt.close();
		System.out.println("ok");
	}
	
	
//	public static ArrayList<String> getColumnNames
	
	
	
}
