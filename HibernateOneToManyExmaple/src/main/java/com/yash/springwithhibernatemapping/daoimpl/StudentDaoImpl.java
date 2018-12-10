/**
 * 
 */
package com.yash.springwithhibernatemapping.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.springwithhibernatemapping.dao.StudentDao;
import com.yash.springwithhibernatemapping.model.Address;
import com.yash.springwithhibernatemapping.model.Student;

/**
 * @author akshay.giradkar
 *
 */

@Repository("dao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int addStudent(Student student) {

		System.out.println("in dao impl : " + student);
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		int result = (Integer) session.save(student);
		List<Address> addressList = student.getAddress();
		for (Address address : addressList) {
			address.setStudent(student);
			session.save(address);
		}
		session.getTransaction().commit();
		return result;
	}

	public List<Student> getStudents() {

		return null;
	}

	public Student getStudent(int id) {

		return null;
	}

}
