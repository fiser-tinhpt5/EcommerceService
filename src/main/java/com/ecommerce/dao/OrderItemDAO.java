package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.OrderItem;


public interface OrderItemDAO {

	List<OrderItem> findByOrders(long id);
	void persist(OrderItem orderItem);
}
