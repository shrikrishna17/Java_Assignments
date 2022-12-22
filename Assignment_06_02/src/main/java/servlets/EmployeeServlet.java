package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import dao.EmployeeDao;
import pojos.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		employeeDao = new EmployeeDao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getServletPath();
		try {
			
			switch(action) {
			case"/add":
				addEmployee(request,response);
				break;
			case"/delete":
				deleteEmployee(request,response);
				break;
			case"/update":
				updateEmployee(request,response);
				break;
			default:
				listEmployee(request,response);
				break;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}



	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> listEmployee = employeeDao.allEmployees();
		request.setAttribute("listEmployee", listEmployee);
		RequestDispatcher dispatcher = request.getRequestDispatcher("employeelist.jsp");
		dispatcher.forward(request, response);
	}


	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		employeeDao.deleteEmployee(id);
		response.sendRedirect("employeeList");
		
	}
	

	private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		System.out.println("In servet add");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String qualification=request.getParameter("qualification");
		String experience=request.getParameter("experience");
		String joiningDate=request.getParameter("joiningDate");
		String employmentStatus=request.getParameter("employmentStatus");
		String contractEndDate=request.getParameter("contractEndDate");
		String PFAccountNumber=request.getParameter("PFAccountNumber");
		Employee newEmp = new Employee(name,phone,email,address,qualification,experience,joiningDate,employmentStatus,contractEndDate,PFAccountNumber);
		 employeeDao.addEmployee(newEmp);
		 response.sendRedirect("employeeList");
		
	}
	

	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("empId"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String qualification = request.getParameter("qualification");
        String joiningDate = request.getParameter("joiningDate");
        String experience = request.getParameter("experience");
        String employmentStatus = request.getParameter("employmentStatus");
        String contractEndDate = request.getParameter("contractEnddate");
        String PFAccountNumber = request.getParameter("PFAccountNumber");

        Employee newEmp = new Employee( name, phone, email, address, qualification, joiningDate, experience, employmentStatus, contractEndDate, PFAccountNumber);
        EmployeeDao.updateEmployee(newEmp,id);
        response.sendRedirect("list");
	}

}
