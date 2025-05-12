package com.ltimindtree;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ltimindtree.dto.AddressDTO;

@FeignClient(name = "Project02-Address-Module", url = "http://localhost:8989", path = "/Project02-Address-Module")
public interface AddressClient {

	    @GetMapping("/address/{employeeId}")
	    public ResponseEntity<AddressDTO> getAddressByEmployeeId(@PathVariable("employeeId") Integer employeeId);

	}

