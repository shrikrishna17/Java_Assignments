package app.tester;

import java.sql.Connection;
import static app.utils.DBUtils.fetchConnection;

public class TestDBUtils {
	public static void main(String[] args) {
		
		
		try(Connection cn = fetchConnection())
		{
			Connection cn1=fetchConnection();
			System.out.println("Connection to db"+cn1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
