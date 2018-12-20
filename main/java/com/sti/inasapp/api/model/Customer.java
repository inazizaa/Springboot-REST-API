package com.sti.inasapp.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Customer {
	@Id
	@Column(name="customernumber")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerNumber;
	
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="birthdate")
	private Date birthDate;
	@Column(name="username")
	private String username;
	@Column
	private String password;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="phonetype")
	private String phoneType;
	
	public Customer(Integer customerNumber) {
		this.customerNumber=customerNumber;
	}

	
	public Customer() {
	}



	public Customer(int customerNumber, String firstName, String lastName, Date birthDate, String username, String password, String phoneNumber, String phoneType) {
		this.customerNumber = customerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.phoneType = phoneType;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setcustomerNumber(int customerNumber)  {
		this.customerNumber = customerNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
}
