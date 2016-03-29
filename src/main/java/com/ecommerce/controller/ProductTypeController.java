package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dao.ProductTypeDAO;
import com.ecommerce.model.ProductType;

@RestController
@RequestMapping("/product-type")
public class ProductTypeController {
	
	@Autowired
	private ProductTypeDAO productTypeDAO;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<ProductType> findAll() {
		return productTypeDAO.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ProductType findById(@PathVariable(value = "id") long id) {
		return productTypeDAO.findById(id);
	}
	
}
