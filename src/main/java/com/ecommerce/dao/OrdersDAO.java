package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Orders;

public interface OrdersDAO {

	List<Orders> findAll();
	void persist(Orders orders);
	void update(Orders orders);
}
