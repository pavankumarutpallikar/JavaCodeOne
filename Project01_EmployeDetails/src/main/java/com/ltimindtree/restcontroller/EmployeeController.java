package com.ltimindtree.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.dto.EmployeeDTO;
import com.ltimindtree.service.EmployeeService;

@RestController
@RequestMapping("/v1/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
	boolean status = employeeService.createEmployee(employeeDTO);
			if(status) {
				return new ResponseEntity<String>("Employee Detail is saved ", HttpStatus.CREATED);
			} else {
				return new ResponseEntity<String>("Employee detail is not saved ", HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	@GetMapping("/find/{employeeId}")
	public ResponseEntity<EmployeeDTO> findEmployeeById(@PathVariable("employeeId") Integer employeeId) {
	EmployeeDTO emDto = employeeService.getById(employeeId);
	return new ResponseEntity<EmployeeDTO>(emDto, HttpStatus.OK);
		
	}

}
