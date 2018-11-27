/**
 * 
 */
package com.yash.webformproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.webformproject.model.Employee;
import com.yash.webformproject.service.EmployeeService;

/**
 * @author akshay.giradkar
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	

	@GetMapping(value = "/showEmployee")
	public List<Employee> showEmployeeList() {

		return service.viewEmployeeDetails();
	}

	@PostMapping(value = "/addEmployee")
	void addEmployees(@RequestBody Employee employee) {
		System.out.println("in controller *************" + employee);
		service.addEmployee(employee);

	}

	@DeleteMapping(value = "/deleteEmployee/{id}.ds")
	void deleteEmployees(@PathVariable("id") Integer employeeId) {

	
		service.deleteEmployee(employeeId);
		System.out.println("DELETED");

	}

	@PutMapping(value = "/update/{id}.ds")
	void updateEmployee(@RequestBody Employee employee) {

		service.updateEmployee(employee);
		System.out.println("UPdated");

	}

}
