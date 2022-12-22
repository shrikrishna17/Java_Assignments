package app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;
	
	public static Connection fetchConnection() throws SQLException {
		if(cn==null) {
//			String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;user=VSCONNECT\\shrikrishna.k;password=Welcome4321";
//			// cn = DriverManager.getConnection(dbURL);
			
			//String url = "jdbc:sqlserver://localhost\\sqlexpress";
//			String url = "@server=CHN71DT803;initial_catalog=Assignment2;integrated security=true";
//			cn = DriverManager.getConnection(url);
			 
			 String connection = "Data Source = CHN71DT803; Initial Catalog = Trade; Integrated Security = True";
			//string connection = @"Data Source=.;database=Assignment2_csharp_q2;Integrated Security=SSPI";
			Connection cn = DriverManager.getConnection(connection);
		}
		
		return cn;
	}
}
