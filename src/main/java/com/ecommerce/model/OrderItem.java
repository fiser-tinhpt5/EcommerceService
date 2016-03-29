package com.ecommerce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ORDER_ITEM database table.
 * 
 */
@Entity
@Table(name="ORDER_ITEM")
@NamedQuery(name="OrderItem.findAll", query="SELECT o FROM OrderItem o")
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDER_ITEM_ORDERITEMID_GENERATOR", sequenceName="ORDER_ITEM_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDER_ITEM_ORDERITEMID_GENERATOR")
	@Column(name="ORDER_ITEM_ID")
	private long orderItemId;

	private BigDecimal quantity;

	//bi-directional many-to-one association to Orders
	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Orders order;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;

	public OrderItem() {
	}

	public long getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Orders getOrder() {
		return this.order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}