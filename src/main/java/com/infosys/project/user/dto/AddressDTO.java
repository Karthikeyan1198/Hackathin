package com.infosys.project.user.dto;


import javax.persistence.Column;

import com.infosys.project.user.entity.AddressEntity;
import com.infosys.project.user.entity.CustomerEntity;

public class AddressDTO {
	private int addressid;
	private String city ;
	private String state;
	private int house;
	private String district;
	
	





	public int getAddressid() {
		return addressid;
	}



	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	


	public int getHouse() {
		return house;
	}



	public void setHouse(int house) {
		this.house = house;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public AddressEntity createEntity() {
	
		
		AddressEntity address=new AddressEntity();
		address.setCity(this.getCity());
		
		address.setDistrict(this.getDistrict());
		address.setHouse(this.getHouse());
		address.setState(this.getState());
//		entity.setAddress(address);
		return address;
	}

	
	
	public static AddressDTO valueOf(AddressEntity address) {
		AddressDTO dto=new AddressDTO();
		
		dto.setCity(address.getCity());
		dto.setDistrict(address.getDistrict());
		dto.setHouse(address.getHouse());
		dto.setState(address.getState());
		   
		return dto;
	}
}
