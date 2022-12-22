package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection cn;
	public static Connection fetchConnection() throws SQLException, ClassNotFoundException{
		
		if(cn == null) {
			//String url = "jdbc:sqlserver://localhost\\CHN71DT803;databaseName=Trade;user=VSCONNECT\\shrikrishna.k;password=Welcome4321";
			//String url = "jdbc:sqlserver://localhost\\sqlexpress;databaseName=Trade;user=krishna;password=Sunbeam#56554";
			// String url = "Data Source = CHN71DT803; Initial Catalog = Trade; Integrated Security = True";
			// String url = "jdbc:sqlserver://CHN71DT803;databaseName=Trade;integratedSecurity=true";
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://CHN71DT803:1433;databaseName=HR;encrypt=true;trustServerCertificate=true";
    		String user = "sa";
			String password = "Password1!";
			
			
			
			cn = DriverManager.getConnection(url,user,password);
		}
		return cn;
	}
}
