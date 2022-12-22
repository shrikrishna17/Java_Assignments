package com.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.utils.DBUtils.fetchConnection;

import com.pojos.Employee1;
import com.pojos.HR;


public class HRDaoImpl2 implements IHRDao2{

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3,pst4,pst5;
	
	public HRDaoImpl2() throws ClassNotFoundException, SQLException {
		cn = fetchConnection();
		pst1 = cn.prepareStatement("select *from HR where loginID=? and password=?");
		pst2 = cn.prepareStatement("select *from Employee1 where empId=?");
		pst3 = cn.prepareStatement("insert into Employee1 values(?,?,?,?,?,?,?,?,?,?)");
	//	name,phone,email,address,qualification,experience,joiningDate,status,endDate,PFAccountNumber
	//	pst4 = cn.prepareStatement("insert into ContractEmployee values(?)");
		pst5 = cn.prepareStatement("update Employee1 set employmentStatus='Resigned' where empId=?");
	}
	@Override
	public HR authenticateHR(String loginId, String password) throws SQLException {
		pst1.setString(1, loginId);
		pst1.setString(2,password);
		try(ResultSet rst = pst1.executeQuery()){
			if(rst.next())
				return new HR(rst.getString(1),rst.getString(2));
		}
		return null;
	}
	
	public void cleanUp() throws SQLException {
		if(pst1 != null)
			pst1.close();
		if(pst2 != null)
			pst2.close();
		if(pst3 != null)
			pst3.close();
		if(pst4 != null)
			pst4.close();
		if(pst5 != null)
			pst5.close();
	}
	
	@Override
	public Employee1 findEmployee(int id) throws SQLException {
		
		pst2.setInt(1, id);
	//	pst2.execute();
		ResultSet rst = pst2.executeQuery();
		ResultSetMetaData rsmd = rst.getMetaData();
		
		int columnNumber = rsmd.getColumnCount();
	
			while(rst.next())
				   for (int i = 1; i <= columnNumber; i++) {
			           if (i > 1) System.out.print(", ");
			           String columnValue = rst.getString(i);
			           System.out.print( rsmd.getColumnName(i)+":" +columnValue );
			       }
		

		return null;
	}

	@Override
	public Employee1 addEmployeeContract(Employee1 newEmp) throws SQLException, IOException {
		
		pst3.setString(1, newEmp.getName());
		pst3.setString(2, newEmp.getPhone());
		pst3.setString(3, newEmp.getEmail());
		pst3.setString(4, newEmp.getAddress());
		pst3.setString(5, newEmp.getQualification());
		pst3.setString(6, newEmp.getExperience());
		pst3.setString(7, newEmp.getJoiningDate());
		pst3.setString(8, newEmp.getEmploymentStatus());
		pst3.setString(9, newEmp.getContractEnddate());
		pst3.setString(10, newEmp.getPFAccountNumber());
	
	//	name,phone,email,address,qualification,experience,joiningDate,status,endDate,PFAccountNumber
//		int count = pst3.executeUpdate();
//		if(count == 1)
//			return "Employee addedd";
//		
//		return "Employee add failed";
		String filepath = "C:\\Users\\shrikrishna.k\\Documents\\Z_Training\\JAVA\\Eclipse\\Assignment_04_01/Contract.txt";
		FileWriter write = new FileWriter(filepath,true);
		try (ResultSet rst = pst3.executeQuery()){
			while(rst.next()) {
				write.write(rst.toString());
			}
				
		}
		write.close();
		return newEmp;
		
	}
//	@Override
//	public String addOnRoleEmployee(String name, int phone, String email, String address, String qualification,
//			String experience, String joinDate, String status, int PFAccountNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
	@Override
	public String addEmployeeOnRole(Employee1 newEmp) throws SQLException {
		
		pst3.setString(1, newEmp.getName());
		pst3.setString(2, newEmp.getPhone());
		pst3.setString(3, newEmp.getEmail());
		pst3.setString(4, newEmp.getAddress());
		pst3.setString(5, newEmp.getQualification());
		pst3.setString(6, newEmp.getExperience());
		pst3.setString(7, newEmp.getJoiningDate());
		pst3.setString(8, newEmp.getEmploymentStatus());
		pst3.setString(9, newEmp.getContractEnddate());
		pst3.setString(10, newEmp.getPFAccountNumber());
	
	//	name,phone,email,address,qualification,experience,joiningDate,status,endDate,PFAccountNumber
		int count = pst3.executeUpdate();
		if(count == 1)
			return "Employee addedd";
		
		return "Employee add failed";
	}
	@Override
	public String deleteEmployee(int empID) throws SQLException {
		pst5.setInt(1, empID);
		int updateCount = pst5.executeUpdate();
		if(updateCount == 1)
			return "Employee Resigned";
		return "Resignation failed";
	}
	
	
}
