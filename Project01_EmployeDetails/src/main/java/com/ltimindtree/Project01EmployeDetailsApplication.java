package com.ltimindtree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Project01EmployeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project01EmployeDetailsApplication.class, args);
	}

}
