package com.infosys.project.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {

	@Id
	@SequenceGenerator(name="sel", initialValue=101, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sel")
	@Column(name="ADDRESSID", nullable = false)
	private int addressid;
	@Column(name="CITY", nullable = false)
	private String city;
	@Column(name="STATE", nullable = false)
	private String state;
	@Column(name="HOUSE", nullable = false)
	private int house;
	@Column(name="DISTRICT", nullable = false)
	private String district;
	
	
	
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
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
	
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	
	
	
	
	
	
	
	
	
	

}
