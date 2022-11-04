package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// inserting data into DB by preparing statement
public class InsertDemo3 {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Rahul@sql");
			
			PreparedStatement ps = con.prepareStatement("insert into student (firstname) values (?)");
			
			PreparedStatement ps1 = con.prepareStatement("select answer  from quiz.quiz where QueNo=?");
			
			ps1.setString(1, "1");
			
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				
				String check=rs.getString(1);
				
				System.out.println(check);
				
				String answer="b";
				
				System.out.println(answer.equals(check));
					
					
					
				
			}
			
			ps.setString(1, "Akshay");
			 ps.executeUpdate();
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		 System.out.println("done");
		
	}

}
