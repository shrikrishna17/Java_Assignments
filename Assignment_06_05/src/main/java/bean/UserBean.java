package bean;

import java.sql.SQLException;
import pojos.Emp;

import dao.LoginDaoImpl;

public class UserBean {

	private String email;
	private String password;
	private Emp user;
	public UserBean() {
		
	}
	public UserBean(String email, String password, Emp user) {
		
		this.email = email;
		this.password = password;
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Emp getUser() {
		return user;
	}
	public void setUser(Emp user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserBean [email=" + email + ", password=" + password + ", user=" + user + "]";
	}
	public void validateUser() {
		try(LoginDaoImpl dao = new LoginDaoImpl()){
			this.user = dao.authenticate(this.email, this.password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
