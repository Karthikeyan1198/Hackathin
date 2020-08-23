package com.infosys.project.user.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.project.user.dto.AddressDTO;
import com.infosys.project.user.dto.LoginDTO;
import com.infosys.project.user.dto.LoginDTO1;
import com.infosys.project.user.dto.RegisterDTO;
import com.infosys.project.user.entity.AddressEntity;
import com.infosys.project.user.entity.CustomerEntity;

import com.infosys.project.user.repository.CustomerRepository;
import com.infosys.project.user.validator.CustomerValidator;

@Service
public class CustomerService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerRepository customerRepo;
	
	
	
	

	
	
	public boolean loginbymail(LoginDTO loginDTO) throws Exception {
		logger.info("Login request for customer {} with password {}", loginDTO.getEmail(), loginDTO.getPassword());
		CustomerValidator.emailid(loginDTO.getEmail());
		try {
		
		
		CustomerEntity customer = customerRepo.findByEmail(loginDTO.getEmail());
		
		if (customer.getPassword().equals(loginDTO.getPassword())){
			return true;
			}else {
				throw new Exception("Invalid password! or User not Signed Up ");}
			}
		
		catch(Exception e) {
			throw e;
		}
		}
			
	
	public boolean loginbyphonenumber(LoginDTO1 loginDTO) throws Exception {
		logger.info("Login request for customer {} with password {}", loginDTO.getPhonenumber(), loginDTO.getPassword());
		CustomerValidator.number(loginDTO.getPhonenumber());
		try {
		
		
		CustomerEntity customer1 = customerRepo.findByphoneNumber(loginDTO.getPhonenumber());
		if (customer1.getPassword().equals(loginDTO.getPassword())) {
			
			return true;
		}else {
			throw new Exception("Invalid password! or User not Signed Up");}
		}
		catch(Exception e) {
		throw e;
	}
	}
		

	public String registerCustomer(RegisterDTO registerDTO) throws Exception {
		
		 {
		logger.info("Registration request for user {}", registerDTO);
		CustomerEntity customer=customerRepo.findByEmail(registerDTO.getEmail());
		CustomerEntity number=customerRepo.findByphoneNumber(registerDTO.getPhoneNumber());
		if(customer==null) {
			if(number==null) {
			CustomerEntity be=registerDTO.createEntity();
			System.out.println("be1");
			System.out.println("before");
			CustomerValidator.number(registerDTO.getPhoneNumber());
			CustomerValidator.emailid(registerDTO.getEmail()); 
			System.out.println("after");
			customerRepo.save(be);
			return("new user new created, with id:"+be.getCustomerid());
		}else {
			return("PhoneNumber already present");
		}
			}
		
		else {
			return("email already present");
		}
		
		
		
		}}

	public RegisterDTO view(Integer customerid) {
		CustomerEntity customer=customerRepo.findBycustomerid(customerid);
		RegisterDTO dto=RegisterDTO.valueOf(customer);
		return dto;
		
	}

	
		
}
