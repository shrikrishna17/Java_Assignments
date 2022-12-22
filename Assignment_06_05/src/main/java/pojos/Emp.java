package pojos;

public class Emp {


	private String email;
	private String password;
	public Emp() {
		
	}
	public Emp(String email, String password) {
		this.email = email;
		this.password = password;
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
	@Override
	public String toString() {
		return "Emp [email=" + email + ", password=" + password + "]";
	}
	
}
