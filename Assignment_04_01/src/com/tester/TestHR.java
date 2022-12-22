package com.tester;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.HRDaoImpl;
import com.pojos.Employee1;
import com.pojos.HR;

public class TestHR {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a LoginId");
		String loginId=sc.next();
		System.out.println("Enter a password");
		String password = sc.next();
		HRDaoImpl dao = new HRDaoImpl();
		
		HR hr = dao.authenticateHR(loginId, password);
		System.out.println(hr);
		boolean exit = false;
		if(hr !=null) {
			
			while(!exit) {
				System.out.println("Enter a choice");
				System.out.println("1.Add a Employee"
				+"\n2.Find a Employee"+"\n3.Edit Employee Details"
						+"\n4.Delete Employee Record"+"\n10.Exit");
				
				switch(sc.nextInt()) {
				case 1:
					System.out.println("1.Add Contract Employee\n2.Add On Role Employee");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter Employee Name");
						String name = sc.next();
						System.out.println("Enter Employee Phone");
						String phone = sc.next();
						System.out.println("Enter Employee Email");
						String email = sc.next();
						System.out.println("Enter Employee Address");
						String address = sc.next();
						System.out.println("Enter Employee Qualification");
						String qualification = sc.next();
						System.out.println("Enter Employee Experience");
						String experience = sc.next();
						System.out.println("Enter Employee joining date");
						String joiningDate = sc.next();
						String status = "Contract Employee";
						System.out.println("Enter Employee Contract End Date");
						String endDate = sc.next();
						String PFAccountNumber = null;
						dao.addEmployeeContract(new Employee1(name,phone,email,address,qualification,experience,joiningDate,status,endDate,PFAccountNumber));
						break;
					case 2:
						System.out.println("Enter Employee Name");
						String name1 = sc.next();
						System.out.println("Enter Employee Phone");
						String phone1 = sc.next();
						System.out.println("Enter Employee Email");
						String email1 = sc.next();
						System.out.println("Enter Employee Address");
						String address1 = sc.next();
						System.out.println("Enter Employee Qualification");
						String qualification1 = sc.next();
						System.out.println("Enter Employee Experience");
						String experience1 = sc.next();
						System.out.println("Enter Employee joining date");
						String joiningDate1 = sc.next();
						String status1 = "On Role Employee";
						String endDate1 = null;
						System.out.println("Enter Employee PF Number");
						String PFAccountNumber1 = sc.next();
						dao.addEmployeeOnRole(new Employee1(name1,phone1,email1,address1,qualification1,experience1,joiningDate1,status1,endDate1,PFAccountNumber1));
						break;
					}
					break;
				case 2:
					System.out.println("Enter Employee ID");
					int employeeId = sc.nextInt();
					dao.findEmployee(employeeId);
					System.out.println();
					break;
				case 3:
					
					System.out.println("Enter Employee ID");
					int empid = sc.nextInt();
					System.out.println("Enter field to be edited");
					String field = sc.next();
					System.out.println("Enter Updated Value");
					String value = sc.next();
					System.out.println(dao.updateEmployee(empid,value));;
					break;
				case 4:
					System.out.println("Enter Employee Id to be deleted");
					int empId = sc.nextInt();
					
					System.out.println(dao.deleteEmployee(empId));
					break;
				case 10:
					exit = true;
					break;
				}
			}
		}else {
			System.out.println("Enter Correct credential");
		}
		

	}

}
