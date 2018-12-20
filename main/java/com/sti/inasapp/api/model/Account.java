package com.sti.inasapp.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Account {
	@Id
	@Column(name="accountnumber")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accountNumber;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="opendate")
	private Date openDate;
	@Column
	private String balance;
	
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customerId;
	
	

	public Account() {

	}

	public Account(Integer accountNumber, Date openDate, String balance, Customer customerId) {
		this.accountNumber = accountNumber;
		this.openDate = openDate;
		this.balance = balance;
		this.customerId = customerId;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	
}
