package com.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.Customer;


@Repository("customerDAO")
public class CustomerDAOImpl extends AbstractDAO<Customer, Long> implements CustomerDAO{

	@Override
	public void create(Customer customer) {
		persist(customer);
	}

}
