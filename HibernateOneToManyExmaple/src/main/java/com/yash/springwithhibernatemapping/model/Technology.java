/**
 * 
 */
package com.yash.springwithhibernatemapping.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author akshay.giradkar
 *
 */

@Entity
@Table(name = "technology")
public class Technology {

	public Technology() {
		super();
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", students=" + students + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int techId;
	private String techName;

	@ManyToMany(mappedBy = "technologies")
	private Set<Student> students;

	public Technology(int techId, String techName, Set<Student> students) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.students = students;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
