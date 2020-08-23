package com.infosys.project.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class CustomerApplication {
	public static void main(String[] args) {
		System.out.println("before controller");
		SpringApplication.run(CustomerApplication.class, args);
		System.out.println("after controller");

}}
