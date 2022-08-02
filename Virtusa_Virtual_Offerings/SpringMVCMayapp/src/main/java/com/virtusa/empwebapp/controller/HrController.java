package com.virtusa.empwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HrController {
	
	public HrController() {
		System.out.println("HR Controller Object is Created");
	}
	
	@RequestMapping("/hrwelcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring MVC!!!!!!!";
	}
	
}
