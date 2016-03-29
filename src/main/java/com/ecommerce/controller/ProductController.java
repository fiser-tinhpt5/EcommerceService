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

import com.ecommerce.dao.ProductDAO;
import com.ecommerce.model.Product;

@RestController
@RequestMapping("/product-type")
public class ProductController {

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	@RequestMapping(value = "/{id}/product", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findByProductType(@PathVariable(value = "id") long id) {
		return productDAO.findByIdProductType(id);
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Product product) {
		productDAO.persist(product);
	}

	@RequestMapping(value = "/product", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestBody Product product) {
		productDAO.delete(product);
	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Product product) {
		productDAO.update(product);
	}

	@RequestMapping(value = "/product-name", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Product findByName(@PathVariable(value = "name") String name) {
		return productDAO.findByName(name);
	}
	
	@RequestMapping(value = "/product-code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Product findByCode(@PathVariable(value = "code") String code) {
		return productDAO.findByCode(code);
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Product findById(@PathVariable(value = "id") long id) {
		return productDAO.findById(id);
	}
}
