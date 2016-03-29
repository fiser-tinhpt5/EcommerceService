package com.ecommerce.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the PAYMENT_METHOD database table.
 * 
 */
@Entity
@Table(name="PAYMENT_METHOD")
@NamedQuery(name="PaymentMethod.findAll", query="SELECT p FROM PaymentMethod p")
public class PaymentMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAYMENT_METHOD_PAYMENTMETHODID_GENERATOR", sequenceName="PAYMENT_METHOD_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAYMENT_METHOD_PAYMENTMETHODID_GENERATOR")
	@Column(name="PAYMENT_METHOD_ID")
	private long paymentMethodId;

	private String description;

	@Column(name="PAYMENT_METHOD_CODE")
	private String paymentMethodCode;

	//bi-directional many-to-one association to Orders
	@OneToMany(fetch = FetchType.EAGER, mappedBy="paymentMethod")
	private Set<Orders> orders;

	public PaymentMethod() {
	}

	public long getPaymentMethodId() {
		return this.paymentMethodId;
	}

	public void setPaymentMethodId(long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPaymentMethodCode() {
		return this.paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public Set<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	public Orders addOrder(Orders order) {
		getOrders().add(order);
		order.setPaymentMethod(this);

		return order;
	}

	public Orders removeOrder(Orders order) {
		getOrders().remove(order);
		order.setPaymentMethod(null);

		return order;
	}

}