package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.Emp;
import utils.DBUtils;

public class LoginDaoImpl implements AutoCloseable {
	private Connection cn;

	public LoginDaoImpl() throws Exception {
		cn = DBUtils.getConnection();
	}

	public Emp authenticate(String email, String password) throws SQLException {
		System.out.println("befor sql");
		
		try (PreparedStatement pst1 = cn.prepareStatement("select *from Emp where email=? and password=?")) {
			pst1.setString(1, email);
			pst1.setString(2, password);
			

			try (ResultSet rst = pst1.executeQuery()) {
				System.out.println("in resultSet");
				if (rst.next()) {
					
					Emp user = new Emp();
					user.setEmail(rst.getString("email"));
					user.setPassword(rst.getString("password"));
					System.out.println(user);
					return user;
				}
//				return new HR(rst.getString(1),rst.getString(2));
//			System.out.println(rst);
//		System.out.println("result");
			}
		}
		return null;

	}
	@Override
	public void close() {
		try {
			if (cn != null)
				cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
