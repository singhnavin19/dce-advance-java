package com.gdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcMysqlExamle {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.register driver or Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. Create connection:
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_2023","root","root");
		
		//3. Create statement:
		Statement stmt=con.createStatement();
		
		//4. Execute statement:
		ResultSet rst=stmt.executeQuery("select * from student_info");
		ResultSetMetaData rstmeta=rst.getMetaData();
		
		for(int i=1;i<=rstmeta.getColumnCount();i++) {
			System.out.print(rstmeta.getColumnName(i) +" ");
		}
		System.out.println();
		
		while(rst.next()){
			System.out.print(rst.getString("rollNo")+" "+ rst.getString("name")+" "+rst.getString("subject"));
			System.out.println("");
		}
		//5. Close database connection:
		con.close();
	}
}