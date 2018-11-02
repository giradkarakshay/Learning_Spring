/**
 * 
 */
package com.yash.webformproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	EmployeeService service;

	@RequestMapping(value = "/showemployee" , method = RequestMethod.GET)
	public List<Employee> showEmployeeList() {

		return service.viewEmployeeDetails();
	}

	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	void addEmployees(@RequestBody Employee employee) {
		System.out.println("in controller *************" + employee);
		service.addEmployee(employee);

	}

	@RequestMapping(value = "/deleteemployee/{id}.ds", method = RequestMethod.DELETE)
	void deleteEmployees(@PathVariable("id") Integer employeeId) {

		System.out.println("NAHI HUAAAA");
		service.deleteEmployee(employeeId);
		System.out.println("DELETE HUAAAA");

	}

	@RequestMapping(value = "/update/{id}.ds", method = RequestMethod.PUT)
	void updateEmployee(@RequestBody Employee employee) {

		System.out.println("UPdate pending");
		service.updateEmployee(employee);
		System.out.println("UPdate Done");

	}

}
