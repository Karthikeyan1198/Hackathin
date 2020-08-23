package com.infosys.project.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.project.user.entity.CustomerEntity;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

	CustomerEntity findByEmail(String email);

	CustomerEntity findByphoneNumber(String phoneNumber);

	CustomerEntity findBycustomerid(Integer customerid);

//	CustomerEntity findByphoneNumber(String string);
//
//	

	

}
