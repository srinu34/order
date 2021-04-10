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
@Table(name="products")
public class Product 
{
	

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name")
	private String paymentType;
	
	private double itemprice;;
	@OneToMany(mappedBy="product")
	private Set<OrderDetail> orderdetail=new HashSet<>();
	
	public Product() {
		super();
	}

	public Product( String paymentType, double itemprice) {
		super();
		this.paymentType = paymentType;
		this.itemprice = itemprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getItemprice() {
		return itemprice;
	}

	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	

}
