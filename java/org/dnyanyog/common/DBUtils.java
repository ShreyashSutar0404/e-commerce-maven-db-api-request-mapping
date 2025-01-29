package org.dnyanyog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
		
		private static String url ="jdbc:mysql://localhost:3306/school_management";
		private static String username ="root";
		private static String password ="S@ngl!#10@";
		
		private static Connection connection;
		
		static 
		{
			try
			{
				connection=DriverManager.getConnection(url, username, password);
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		public static ResultSet executeSelectQuery(String query) throws SQLException
		{
			Statement statement=connection.createStatement();
			
			ResultSet rs=statement.executeQuery(query);
			
			return rs;
		}
	}


