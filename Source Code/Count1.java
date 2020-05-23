import java.sql.*;
import java.io.*;
import java.util.*;

class Count1
{ 
	
	 Connection con;
	 Statement stm;
	 ResultSet rs;
	int rowCount,rowCount2,rowCount3,rowCount4;
	String user="system";
	String pass="system";
	ArrayList l1 = new ArrayList();
	ArrayList l2 = new ArrayList();
	ArrayList l3 = new ArrayList();
	ArrayList l4 = new ArrayList();
	ArrayList l5 = new ArrayList();

	public  int call() 
	{
			
		
			try{
			
	
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
		            	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				stm= con.createStatement(); 
				rs= stm.executeQuery("SELECT id  FROM admission ");	
			
				while(rs.next()){   
				l1.add(rs.getString(1));
				}      
				con.close();	
				
			}

			

			
		catch(Exception e){ } 
		return l1.size();
	}
	

	public  int call2() 
	{
			
		
			try{
			
	
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
		            	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				stm= con.createStatement(); 
				rs= stm.executeQuery("SELECT id  FROM faculty ");	
			
				while(rs.next()){   
				l2.add(rs.getString(1));
				}      
				con.close();	
				
			}

			

			
		catch(Exception e){ } 
		return l2.size();
	}
	

	public  int call3() 
	{
			
		
			try{
			
	
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
		            	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				stm= con.createStatement(); 
				rs= stm.executeQuery("SELECT id  FROM fees ");	
			
				while(rs.next()){   
				l3.add(rs.getString(1));
				}      
				con.close();	
				
			}

			

			
		catch(Exception e){ } 
		return l3.size();
	}
        
        
	public  int call4() 
	{
			
		
			try{
			
	
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
		            	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				stm= con.createStatement(); 
				rs= stm.executeQuery("SELECT id  FROM payroll ");	
			
				while(rs.next()){   
				l4.add(rs.getString(1));
				}      
				con.close();	
				
			}

			

			
		catch(Exception e){ } 
		return l4.size();
	}

	/*public  int call5() 
	{
			
		
			try{
			
	
			 	Class.forName("oracle.jdbc.driver.OracleDriver");
		            	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",user,pass);
				stm= con.createStatement(); 
				rs= stm.executeQuery("SELECT id1  FROM vsalary ");	
			
				while(rs.next()){   
				l5.add(rs.getString(1));
				}      
				con.close();	
				
			}

			

			
		catch(Exception e){ } 
		return l5.size();
	}*/

public static void main(String []args) throws Exception
	{
		Count1 d=new Count1();	
	}
}	





















