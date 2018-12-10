/**
 * 
 */
package com.yash.springwithhibernatemapping.service;

import java.util.List;

import com.yash.springwithhibernatemapping.model.Student;

/**
 * @author akshay.giradkar
 *
 */
public interface StudentService {

	public int addStudent(Student student);

	public List<Student> getStudents();

	public Student getStudent(int id);

}
