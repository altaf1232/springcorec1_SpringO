package com.springcore1;

public class EmployeeA 
{
   private int employeeId;
   private String employeeName;
   private String employeeAddress;
   private String employeeCity;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
public String getEmployeeCity() {
	return employeeCity;
}
public void setEmployeeCity(String employeeCity) {
	this.employeeCity = employeeCity;
}
public EmployeeA(int employeeId, String employeeName, String employeeAddress, String employeeCity) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	this.employeeCity = employeeCity;
}
public EmployeeA() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmployeeA [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
			+ employeeAddress + ", employeeCity=" + employeeCity + "]";
}
   

}
