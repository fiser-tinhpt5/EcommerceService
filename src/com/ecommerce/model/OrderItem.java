package com.ecommerce.model;
// Generated Mar 21, 2016 11:49:19 PM by Hibernate Tools 4.3.1.Final

/**
 * OrderItem generated by hbm2java
 */
public class OrderItem implements java.io.Serializable {

	private long orderItemId;
	private Orders orders;
	private Product product;
	private long quantity;

	public OrderItem() {
	}

	public OrderItem(long orderItemId, Orders orders, Product product, long quantity) {
		this.orderItemId = orderItemId;
		this.orders = orders;
		this.product = product;
		this.quantity = quantity;
	}

	public long getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

}
