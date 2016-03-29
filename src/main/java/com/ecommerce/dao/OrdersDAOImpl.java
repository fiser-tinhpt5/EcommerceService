package com.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.Orders;


@Repository("ordersDAO")
public class OrdersDAOImpl extends AbstractDAO<Orders, Long> implements OrdersDAO{

}
