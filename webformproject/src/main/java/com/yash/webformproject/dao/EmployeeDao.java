/**
 * 
 */
package com.yash.webformproject.dao;

import java.util.List;

import com.yash.webformproject.model.Employee;

/**
 * @author akshay.giradkar
 *
 */
public interface EmployeeDao {

	List<Employee> viewEmployeeList();

	public void registerEmployee(Employee employee);

	public int deleteEmployee(Integer id);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(Integer id);

}
