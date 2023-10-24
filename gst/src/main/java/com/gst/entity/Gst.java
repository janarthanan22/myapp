package com.gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gst_details")
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hsn;
	private int taxPercentage;
	private int disPercentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHsn() {
		return hsn;
	}

	public void setHsn(int hsn) {
		this.hsn = hsn;
	}

	public int getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(int taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public int getDisPercentage() {
		return disPercentage;
	}

	public void setDisPercentage(int disPercentage) {
		this.disPercentage = disPercentage;
	}

}
