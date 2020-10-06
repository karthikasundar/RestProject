package com.example.boot.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity

public class Student {
	
	public Student() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "F_NAME" , length=50, unique=true)
	private String fname;
	private String lname;
	private int mark1;
	private int mark2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	
	public Student(int id, String fname, String lname, int mark1, int mark2) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	
	

}
