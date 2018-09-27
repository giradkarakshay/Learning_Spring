/**
 * 
 */
package com.yash.springwithrestweb;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author akshay.giradkar
 *
 */
@Repository("dao")
public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getTemplate() {
		return hibernateTemplate;
	}

	public void setTemplate(HibernateTemplate template) {
		this.hibernateTemplate = template;
	}

	public List<Employee> getEmployeesList() {

		return null;

	}

}
