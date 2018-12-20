package com.sti.inasapp.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idtrans;
	
	@Column
	private String amountsign;
	@Column
	private String amount;
	@Column
	private String type;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Account accountId;
	
	
	
	
	public Transaction(Integer idtrans, String amountsign, String amount, String type, Account accountId) {
		this.idtrans = idtrans;
		this.amountsign = amountsign;
		this.amount = amount;
		this.type = type;
		this.accountId = accountId;
	}
	
	public Transaction() {
		
	}
	
	public int getIdtrans() {
		return idtrans;
	}
	public void setIdtrans(int idtrans) {
		this.idtrans = idtrans;
	}
	public String getAmountsign() {
		return amountsign;
	}
	public void setAmountsign(String amountsign) {
		this.amountsign = amountsign;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	
}
