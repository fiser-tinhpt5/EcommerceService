package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Customer;

public interface CustomerDAO {

	List<Customer> findAll();
	void create(Customer customer);
	void update(Customer customer);
}
