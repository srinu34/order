package com.mt.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order
{@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length = 64)
	private String customer;
	private double total;
	@OneToMany(mappedBy ="order",cascade=CascadeType.ALL)
	private Set<OrderDetail> orderDetails = new HashSet<>();
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private Set<OrderPayment> orderpayment=new HashSet<>();
	@ManyToOne(cascade=CascadeType.ALL)
	private Contact contact;
	
	public Order() {
		super();
	}


	public Order( String customer, double total) {
		super();
		
		this.customer = customer;
		this.total = total;
	}

		
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


	public void addOrderDetails(OrderDetail orderDetail) {
		this.orderDetails.add(orderDetail);
		
	}
	public void addOrderPayment(OrderPayment orderpayment)
	{
		this.orderpayment.add(orderpayment);
	}


	public void setContact(Contact contact) {
		this.contact=contact;
		
	}

}
