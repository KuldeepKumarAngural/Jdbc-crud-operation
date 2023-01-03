package com.qsp.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank {
	
	static Connection connection;
	
	static int id;
	static String name;
	static String address;
	static String ifsc;
	static double balance;
	
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-project-assignment";
			String user = "root";
			String pass = "deep@1081";
			Connection connection = DriverManager.getConnection(url, user, pass); 
			Statement statement = connection.createStatement();
			id=1081;
			name="kuldeep";
			address="patna";
			ifsc="SBI01000";
			balance=768900;
			
			String insert = "insert into bank values("+id+",'"+name+"','"+address+"','"+ifsc+"',"+balance+")";
			//step-4 execute the query
			
			statement.execute(insert);
			
			System.out.println("Data stored..........");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
