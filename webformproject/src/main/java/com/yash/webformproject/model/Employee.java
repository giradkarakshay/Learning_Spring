/**
 * 
 */
package com.yash.webformproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author akshay.giradkar
 *
 */

@Entity
@Table(name = "empwb")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "ctc")
	private double ctc;

	@Column(name = "skill")
	private String skill;

	@Column(name = "domain")
	private String domain;

	@Column(name = "location")
	private String location;

	/**
	 * @return the id which is autoincremented
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name of an employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ctc of a employee
	 */
	public double getCtc() {
		return ctc;
	}

	/**
	 * @param ctc the ctc to set
	 */
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	/**
	 * @return the skill of the employee
	 */
	public String getSkill() {
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(String skill) {
		this.skill = skill;
	}

	/**
	 * @return the domain of the employee
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ctc=" + ctc + ", skill=" + skill + ", domain=" + domain
				+ ", location=" + location + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param ctc
	 * @param skill
	 * @param domain
	 * @param location
	 */
	public Employee(int id, String name, double ctc, String skill, String domain, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ctc = ctc;
		this.skill = skill;
		this.domain = domain;
		this.location = location;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the location where the employee currently based on
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

}
