package com.mt.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_payment")
public class OrderPayment
{

	@Id
	@Column(name="order_payment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="payment_type")
	private Payment payment;
	@ManyToOne(cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="order_id")
	private Order order;
	private double amount;
	
	
	public OrderPayment() {
		super();
	}

	public OrderPayment(Payment payment, Order order, double amount) {
		super();
		this.payment = payment;
		this.order = order;
		this.amount = amount;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
