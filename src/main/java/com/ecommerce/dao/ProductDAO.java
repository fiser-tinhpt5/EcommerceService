package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Product;


public interface ProductDAO {
	List<Product> findAll();
	Product findByCode(String code);
	Product findByName(String name);
	List<Product> findByIdProductType(long id);
	void persist(Product product);
	void delete(Product product);
	void update(Product product);
	Product findById(long id);
}
