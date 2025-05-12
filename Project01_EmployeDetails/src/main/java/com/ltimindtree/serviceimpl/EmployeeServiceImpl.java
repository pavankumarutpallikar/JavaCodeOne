package com.ltimindtree.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ltimindtree.AddressClient;
import com.ltimindtree.dto.AddressDTO;
import com.ltimindtree.dto.EmployeeDTO;
import com.ltimindtree.entity.EmployeeEntity;
import com.ltimindtree.repository.EmployeeRepository;
import com.ltimindtree.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public static Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressClient addressClient;

	@Override
	public boolean createEmployee(EmployeeDTO employeeDTO) {
		logger.info("Employe data is saving.................................");
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		employeeRepository.save(employeeEntity);
		return true;
	}

	@Override
	public EmployeeDTO getById(Integer employeeId) {
		EmployeeEntity employeeEntity = employeeRepository.findById(employeeId).get();
		EmployeeDTO employeeDTO = new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		
		// using feignclient
		ResponseEntity<AddressDTO> respEntity = addressClient.getAddressByEmployeeId(employeeId);
		employeeDTO.setAddressDto(respEntity.getBody());
		return employeeDTO;
	}

}
