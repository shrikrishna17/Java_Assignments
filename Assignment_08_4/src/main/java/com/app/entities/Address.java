//package com.app.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="address")
//public class Address {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String doorNumber;
//	private String street;
//	private String city;
//	private int pincode;
//	public Address() {
//		super();
//	}
//	public Address(int id, String doorNumber, String street, String city, int pincode) {
//		super();
//		this.id = id;
//		this.doorNumber = doorNumber;
//		this.street = street;
//		this.city = city;
//		this.pincode = pincode;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getDoorNumber() {
//		return doorNumber;
//	}
//	public String getStreet() {
//		return street;
//	}
//	public String getCity() {
//		return city;
//	}
//	public int getPincode() {
//		return pincode;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setDoorNumber(String doorNumber) {
//		this.doorNumber = doorNumber;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//	@Override
//	public String toString() {
//		return "Address [id=" + id + ", doorNumber=" + doorNumber + ", street=" + street + ", city=" + city
//				+ ", pincode=" + pincode + "]";
//	}
//	
//}
