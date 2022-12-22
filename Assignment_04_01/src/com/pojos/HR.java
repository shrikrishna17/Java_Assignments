package com.pojos;

public class HR {

	private String logInId;
	private String password;
	public HR() {
		super();
	}
	public HR(String logInId, String password) {
		super();
		this.logInId = logInId;
		this.password = password;
	}
	public String getLogInId() {
		return logInId;
	}
	public void setLogInId(String logInId) {
		this.logInId = logInId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [logInId=" + logInId + ", password=" + password + "]";
	}
	
}
