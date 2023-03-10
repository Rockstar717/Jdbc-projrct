package one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Load the Class");
		
		/* catch (Exception e)
		  { 
		  System.out.println(e);
		   } */
		
	//	1 Approach
		
		// String URL = "Jdbc:mysql://Localhost:3306/database_name";
		// String user ="root";
		// String password= "root";
		
//      2 Approach
		Connection con = DriverManager.getConnection("Jdbc:mysql://Localhost:3306/professional", "root","root");
		System.out.println("connection is build");
		
		Statement st = con.createStatement();
		System.out.println("Create the Statement");
		/*String Q ="create database Company";
		st.execute(Q);*/
		
		/*st.execute("create database professional");
		System.out.println("create database");*/
		
       /* st.execute("create table Jdbc (id int,Address varchar(20),contact Int )");
        System.out.println("Table is Created");*/
		
		/*st.execute("Insert into jdbc (id ,Address,Contact) values(10,'Pune',904936458)");
		System.out.println("Insert data");*/
		
		/*st.execute("Insert into jdbc (id ,Address,Contact) values(20,'Mumbai',90494586)");
		System.out.println("Insert data");*/
		
		/*st.execute("Insert into jdbc (id ,Address,Contact) values(20,'Nasik',904936418)");
		System.out.println("Insert data");*/
		
		/*st.executeUpdate("delete from Jdbc where Address='Mumbai'");
		System.out.println("Delete the Data");*/
		
		st.executeUpdate("update Jdbc set id=30 where Address='Nasik'");
		System.out.println("update data");
		
	}
}
