import java.sql.*;


public class Data
{
	String user="system";
	String pass="system";
	PreparedStatement stm;
	PreparedStatement preparedStmt;
	public Data()
	{
		try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				String query = "CREATE TABLE  LOGIN_NEW  (USER_ID VARCHAR2(100), USER_PASSWORD VARCHAR2(100))";
      				preparedStmt = conn.prepareStatement(query);
      				preparedStmt.execute();
				stm =  conn.prepareStatement("insert into login_new values(?,?)");
			                stm.setString(1,"avsk");
				stm.setString(2,"456");
				stm.executeUpdate();
				String query2 = "CREATE TABLE  ADMISSION(ID VARCHAR2(50), NAME VARCHAR2(100), FN VARCHAR2(50), RELIGION VARCHAR2(60), NATIONALITY VARCHAR2(200), ADDRESS VARCHAR2(20), MOBILE VARCHAR2(50), CITY VARCHAR2(50), GENDER VARCHAR2(10), CLASS2 VARCHAR2(10), DOB VARCHAR2(20), ADMIDATE VARCHAR2(20))";
      				preparedStmt = conn.prepareStatement(query2);
      				preparedStmt.execute();				
				String query3 = "CREATE TABLE  FACULTY(ID VARCHAR2(50), NAME VARCHAR2(100), FN VARCHAR2(100), RELIGION VARCHAR2(50), NATIONALITY VARCHAR2(50), ADDRESS VARCHAR2(200), MOBILE VARCHAR2(20), CITY VARCHAR2(20), GENDER VARCHAR2(10), SALARY VARCHAR2(20), DOB VARCHAR2(20), JOINDATE VARCHAR2(20), QUALI VARCHAR2(30), DESI VARCHAR2(30))";
      				preparedStmt = conn.prepareStatement(query3);
      				preparedStmt.execute();
				String query4 = "CREATE TABLE  FEES (ID VARCHAR2(50), NAME VARCHAR2(100), CLASS2 VARCHAR2(10),DT VARCHAR2(20), LATE_FEE VARCHAR2(20), AMOUNT VARCHAR2(20))";
      				preparedStmt = conn.prepareStatement(query4);
      				preparedStmt.execute();
                                String query5 = "CREATE TABLE  PAYROLL(ID VARCHAR2(50), NAME VARCHAR2(100), BSALARY VARCHAR2(50), DESIGNATION VARCHAR2(20), PAYMODE VARCHAR2(20), NET VARCHAR2(50), DATE22 VARCHAR2(20))";
      				preparedStmt = conn.prepareStatement(query5);
      				preparedStmt.execute();
				System.out.println("Create Table Success");

				
				    }
				catch(Exception v) {    }
		}
public static void main(String []args)
	{  new Data();  }
}