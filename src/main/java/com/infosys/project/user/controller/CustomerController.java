package com.infosys.project.user.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.project.user.dto.AddressDTO;
import com.infosys.project.user.dto.LoginDTO;
import com.infosys.project.user.dto.LoginDTO1;
import com.infosys.project.user.dto.RegisterDTO;
import com.infosys.project.user.service.CustomerService;

@RestController
@RequestMapping(value="/hotel")
public class CustomerController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public  CustomerController() {
		System.out.println("controller ");
	}
	
	@Autowired
	CustomerService customerService;
	
	// Login

	@PostMapping(value = "/loginbymail")
	public String loginbymail(@RequestBody LoginDTO loginDTO) throws Exception {
	logger.info("Login request for customer {} with password {}", loginDTO.getEmail(),loginDTO.getPassword());
	try {
	customerService.loginbymail(loginDTO);
	return "Login succesful!";
	}
	catch(Exception e) {
		return e.getMessage();
		}	
	
}
		
	@PostMapping(value = "/loginbyphonenumber")
	public String loginbyphonenumber(@RequestBody LoginDTO1 loginDTO) throws Exception {
			
	logger.info("Login request for customer {} with password {}", loginDTO.getPhonenumber(),loginDTO.getPassword());
	try {
	customerService.loginbyphonenumber(loginDTO);
	return "Login succesful!";
	}
	catch(Exception e) {
		return e.getMessage();
		}				
			
		}
			
			@PostMapping(value="/register",  consumes = MediaType.APPLICATION_JSON_VALUE)
			public String registerUser(@RequestBody RegisterDTO registerDTO) {
				try {
				logger.info("Registration request for user {}", registerDTO);
				System.out.println("before ser");
				String e=customerService.registerCustomer(registerDTO);
				System.out.println("after ser");
				return e;
			}catch(Exception e) {
				return("Not sucessful");
			}
			}
			
		@GetMapping(value="/view/{customerid}",  consumes = MediaType.APPLICATION_JSON_VALUE)
			public RegisterDTO view(@PathVariable Integer customerid) {

				logger.info("Registration request for user {}", customerid);
				System.out.println("before ser");
				RegisterDTO e=customerService.view(customerid);
				System.out.println("after ser");
				return e;
			}
			
			
			
		
}
