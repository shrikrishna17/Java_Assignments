package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Employee;

public class EmployeeDao {

	private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DB_URL = "jdbc:sqlserver://CHN3YWTXJ2:1433;databaseName=hr;encrypt=true;trustServerCertificate=true";
	private static final String DB_USER = "sa";
	private static final String DB_PASSWORD = "Password1!";
	
	private static final String s1 = "select *from Employee";
	private static final String s2 = "delete from Employee where empId=?";
	private static final String s3 = "insert into Employee (name,phone,email,address,qualification,experience,joiningDate,employmentStatus,contractEndDate,PFAccountNumber)values(?,?,?,?,?,?,?,?,?,?)";
	private static final String s4 = "update Employee set name=?,phone=?,email=?,address=?,qualification=?,experience=?,joiningDate=?,employmentStatus=?,contractEndDate=?,PFAccountNumber=? where empId=?";
	
	public EmployeeDao() {}
	
	protected Connection getConnection() {
		Connection cn=null;
		try {
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
	
	public void addEmployee(Employee emp) throws SQLException {
		System.out.println("In Dao add");
		try(Connection cn = getConnection();
				PreparedStatement pst1 = cn.prepareStatement(s3)){
			pst1.setString(1, emp.getName());
			pst1.setString(2, emp.getPhone());
			pst1.setString(3, emp.getEmail());
			pst1.setString(4, emp.getAddress());
			pst1.setString(5, emp.getQualification());
			pst1.setString(6, emp.getExperience());
			pst1.setString(7, emp.getJoiningDate());
			pst1.setString(8, emp.getEmploymentStatus());
			pst1.setString(9, emp.getContractEndDate());
			pst1.setString(10, emp.getPFAccountNumber());
			pst1.executeUpdate();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public List<Employee> allEmployees(){
		List<Employee> l1=new ArrayList<>();
		try(Connection cn = getConnection();
				PreparedStatement pst2 = cn.prepareStatement(s1)){
				ResultSet rst = pst2.executeQuery();
				
				while(rst.next()) {
					Employee emp = new Employee();
					emp.setEmpId(rst.getInt(1));
					emp.setName(rst.getString(2));
					emp.setPhone(rst.getString(3));
					emp.setEmail(rst.getString(4));
					emp.setAddress(rst.getString(5));
					emp.setQualification(rst.getString(6));
					emp.setExperience(rst.getString(7));
					emp.setJoiningDate(rst.getString(8));
					emp.setEmploymentStatus(rst.getString(9));
					emp.setContractEndDate(rst.getString(10));
					emp.setPFAccountNumber(rst.getString(11));
					
					l1.add(emp);
					System.out.println(l1);
				}
		}catch (Exception e){
			e.printStackTrace();
		}
		return l1;
	}
	
	public boolean deleteEmployee(int id) throws SQLException {
		boolean delete;
		try(Connection cn = getConnection();
				PreparedStatement pst3 = cn.prepareStatement(s2)){
			pst3.setInt(1,id);
			delete = pst3.executeUpdate()>0;
		}
		return delete;
	}
	
	public boolean updateEmployee(Employee emp,int id) throws SQLException {
		boolean update;
		
		System.out.println("In update dao before try");
		try(Connection cn = getConnection();
				PreparedStatement pst4 = cn.prepareStatement(s4)){
			System.out.println("In update dao after try");
			pst4.setString(1, emp.getName());
			pst4.setString(2, emp.getPhone());
			pst4.setString(3, emp.getEmail());
			pst4.setString(4, emp.getAddress());
			pst4.setString(5, emp.getQualification());
			pst4.setString(6, emp.getExperience());
			pst4.setString(7, emp.getJoiningDate());
			pst4.setString(8, emp.getEmploymentStatus());
			pst4.setString(9, emp.getContractEndDate());
			pst4.setString(10, emp.getPFAccountNumber());
			pst4.setInt(11,id);
			
			update = pst4.executeUpdate()>0;
			System.out.println(update);
		}
		System.out.println("Updated");
		return update;
	}
	
}
