import java.sql.*;

public class Student {
	
	
	
int ID;
String FirstName;
String LastName;
String Street;
String City;
String State;
String Zip;
String Email;
double GPA;

public Student () {

}

public Student (int ID, String FirstName, String LastName, String Street, String City, String State,
 String Zip, String Email, double GPA) {
 
 this.ID = ID;
 this.FirstName = FirstName;
 this.LastName = LastName;
 this.Street = Street;
 this.City = City;
 this.State = State;
 this.Zip = Zip;
 this.Email = Email;
 this.GPA = GPA;

}

public int getID() {
return ID;

}

public void setID (int ID){
this.ID = ID;

}

public String getFirstName() {
return FirstName;

}

public void setFirstName (String FirstName){
this.FirstName = FirstName;

}

public String getLastName() {
return LastName;

}

public void setLastName (String LastName){
this.LastName = LastName;

}

public String getStreet() {
return Street;

}

public void setStreet (String Street){
this.Street = Street;

}

public String getCity() {
return City;

}

public void setCity (String City){
this.City = City;

}

public String getState() {
return State;

}

public void setState (String State){
this.State = State;

}

public String getZip() {
return Zip;

}

public void setZip (String Zip){
this.Zip = Zip;

}

public String getEmail() {
return Email;

}

public void setEmail (String Email){
this.Email = Email;

}

public double getGPA() {
return GPA;

}

public void setGPA (double GPA){
this.GPA = GPA;

}

public void display () {
System.out.println(ID);
System.out.println(FirstName);
System.out.println(LastName);
System.out.println(Street);
System.out.println(City);
System.out.println(State);
System.out.println(Zip);
System.out.println(Email);
System.out.println(GPA);

}

Connection C1;

public void selectDB(int ID){

try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // load driver

C1 = DriverManager.getConnection("jdbc:odbc:JavaDB1"); // connect database

Statement stmt;

stmt = C1.createStatement(); // create statement

String sql = ("SELECT * FROM Students WHERE ID ="+(ID));

ResultSet rs;

rs = stmt.executeQuery(sql); // execute statement
 
 while (rs.next()) {
 
System.out.println(rs.getInt("ID") + "\t" + rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" + rs.getString("Street") + "\t" +
rs.getString("City") + "\t" + rs.getString("State") + "\t" + rs.getString("Zip") + "\t" + rs.getString("Email") + "\t" + rs.getInt("GPA"));
  
 }
 
 C1.close();
 
 } // close try
 
 catch(Exception ex){
 
 ex.printStackTrace();
 
 }
 
}

Connection C1;

public void insertDB(int ID, String FirstName, String LastName, String Street, String City, String State,
String Zip, String Email, double GPA){
	 
	try{
	 
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // load driver
	 

     C1 = DriverManager.getConnection("jdbc:odbc:JavaDB1"); // connect database

     Statement stmt;

     stmt = C1.createStatement(); // create statement
	 
	 String sql;
	 
	 sql = "INSERT INTO Students VALUES ("+ ID +" ," +
	                                        FirstName + "' ,'"+
											LastName + "' ,'"+
											Street + "' ,'"+
											City + "' ,'"+
											State + "' ,'"+
											Zip + "' ,'"+
											Email + "' ,'"+
											GPA + " )";
											
	int n;
	
	n = stmt.executeUpdate(sql);
	
	if (n==1)
		System.out.println("Insert Successful!");
	else
		System.out.println("Insert Failed!");
	
	}
	
	 C1.close(); 
	
	catch (Exception e){
 
 e.printStackTrace();
 
	}
	
}

Connection C1;

public void deleteDB(int ID){
	
	try{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // load driver
	 
        C1 = DriverManager.getConnection("jdbc:odbc:JavaDB1"); // connect database
		
		Statement stmt;

        stmt = C1.createStatement()( //create statement
		
		ResultSet.TYPE_FORWARD_ONLY,
        ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM Students WHERE ID=" +ID);
		
		While (rs.next()){
			int id = rs.getInt("ID");
			if (id==ID){
				rs.deleteRow();
			}
			
		}
		
		System.out.println("Row deleted");
		
		C1.close();			
	}
	
	catch(Exception e){
		e.printStackTrace();
		
	}
	
}

Connection C1;

public void updateDB(int ID, String Zip){
	
	try{
	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // load driver
	 
    C1 = DriverManager.getConnection("jdbc:odbc:JavaDB1"); // connect database
	
	Statement stmt;
	
	stmt = C1.createStatement(
	ResultSet.TYPE_SCROLL_SENSITIVE,
	ResultSet.CONCUR_UPDATABLE);
	
	stmt.executeQuery("SELECT Zip FROM Students WHERE ID = " +ID);
	
	ResultSet rs;
	
	rs.moveToInsertRow();
	rs.stmt.getResultSet();
	
	while (rs.next()){
		
		String zip = rs.getString("Zip");
		rs.updateString("zip");
		rs.updateRow();
	}
	C1.close();
		
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
		
}

public static void main(String[] args) {

//Student  s1 = new Student(4,"Frank", "Jones", "123 Main", "Atlanta", "GA", "30133", "fj@yahoo.com", 3.2);
//s1.display();

//Student  s1 = new Student();  
//s1.selectDB(4);     //accessing DB
//s1.display();      //displays all data from DB for student with id=4

//Student s2 = new Student();
//s2.insertDB(33, "Frank", "Mayes", "123 Main street", "Atlanta", "GA", "30100", "fmayes@yahoo.com", 3.3);
//s2.display();

//Student s3 = new Student();
//s3.selectDB(6);
//s3.deleteDB();

Student s4 = new Student ();
s4.selectDB(7);
s4.setZip(30106);
s4.updateDB();

}

}