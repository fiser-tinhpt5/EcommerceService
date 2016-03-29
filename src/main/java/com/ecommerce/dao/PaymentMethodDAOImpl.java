package com.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.PaymentMethod;


@Repository("paymentMethodDAO")
public class PaymentMethodDAOImpl extends AbstractDAO<PaymentMethod, Long> implements PaymentMethodDAO{

	@Override
	public PaymentMethod findById(long id) {
		return super.findById(id);
	}

}
