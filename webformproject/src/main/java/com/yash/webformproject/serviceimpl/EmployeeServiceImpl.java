/**
 * 
 */
package com.yash.webformproject.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.webformproject.dao.EmployeeDao;
import com.yash.webformproject.model.Employee;
import com.yash.webformproject.service.EmployeeService;

/**
 * @author akshay.giradkar
 *
 */

@Service("service")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public List<Employee> viewEmployeeDetails() {

		return dao.viewEmployeeList();
	}

	public void addEmployee(Employee employee) {

		dao.registerEmployee(employee);

	}

	public int deleteEmployee(Integer id) {

		return dao.deleteEmployee(id);
	}

	public Employee getEmployee(int id) {

		return dao.getEmployee(id);
	}

	public Employee updateEmployee(Employee employee) {
		
		return dao.updateEmployee(employee);
	}

}
