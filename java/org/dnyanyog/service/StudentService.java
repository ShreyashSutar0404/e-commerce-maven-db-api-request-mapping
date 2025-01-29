package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;

public class StudentService {
	public String getFirstName(int roll_no)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select first_name from student where roll_no ="+roll_no+"");
			rs.next();
			return "First Name: "+rs.getString("first_name");
		}
		catch(SQLException e)
		{
			return "Some error occured..!"+ e.getMessage();
		}
	}
	
	public String getLastName(int roll_no)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select last_name from student where roll_no ="+roll_no+"");
			rs.next();
			return "Last Name: "+rs.getString("last_name");
		}
		catch(SQLException e)
		{
			return "Some error occured..!";
		}
	}
	
	public String getEmail(int roll_no)
	{
		try
		{
			ResultSet rs= DBUtils.executeSelectQuery("select email_id from student where roll_no ="+roll_no+"");
			rs.next();
			return "Email Id: "+rs.getString("email_id");
		}
		catch(SQLException e)
		{
			return "Some error occured..!";
		}
	}

}
