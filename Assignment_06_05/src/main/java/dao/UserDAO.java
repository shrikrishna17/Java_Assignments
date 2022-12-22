package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.User;
import utils.DBUtils;

public class UserDAO {
//    private String jdbcURL = "jdbc:sqlserver://CHNCKQYBZ2:1433;databaseName=assignment7;encrypt=true;trustServerCertificate=true\"";
//    private String jdbcUsername = "sa";
//    private String jdbcPassword = "Password1!";
    
    private Connection cn;
    
    public UserDAO () throws Exception {
    	cn = DBUtils.getConnection();
		System.out.println("Employee dao after cn");
    }

    private static final String INSERT_USERS_SQL = "INSERT INTO Employee" + "  (name, phone, email, address, qualification, experience,joiningDate,  employmentStatus, contractEndDate, PFAccountNumber) VALUES " +
        " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select empId,name,phone,email,address,qualification,experience,joiningDate,employmentStatus,contractEndDate,PFAccountNumber from Employee where empId =?";
    private static final String SELECT_ALL_USERS = "select * from Employee";
    private static final String DELETE_USERS_SQL = "delete from Employee where empId = ?;";
    private static final String UPDATE_USERS_SQL = "update Employee set name = ?,phone = ?, email = ?, address = ?, qualification = ?,experience = ?, joiningDate = ?,  employmentStatus = ?, contractEndDate = ?, PFAccountNumber = ? where empId = ?;";

    
    public List < User > searchUsers(String query) {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < User > users = new ArrayList < > ();
            if(query!=null) {
            	try (PreparedStatement preparedStatement = cn.prepareStatement("select * from Employee where name like ? or email like ? or employmentStatus like ?");)
            	{
//            		  
            		preparedStatement.setString(1, "%" + query + "%");
            		preparedStatement.setString(2, "%" + query + "%");
            		preparedStatement.setString(3, "%" + query + "%");

            		System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    ResultSet rs = preparedStatement.executeQuery();
            		while (rs.next()) {
            		    int id = rs.getInt("empId");
            		    String name = rs.getString("name");
            		    String phone = rs.getString("phone");
            		    String email = rs.getString("email");
            		    String address = rs.getString("address");
            		    String qualification = rs.getString("qualification");
            		    String experience = rs.getString("experience");
            		    String joiningDate = rs.getString("joiningDate");
            		   
            		    String employmentStatus = rs.getString("employmentStatus");
            		    String contractEndDate = rs.getString("contractEndDate");
            		    String PFAccountNumber = rs.getString("PFAccountNumber");
            		    users.add(new User(id, name, phone,email,address,qualification,joiningDate,experience,employmentStatus,contractEndDate,PFAccountNumber));
            		}
            		} catch (SQLException e) {
            		printSQLException(e);
            	}
            
            }else {
            	try (PreparedStatement preparedStatement = cn.prepareStatement("select * from Employee");)
            	{
            		System.out.println(preparedStatement);
                    // Step 3: Execute the query or update query
                    ResultSet rs = preparedStatement.executeQuery();
            		while (rs.next()) {
            		    int id = rs.getInt("empId");
            		    String name = rs.getString("name");
            		    String phone = rs.getString("phone");
            		    String email = rs.getString("email");
            		    String address = rs.getString("address");
            		    String qualification = rs.getString("qualification");
            		    String experience = rs.getString("experience");
            		    String joiningDate = rs.getString("joiningDate");
            		   
            		    String employmentStatus = rs.getString("employmentStatus");
            		    String contractEndDate = rs.getString("contractEndDate");
            		    String PFAccountNumber = rs.getString("PFAccountNumber");
            		    users.add(new User(id, name, phone,email,address,qualification,joiningDate,experience,employmentStatus,contractEndDate,PFAccountNumber));
            		}
            		} catch (SQLException e) {
            		printSQLException(e);
            	}
            }
           
        return users;
    }


    public void insertUser(User user) throws SQLException {
    	
        System.out.println(INSERT_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (
        PreparedStatement preparedStatement = cn.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.setString(5, user.getQualification());
            preparedStatement.setString(7, user.getExperience());
            preparedStatement.setString(6, user.getJoiningDate());
           
            preparedStatement.setString(8, user.getEmploymentStatus());
            preparedStatement.setString(9, user.getContractEndDate());
            preparedStatement.setString(10, user.getPFAccountNumber());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public User selectUser(int empId) {
        User user = null;
        // Step 1: Establishing a Connection
        try (
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = cn.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, empId);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
            	int id = rs.getInt("empId");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String qualification = rs.getString("qualification");
                String experience = rs.getString("experience");
                String joiningDate = rs.getString("joiningDate");
                
                String employmentStatus = rs.getString("employmentStatus");
                String contractEnddate = rs.getString("contractEndDate");
                String PFAccountNumber = rs.getString("PFAccountNumber");
                user = new User(id, name, phone,email,address,qualification,joiningDate,experience,employmentStatus,contractEnddate,PFAccountNumber);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }

    public List < User > selectAllUsers() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < User > users = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = cn.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("empId");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String qualification = rs.getString("qualification");
                String experience = rs.getString("experience");
                String joiningDate = rs.getString("joiningDate");
               
                String employmentStatus = rs.getString("employmentStatus");
                String contractEndDate = rs.getString("contractEndDate");
                String PFAccountNumber = rs.getString("PFAccountNumber");
                users.add(new User(id, name, phone,email,address,qualification,joiningDate,experience,employmentStatus,contractEndDate,PFAccountNumber));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    
    
    public boolean deleteUser(int id) throws SQLException {
        boolean DeleteEmployee;
        try (PreparedStatement statement = cn.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            DeleteEmployee = statement.executeUpdate() > 0;
        }
        return DeleteEmployee;
    }

    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (PreparedStatement statement = cn.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getPhone());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getAddress());
            statement.setString(5, user.getQualification());
            statement.setString(7, user.getExperience());
            statement.setString(6, user.getJoiningDate());
           
            statement.setString(8, user.getEmploymentStatus());
            statement.setString(9, user.getContractEndDate());
            statement.setString(10, user.getPFAccountNumber());
            statement.setInt(11, user.getEmpId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}