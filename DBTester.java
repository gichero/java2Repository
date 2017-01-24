

import java.sql.*;

public class DBTester {

 public static void main (String[] args)throws ClassNotFoundException { 

 Connection C1;
try {
  
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//load driver
 
 
  C1 = DriverManager.getConnection("jdbc:odbc:JavaDB1");//connect database
 
 Statement stmt;
  stmt = C1.createStatement();// create statement
  
 String sql = ("select  * from Instructors");
  
 System.out.println(sql);
  
 ResultSet rs;
  
 rs = stmt.executeQuery(sql);//execute statement
  
 while (rs.next()){
  
 System.out.println(rs.getString("ID") + "\t" + rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getString("Street") + "\t" +
  rs.getString("City") + "\t" + rs.getString("State") + "\t" + rs.getString("Zip") + "\t" + rs.getString("Office") + "\t" + rs.getString("Email"));
 }
   C1.close();
  }//close try
  
 catch (Exception ex) {
  
 ex.printStackTrace();
 
  }// close catch
  

    
 }// close main

}// close class