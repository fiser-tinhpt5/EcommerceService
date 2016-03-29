package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.PaymentMethodDAO;
import com.ecommerce.model.PaymentMethod;

@RestController
@RequestMapping("/payment-method")
public class PaymentMethodController {
	
	@Autowired
	private PaymentMethodDAO paymentMethodDAO;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<PaymentMethod> findAll() {
		return paymentMethodDAO.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public PaymentMethod findById(@PathVariable(value="id") long id) {
		return paymentMethodDAO.findById(id);
	}
}
