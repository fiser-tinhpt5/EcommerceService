package com.ecommerce.model;
// Generated Mar 21, 2016 11:49:19 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private long customerId;
	private String name;
	private String phone;
	private String address;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	public Customer() {
	}

	public Customer(long customerId, String name, String phone, String address) {
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Customer(long customerId, String name, String phone, String address, Set<Orders> orderses) {
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.orderses = orderses;
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}
