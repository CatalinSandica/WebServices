package com.sandica.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

	 @SuppressWarnings("finally")
	public int getUserCount() { 
			int numusers = 0;
			String dbUrl = "jdbc:mysql://localhost/autoturismedb";
			String dbClass = "com.mysql.jdbc.Driver";
			String query = "Select count(*) FROM clienti";
			String userName = "catalin.sandica", password = "admin";
			try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection (dbUrl, userName, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				numusers = rs.getInt(1);
				} //end while
				con.close();
			} //end try

			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}

			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {	
				return numusers;
			}

		}
}
