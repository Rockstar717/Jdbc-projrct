package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while (true) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the Driver Class");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person", "root", "root");
			System.out.println("To build the connection");
			Statement st = con.createStatement();
			System.out.println("Statement Created Succussfully to execute the query");

			/*
			 * st.execute("create database Java"); System.out.println("Database created");
			 * 
			 * st.
			 * execute("Create Table JVM (id int ,Address Varchar(255),Companyid int,Designation varchar(255), Com.Name varchar(255)"
			 * ); System.out.println("Table created");
			 */

			/*
			 * ResultSet rs = st.executeQuery("select * from emp"); while(rs.next()) {
			 * System.out.println(rs.getString(1)+ "  " + rs.getInt(2)+ "  "+
			 * rs.getString(3)+"  "+rs.getInt(4)); }
			 */

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name");
			String Name = sc.next();
			System.out.println("Enter the Age");
			int Age = sc.nextInt();
			System.out.println("Enter your Designation");
			String Designation = sc.next();
			System.out.println("Enter the Id");
			int id = sc.nextInt();

			st.executeUpdate(
					"Insert into emp values ('" + Name + "','" + Age + "','" + Designation + "','" + id + "')");
			System.out.println("Insert Succussfully");

			System.out.println("Continue to enter data 1.Yes 2.NO");
			String option = sc.next();
			if (option.equalsIgnoreCase("No")) {
				System.out.println("Thank you for using Application");
				break;
			}
		}
	}
}
