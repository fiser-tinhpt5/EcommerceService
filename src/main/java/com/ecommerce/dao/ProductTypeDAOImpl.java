package com.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProductType;


@Repository("productTypeDAO")
public class ProductTypeDAOImpl extends AbstractDAO<ProductType, Long> implements ProductTypeDAO{

	@Override
	public ProductType findById(long id) {
		return super.findById(id);
	}

}
