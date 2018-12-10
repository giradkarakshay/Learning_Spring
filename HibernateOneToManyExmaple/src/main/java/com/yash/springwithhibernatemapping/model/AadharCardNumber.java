/**
 * 
 */
package com.yash.springwithhibernatemapping.model;

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
@Table(name = "adharcard")
public class AadharCardNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long adharCardNumber;

	public AadharCardNumber() {
	}

	public AadharCardNumber(int id, long adharCardNumber) {
		super();
		this.id = id;
		this.adharCardNumber = adharCardNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	@Override
	public String toString() {
		return "AdharCardNumber [id=" + id + ", adharCardNumber=" + adharCardNumber + "]";
	}

}