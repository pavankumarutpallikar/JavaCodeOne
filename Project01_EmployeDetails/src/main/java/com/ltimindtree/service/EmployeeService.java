package com.ltimindtree.service;

import com.ltimindtree.dto.EmployeeDTO;

public interface EmployeeService {

	public boolean createEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO getById(Integer employeeId);
}
