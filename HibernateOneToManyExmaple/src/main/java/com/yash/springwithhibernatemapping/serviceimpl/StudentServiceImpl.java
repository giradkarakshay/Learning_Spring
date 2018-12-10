/**
 * 
 */
package com.yash.springwithhibernatemapping.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springwithhibernatemapping.dao.StudentDao;
import com.yash.springwithhibernatemapping.model.Student;
import com.yash.springwithhibernatemapping.service.StudentService;

/**
 * @author akshay.giradkar
 *
 */

@Service("service")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public int addStudent(Student student) {
		return dao.addStudent(student);
	}

	public List<Student> getStudents() {

		return null;
	}

	public Student getStudent(int id) {

		return null;
	}

}
