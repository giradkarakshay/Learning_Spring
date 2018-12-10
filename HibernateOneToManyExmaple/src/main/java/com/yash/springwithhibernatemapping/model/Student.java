/**
 * 
 */
package com.yash.springwithhibernatemapping.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/**
 * @author akshay.giradkar
 *
 */

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "studentId")
	private int studentId;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private AadharCardNumber aadharCardNumber;

	@OneToMany(mappedBy = "student")
	private List<Address> address;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Technology", joinColumns = {
			@JoinColumn(referencedColumnName = "studentId") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "techId") })
	private Set<Technology> technologies;

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", aadharCardNumber=" + aadharCardNumber
				+ ", address=" + address + ", technologies=" + technologies + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AadharCardNumber getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(AadharCardNumber aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(Set<Technology> technologies) {
		this.technologies = technologies;
	}

	public Student(int studentId, String name, AadharCardNumber aadharCardNumber, List<Address> address,
			Set<Technology> technologies) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.aadharCardNumber = aadharCardNumber;
		this.address = address;
		this.technologies = technologies;
	}

}
