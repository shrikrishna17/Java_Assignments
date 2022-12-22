package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entities.Credentials;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

//	@RequestMapping({"/","/index"})
//	public String index() {
//		return "index";
//	}

	// Model: An entity represents a single instance of your
	// domain object saved into the database as a record.
	@RequestMapping({"/","/login"})
	public String login(Model model) {
		Credentials cred = new Credentials("email", "password");
		model.addAttribute("command", cred);
		return "login";
	}

	@RequestMapping("/validate")
	public String validate(@Valid @ModelAttribute("command") Credentials cred,BindingResult br,HttpSession session) {
		if(br.hasErrors()) {
			System.out.println(br);
			return "login";
		}
		Employee employee = employeeService.validateEmployee(cred.getEmail(), cred.getPassword());
		if(employee == null)
			return "failed";
		session.setAttribute("employee", employee);
		return "redirect:listemployee";
	}
	
	@RequestMapping("/listemployee")
	public String ListEmployee(Model model) {
		List<Employee> employeeList = employeeService.findAllEmployee();
		model.addAttribute("employeeList",employeeList);
		return "listemployee";
	}
	
	@RequestMapping("/details")
	public String details(@RequestParam("id") int id,Model model) {
		System.out.println(id);
		employeeService.findById(id);
		Employee employee = employeeService.findById(id);
		System.out.println(employee);
		model.addAttribute("Employee",employee);
		return "details";
	}
	@RequestMapping("/add")
	public String addNewEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("Employee",employee);
		return "add";
	}
	
	@RequestMapping("/addemployee")
	public String addNewEmployee(Employee employee,BindingResult br) {
		employeeService.addEmployee(employee);
		return "redirect:listemployee";
	}
	
	@RequestMapping("/update")
	public String Update(@RequestParam("id") int id,Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("Employee",employee);
		return "update";
	}
	
	@RequestMapping("/updateemployee")
	public String update(@RequestParam("department") String department, @RequestParam("experience") String experience,@RequestParam("city")String city,@RequestParam("doorNumber")String doorNumber,@RequestParam("street")String street,@RequestParam("pincode")int pincode,@RequestParam("id") int id){
		employeeService.update(department,experience,city,doorNumber,street,pincode,id);
		return "redirect:listemployee";
	}
	@RequestMapping("/detailsname")
	public String detailsname(@RequestParam("name") String name,Model model) {
		employeeService.findByName(name);
		Employee employee = employeeService.findByName(name);
		model.addAttribute("Employee",employee);
		return "detailsname";
	}
	@RequestMapping("/numbersort")
	public String NumberSort(Model model) {
		List<Employee> listNumber = employeeService.findAllEmployee();
		model.addAttribute("listNumber",listNumber);
		System.out.println(listNumber);
		return "numbersort";
	}
	@RequestMapping("/experiencesort")
	public String ExperienceSort(Model model) {
		List<Employee> listExperience = employeeService.findAllByExperience();
		model.addAttribute("listExperience",listExperience);
		return "experiencesort";
	}
	
	@RequestMapping("/logout")
	public String  logout()
	{
		return "logout";
	}
}
