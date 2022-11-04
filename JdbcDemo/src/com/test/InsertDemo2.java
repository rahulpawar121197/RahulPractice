package com.test;

  //import java.sql.Connection;
import java.sql.DriverManager;
  //import java.sql.Statement;

  // inserting data into DB by creating statement
public class InsertDemo2 {

	public static void main(String[] args) {
		
	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		
DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root" ,"Rahul@sql").createStatement().execute("insert into student (firstname,lastname) values ('rahul','pawar')");


		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("operation done");
	}
}
