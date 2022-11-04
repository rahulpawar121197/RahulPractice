package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo 
{
	
	public static void main(String[] args) {
		
		String str="insert into student (firstname,lastname) values ('shubham','kadam')";
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
		
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Rahul@sql");
		
	
	Statement statement=con.createStatement();
	statement.execute(str);
	
	con.close();
	statement.close();
	
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		System.out.println("insertion sucess ");
	}

}
