package com.virtusa.empwebapp.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.virtusa.empwebapp.model.Employee;

@Controller
public class EmployeeController {

	private List<Employee> empList = null;

	public EmployeeController() {
		System.out.println("Employee Controller Object is Created");
		empList = Arrays.asList(new Employee("emp1","emp1","Associate",24,"employee1",1001),
				new Employee("emp2","emp2","Associate",25,"employee2",1002));
	}

	@RequestMapping("/")
	public String appHome() {
		return "index";
	}

	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring MVC";
	}


	@RequestMapping("/date")
	@ResponseBody
	public String getaDate() {
		return "The request made date ana time" + new Date();
	}

	@RequestMapping("/login")
	//@ResponseBody
	public String empLogiHome(@ModelAttribute("emp")Employee emp,Model model) {
		String[] gender = {"Male","Female"};
		model.addAttribute("gender",gender);
		return "login";
	}

	/*@RequestMapping("/validateemp")
	public String validateEmployee(HttpServletRequest request) {
		//	1. Get the values from 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//	2. Validation
		if(username.equals("virtusa") && password.equals("maybatch")) {
			return "emphome";
		}
		return "login";
	}*/

	/*@RequestMapping("/validateemp")
	public String validateEmployee(@RequestParam("username") String username,
								   @RequestParam("password") String password
								   ) {
		//	2. Validation
		if(username.equals("virtusa") && password.equals("maybatch")) {
			return "emphome";
		}
		return "login";
	}*/

	/*@RequestMapping("/validateemp")
	public String validateEmployee(@RequestParam(name="username",defaultValue="virtusa") String username,
								   @RequestParam("password") String password
								   ) {
		//	2. Validation
		if(username.equals("virtusa") && password.equals("maybatch")) {
			return "emphome";
		}
		return "login";
	}*/

	@RequestMapping(path="/validateemp",method= RequestMethod.POST)
	public String validateEmployeeGet(@Valid @ModelAttribute ("emp") Employee employee,HttpSession session,Errors errors) {
		System.out.println("Emp post method is called" + employee);
		System.out.println(errors.getErrorCount());
		if(errors.hasErrors()) {
			System.out.println("Error check in");
			return "login";
		} else {
			System.out.println("DB logic");
			for(Employee emp : empList) {
				if(emp.getUsername().equals(employee.getUsername()) && 
						emp.getPassword().equals(employee.getPassword())
						) {
					session.setAttribute("username", employee.getUsername());
					return "emphome";
				}
			}
		}
		return "login";
	}

	/*@RequestMapping(path="/validateemp",method=RequestMethod.GET)
	public String validateEmployeeGet(@Valid @ModelAttribute ("emp") Employee employee,HttpSession session,Errors errors) {
		System.out.println("Employee Get method is called "+ employee);
		if(employee.getUsername().equals("virtusa") && employee.getPassword().equals("maybatch")) {
			session.setAttribute("username", employee.getUsername());
			return "emphome";
		}
		return "login";
	}*/

	@RequestMapping(path="/profile/{ename}")
	public String empProfile(@PathVariable("ename") String username,Model model) {
		for(Employee emp : empList) {
			if(emp.getUsername().equals(username)) {
				model.addAttribute("employee",emp);
				model.addAttribute("message","Test Message");
			}
		}
		return "emphome";
	}

	@RequestMapping(path="/getAllemp")
	public String getAllEmployee(Model model) {
		model.addAttribute("empList",empList);
		return "emphome";
	}

	/*@RequestMapping(path="/profile/{ename}")
	public String empProfile(@PathVariable("ename") String username,ModelAndViewContainer model) {
		for(Employee emp : empList) {
			if(emp.getUsername().equals(username)) {
				model.addObject("employee",emp);
				model.setView("emphome");
			}
		}
		return "emphome";
	}*/

	/*@RequestMapping(path="/profile/{ename}")
	public ModelAndViewContainer empProfile(@PathVariable("ename") String username,ModelAndViewContainer model) {
		for(Employee emp : empList) {
			if(emp.getUsername().equals(username)) {
				model.addObject("employee",emp);
				model.setViewName("emphome");
			}
		}
		return model;
	}*/
}
