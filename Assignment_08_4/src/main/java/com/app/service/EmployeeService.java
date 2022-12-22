package com.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.entities.Employee;

@Transactional
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public EmployeeService(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public Employee validateEmployee(String email,String password) {
		Employee employee = employeeDao.findByEmail(email);
		String rawPassword = password;
		if(employee != null && passwordEncoder.matches(rawPassword,employee.getPassword())) {
		System.out.println(employee);
			return employee;
			
		}
		return null;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> employee = employeeDao.findAll();
		return employee;
	}

	public Employee findById(int id) {
		return employeeDao.findById(id);
	}
	
	public Employee addEmployee(Employee employee) {
		String rawPassword = employee.getPassword();
		String encPassword = passwordEncoder.encode(rawPassword);
		employee.setPassword(encPassword);
		return employeeDao.save(employee);
	}

	public void update(String department,String experience,String city,String doorNumber,String street,int pincode,int id) {
		employeeDao.update(department,experience,city,doorNumber,street,pincode,id);
	}
	
	public Employee findByName(String name) {
		return employeeDao.findByName(name);
	}
	
	public List<Employee> findAllByNumber() {
		List<Employee> employee = employeeDao.findAllNumber();
		return employee;
	}
	
	public List<Employee> findAllByExperience() {
		List<Employee> employee = employeeDao.findAllExperience();
		return employee;
	}
}
