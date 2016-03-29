package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.OrderItem;


@Repository("orderItemDAO")
public class OrderItemDAOImpl extends AbstractDAO<OrderItem, Long> implements OrderItemDAO{

	@Override
	public List<OrderItem> findByOrders(long id) {
		Criteria criteria = createEntityCriteria();
		criteria.createAlias("orders", "od");
		criteria.add(Restrictions.eq("orders.orderId", id));
		return criteria.list();
	}

}
