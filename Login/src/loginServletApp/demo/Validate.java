package loginServletApp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate {

	 public static boolean checkUser(String email,String pass) 
	    {
	        boolean st =false;
	        try {

	        	if(email.equals("Gauri")&pass.equals("Gauri@123"))
	        	{
	        		st=true;
	        	}
//	            //loading drivers for mysqleat
//	            Class.forName("com.mysql.jdbc.Driver");
//
//	            //creating connection with the database
//	            Connection con = DriverManager.getConnection("jdbc:mysql:/ /localhost:3306/details","root","manu");
//	            PreparedStatement ps = con.prepareStatement("select * from login where email=? and pass=?");
//	            ps.setString(1, email);
//	            ps.setString(2, pass);
//	            ResultSet rs =ps.executeQuery();
//	            st = rs.next();
//	            System.out.println("\n Result Fetch From Selected  database");
//
//				System.out.println("\nemail id -------- password");
//
//				while (rs.next()) { // getting data from selected databases
//
//					String name = rs.getString(1);
//					String pass1 = rs.getString(2);
//					
//					
//					System.out.println(name + "-------------" + pass1 );
//				}

	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	        return st;                 
	    }   
}
