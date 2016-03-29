package com.ecommerce.model;
// Generated Mar 21, 2016 11:49:19 PM by Hibernate Tools 4.3.1.Final

import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private long productId;
	private ProductType productType;
	private String name;
	private String code;
	private long quantity;
	private long price;
	private String color;
	private String productSize;
	private String description;
	private Blob image;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

	public Product() {
	}

	public Product(long productId, ProductType productType, String name, String code, long quantity, long price,
			Blob image) {
		this.productId = productId;
		this.productType = productType;
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
		this.image = image;
	}

	public Product(long productId, ProductType productType, String name, String code, long quantity, long price,
			String color, String productSize, String description, Blob image, Set<OrderItem> orderItems) {
		this.productId = productId;
		this.productType = productType;
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		this.price = price;
		this.color = color;
		this.productSize = productSize;
		this.description = description;
		this.image = image;
		this.orderItems = orderItems;
	}

	public long getProductId() {
		return this.productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPrice() {
		return this.price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductSize() {
		return this.productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getImage() {
		return this.image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public Set<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
