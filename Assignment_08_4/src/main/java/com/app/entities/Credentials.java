package com.app.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Credentials {
	@Email
	@NotBlank(message="Email id mandatory")
	private String email;
	@Size(min=3, max=10)
	@NotBlank(message="Password id mandatory")
	private String password;
	@Override
	public String toString() {
		return "Credentials [email=" + email + ", password=" + password + "]";
	}
	public Credentials(String email, String password) {
	
		this.email = email;
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Credentials() {
		
	}

}
