package com.infosys.project.user.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@SequenceGenerator(name="seq", initialValue=101, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="CUSTOMERID", nullable = false)
	private int customerid;
	@Column(name="NAME", nullable = false)
	private String name;
	@Column(name="EMAIL", nullable = false)
	private String email;
	@Column(name="PHONENUMBER", nullable = false)
	private String phoneNumber;
	@Column(name="PASSWORD", nullable = false)
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESSID", unique = true)
	private AddressEntity addressEntity;
	
	
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
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
	
	
	
	
	
	
}
