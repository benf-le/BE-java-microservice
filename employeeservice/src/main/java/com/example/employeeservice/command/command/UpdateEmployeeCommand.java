package com.example.employeeservice.command.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class UpdateEmployeeCommand {
	@TargetAggregateIdentifier
	private String employeeId;
	private String firstName;
	private String lastName;

	private String avatarUrl;

	private String department;

	private String kin;
	private Boolean isDisciplined;

	private String role;

	public UpdateEmployeeCommand(String employeeId, String firstName, String lastName,String avatarUrl,String department, String kin,
			Boolean isDisciplined, String role) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.avatarUrl = avatarUrl;
		this.department = department;
		this.kin = kin;
		this.isDisciplined = isDisciplined;
		this.role = role;

	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String getKin() {
		return kin;
	}
	public void setKin(String kin) {
		this.kin = kin;
	}
	public Boolean getIsDisciplined() {
		return isDisciplined;
	}
	public void setIsDisciplined(Boolean isDisciplined) {
		this.isDisciplined = isDisciplined;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


}
