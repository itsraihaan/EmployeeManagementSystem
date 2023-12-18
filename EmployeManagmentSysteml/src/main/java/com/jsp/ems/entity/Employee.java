package com.jsp.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Entity
@Scope("prototype")
public class Employee {
	
	@Id
	@Column(nullable = false, unique = true)
	private int id ;
	private String name ;
	@Column(nullable = false)
	private String email ;
	@Column(length = 10,nullable = false)
	private long phno ;
	private int age ;
	private String gender ;
	private String role ;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, long phno, int age, String gender, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.age = age;
		this.gender = gender;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", age=" + age
				+ ", gender=" + gender + ", role=" + role + "]";
	}
	
	
}
