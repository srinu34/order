package com.mt.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment 
{
	@Id
	@Column(name="order_payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="payment_type")
	private String paymentType;
	@Column(name="des")
	private String description;
	@OneToMany(mappedBy="payment")
	private Set<OrderPayment> orderpayment=new HashSet<>();
	public Payment() {
		super();
	}
	public Payment( String paymentType,String description) {
		super();
		this.paymentType=paymentType;
		this.description = description;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
