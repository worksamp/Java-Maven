package com.hiresmart.service;

import java.util.List;

import com.hiresmart.model.Employee;


public interface EmployeeService {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
	
	public String sayHello(String name);
}
