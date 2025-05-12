package com.ltimindtree.dto;

public class EmployeeDTO {

	private Integer employeeId;

	private String employeeName;

	private String employeeEmail;

	private String employeeAddress;
	
	private AddressDTO addressDto;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public AddressDTO getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(AddressDTO addressDto) {
		this.addressDto = addressDto;
	}

}
