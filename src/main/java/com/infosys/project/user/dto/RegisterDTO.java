package com.infosys.project.user.dto;


import javax.persistence.Column;

import com.infosys.project.user.entity.AddressEntity;
import com.infosys.project.user.entity.CustomerEntity;

public class RegisterDTO {
	private int customerid;
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	private AddressDTO address;
	
	
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public CustomerEntity createEntity() {
		CustomerEntity entity=new CustomerEntity();
		entity.setEmail(this.getEmail());
		entity.setName(this.getName());
		entity.setPhoneNumber(this.getPhoneNumber());
		entity.setPassword(this.getPassword());
		AddressEntity add=new AddressEntity();
		add.setAddressid(this.getAddress().getAddressid());
		add.setCity(this.getAddress().getCity());
		add.setDistrict(this.getAddress().getDistrict());
		add.setHouse(this.getAddress().getHouse());
		add.setState(this.getAddress().getState());
		entity.setAddressEntity(add);
		return entity;
	}

	
	
	public static RegisterDTO valueOf(CustomerEntity customer) {
		RegisterDTO dto=new RegisterDTO();
		dto.setCustomerid(customer.getCustomerid());
		dto.setName(customer.getName());
		dto.setPassword(customer.getPassword());
		dto.setPhoneNumber(customer.getPhoneNumber());
		dto.setEmail(customer.getEmail());
		AddressDTO address=new AddressDTO();
		address.setAddressid(customer.getAddressEntity().getAddressid());
		address.setCity(customer.getAddressEntity().getCity());
		address.setDistrict(customer.getAddressEntity().getDistrict());
		address.setHouse(customer.getAddressEntity().getHouse());
		address.setState(customer.getAddressEntity().getState());
		dto.setAddress(address);
		return dto;
	}
}
