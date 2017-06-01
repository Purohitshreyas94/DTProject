package dao;

import model.*;
import java.sql.*;

//import controller.LoginControl;

public class LoginDb 
{
	Connection conn;
	public LoginDb()throws Exception
	{
		Class.forName("org.h2.Driver");
		conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/MyDatabase","Admin","admin");
	}
	
	public boolean isValid(Login loginobj)throws Exception
	{
		PreparedStatement psmt=conn.prepareStatement("select * from mycustomer where custname=? and password=?");
		
		psmt.setString(1,loginobj.getLogin().trim());
		psmt.setString(2, loginobj.getPassword().trim());
		
		ResultSet rs=psmt.executeQuery();
		
		if(rs.next())
			return true;
		else
			return false;
	}
}
