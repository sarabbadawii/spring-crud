 package com.spring.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roolNo;
	@Column
	private String name;
	@Column
	private float percentage;
	@Column
	
	
	private String breanch;
	public Student() {
		
	}
	public Student(String name, float percentage, String breanch) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.breanch = breanch;
	}
	@Override
	public String toString() {
		return "Student [roolNo=" + roolNo + ", name=" + name + ", percentage=" + percentage + ", breanch=" + breanch
				+ "]";
	}
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBreanch() {
		return breanch;
	}
	public void setBreanch(String breanch) {
		this.breanch = breanch;
	}
	
	
}
