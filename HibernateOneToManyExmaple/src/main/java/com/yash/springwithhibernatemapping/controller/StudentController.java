/**
 * 
 */
package com.yash.springwithhibernatemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springwithhibernatemapping.model.Student;
import com.yash.springwithhibernatemapping.service.StudentService;

/**
 * @author akshay.giradkar
 *
 */

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService service;

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	@GetMapping
	@RequestMapping(value = "/test")
	public String test() {
		return "done";
	}

	@PostMapping
	@RequestMapping(value = "/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		System.out.println("in student controller : " + student);
		int result = service.addStudent(student);
		if (result > 0) {
			return new ResponseEntity<String>("chala bhai", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("nahi chala", HttpStatus.NOT_IMPLEMENTED);
		}
	}
	
	/*@GetMapping
	@RequestMapping(value="/getEmployees", produces="application/json")
	public List<Employee> getEmployeeList(){
		List<Employee> empList = service.getEmployees();
		System.out.println("in controller : "+empList);
		return empList;
	}
	
	@GetMapping
	@RequestMapping(value="/getEmployee/{id}", produces="application/json")
	public Employee getEmployee(@PathVariable("id") int id) {
		return service.getEmployee(id);
		
	}*/

}
