package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	
	
		private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		private static final String DB_URL = "jdbc:sqlserver://CHN71DT803:1433;databaseName=assign7;encrypt=true;trustServerCertificate=true";
		private static final String DB_USER = "sa";
		private static final String DB_PASSWORD = "Password1!";

		static {
			try {
				Class.forName(DB_DRIVER);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection() throws Exception {
			return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		}
	
}

