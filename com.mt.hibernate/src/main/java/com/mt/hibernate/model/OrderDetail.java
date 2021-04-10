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
@Table(name="order_detail")
public class OrderDetail 
{
	@Id
	@Column(name="order_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product;
	@ManyToOne(cascade=javax.persistence.CascadeType.ALL)
	@JoinColumn(name="order_id")
	private Order order;
	
	private int quantity;
	private double subtotal;
	
	public OrderDetail() {
		super();
	}

	public OrderDetail( Product product, Order order, int quantity, double subtotal) {
		super();
		this.product = product;
		this.order = order;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	
	

}
