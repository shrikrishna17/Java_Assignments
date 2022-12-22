package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employs")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String password;
	private String name;
	private String department;
	private String experience; 
	private String doorNumber;
	private String street;
	private String city;
	private int pincode;
	public Employee() {
		super();
	}
	public Employee(int id, String email, String password, String name, String department, String experience,
			String doorNumber, String street, String city, int pincode) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.department = department;
		this.experience = experience;
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getExperience() {
		return experience;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
