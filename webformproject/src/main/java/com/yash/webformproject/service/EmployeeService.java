/**
 * 
 */
package com.yash.webformproject.service;

import java.util.List;

import com.yash.webformproject.model.Employee;

/**
 * @author akshay.giradkar
 *
 */
public interface EmployeeService {
	
	List<Employee> viewEmployeeDetails();

	void addEmployee(Employee employee);

	public int deleteEmployee(Integer id);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int id);

}
