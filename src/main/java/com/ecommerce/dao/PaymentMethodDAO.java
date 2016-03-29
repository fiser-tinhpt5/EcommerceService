package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.PaymentMethod;

public interface PaymentMethodDAO {

	List<PaymentMethod> findAll();
	PaymentMethod findById(long id);
}
