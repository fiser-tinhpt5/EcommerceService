package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.ProductType;

public interface ProductTypeDAO {
	List<ProductType> findAll();
	ProductType findById(long id);
}
