package com.dao;

import java.io.IOException;
import java.sql.SQLException;


import com.pojos.Employee1;
import com.pojos.HR;

public interface IHRDao {
	HR authenticateHR(String loginId,String password) throws ClassNotFoundException, SQLException;
	Employee1 findEmployee(int id) throws SQLException;
//	String addContractEmployee(ContractEmployee contract) throws SQLException;
//	String addOnRoleEmployee(String name,int phone,String email,String address,String qualification,String experience,String joinDate,String status,int PFAccountNumber);
	
	String addEmployeeContract(Employee1 newEmp) throws SQLException, IOException;
	String addEmployeeOnRole(Employee1 newEmp) throws SQLException, IOException;
	String deleteEmployee(int empID) throws SQLException;
	String updateEmployee(int empId,String value) throws SQLException;
}
