/**
 * 
 */
package com.yash.springwithrestweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akshay.giradkar
 *
 */

@RestController

public class RestControllerClass {

	Employee employee = new Employee();

	@GetMapping
	@RequestMapping("/getData.ds")
	public Employee getEmployeeInJSON() {
		employee.setName("AKSHAY");
		employee.setEmail("employee1@rediff.com");
		return employee;
	}

}
