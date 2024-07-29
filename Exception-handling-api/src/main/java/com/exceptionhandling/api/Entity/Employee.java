package com.exceptionhandling.api.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {
   
	@Id
	@Column(name="empId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="fname", nullable = false)
	private String firstName;
	
	@Column(name="lname", nullable = false)
	private String lastName;
	
	@Column(name="date_of_birth", nullable = false)
	private LocalDate dob;

	public Employee(long id, String firstName, String lastName, LocalDate dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
