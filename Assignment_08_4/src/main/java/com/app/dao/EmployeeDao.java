package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

	Employee findByEmail(String email);
	
	Employee findById(int id);
	Employee findByName(String name);
	
	@Modifying
	@Query("Update Employee e set e.department=?1,e.experience=?2,e.city=?3,e.doorNumber=?4,e.street=?5,e.pincode=?6 where e.id=?7")
	void update(String department,String experience,String city,String doorNumber,String street,int pincode,int id);
	
	
	@Query(value="Select e from Employee e order by id")
	public List<Employee> findAllNumber();
	
	@Query(value="Select e from Employee e order by experience desc")
	public List<Employee> findAllExperience();
	
}
