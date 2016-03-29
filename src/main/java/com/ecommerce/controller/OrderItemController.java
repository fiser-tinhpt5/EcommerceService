package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.OrderItemDAO;
import com.ecommerce.model.OrderItem;

@RestController
@RequestMapping("/order")
public class OrderItemController {

	@Autowired
	private OrderItemDAO orderItemDAO;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<OrderItem> findByOrders(@PathVariable (value = "id") long id) {
		return orderItemDAO.findByOrders(id);
	}
	
	@RequestMapping(value = "/order-item", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody OrderItem orderItem) {
		orderItemDAO.persist(orderItem);
	}
}
