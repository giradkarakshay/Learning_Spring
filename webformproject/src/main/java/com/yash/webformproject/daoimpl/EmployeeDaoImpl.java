/**
 * 
 */
package com.yash.webformproject.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.webformproject.dao.EmployeeDao;
import com.yash.webformproject.model.Employee;

/**
 * @author akshay.giradkar
 *
 */

@Repository("employeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public List<Employee> viewEmployeeList() {

		System.out.println("hibernateTemplate::" + hibernateTemplate);
		return hibernateTemplate.loadAll(Employee.class);

	}

	@Transactional
	public void registerEmployee(Employee employee) {

		hibernateTemplate.saveOrUpdate(employee);
	}

	@Transactional
	public int deleteEmployee(Integer id) {

		Session session = hibernateTemplate.getSessionFactory().openSession();
		try {
			session.getTransaction().begin();

			Employee employee1 = session.get(Employee.class, id);
			session.delete(employee1);
			System.out.println("deleted...");
			session.getTransaction().commit();
			hibernateTemplate.flush();
			return 1;
		} catch (Exception e) {
			System.out.println("Exception Occured " + e);
		}
		return 1;
	}

	@Transactional
	public Employee updateEmployee(Employee employee) {

		Session session = hibernateTemplate.getSessionFactory().openSession();

		try {
			session.getTransaction().begin();

			Employee emp = getEmployee(employee.getId());
			emp.setId(employee.getId());
			emp.setName(employee.getName());
			emp.setCtc(employee.getCtc());
			emp.setSkill(employee.getSkill());
			emp.setDomain(employee.getDomain());
			emp.setLocation(employee.getLocation());
			session.update(emp);

			System.out.println("Updated...");
			session.getTransaction().commit();

			hibernateTemplate.flush();

			return employee;
		} catch (Exception e) {
			System.out.println("Exception Occured " + e);
		}
		return employee;

	}

	@Transactional
	public Employee getEmployee(Integer id) {

		Session session = hibernateTemplate.getSessionFactory().openSession();

		Employee employeeToBeFound = new Employee();

		try {
			session.getTransaction().begin();

			employeeToBeFound = session.get(Employee.class, id);

		} catch (Exception e) {

			System.out.println("Exception Occured........." + e);
		}
		return employeeToBeFound;

	}
}
