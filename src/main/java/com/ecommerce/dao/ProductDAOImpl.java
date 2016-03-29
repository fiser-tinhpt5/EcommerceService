package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;


@Repository("productDAO")
public class ProductDAOImpl extends AbstractDAO<Product, Long> implements ProductDAO{

	@Override
	public Product findByCode(String code) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("code", code));
		return (Product) criteria.uniqueResult();
	}

	@Override
	public Product findByName(String name) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("name", name));
		return (Product) criteria.uniqueResult();
	}

	@Override
	public List<Product> findByIdProductType(long id) {
		Criteria criteria = createEntityCriteria();
		criteria.createAlias("productType", "pt");
		criteria.add(Restrictions.eq("pt.productTypeId", id));
		return criteria.list();
	}

	@Override
	public Product findById(long id) {
		return super.findById(id);
	}

}
