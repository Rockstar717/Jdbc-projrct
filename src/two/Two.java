package two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Two {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Load Driver Class");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/Laptop","root","root");
        System.out.println("Connection is Build");
        
        Statement st = con.createStatement();
        System.out.println("Create statement");
        
       /* st.execute("create Database Laptop");
        System.out.println("create database");*/
      /*st.execute("create table Dell (id int, name varchar(20),education varchar(20),Remark varchar(20))");
        System.out.println("Create Table");*/
      /*  st.execute("Insert into Dell  ( id, name,education,Remark) values(10,'manoj','Bcs','ok')");
        System.out.println("Insert the value");*/
        /*st.execute("insert into dell values (20,'Deepak','Msc','Ok')");
        System.out.println("Insert Data");*/
        /*st.execute("insert into dell values (30,'chetan','Data Science','Good')");
        System.out.println("Insert data");*/
        
       /* st.executeUpdate("delete from dell where name = 'chetan'");
        System.out.println("delete the operation");*/
        
       /* st.executeUpdate("update Dell set name='Bhushan' where education = 'Msc'");
        System.out.println("update Name");*/
        
       /* st.execute("alter table dell add salary int After Remark");
        System.out.println("Add Alter column");*/
        st.execute("update dell set salary = 40000 Where name='Bhushan'");
        System.out.println("insert value");   
	}
}
