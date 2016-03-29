package com.ecommerce.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Account;



@Repository("accountDAO")
public class AccountDAOImpl extends AbstractDAO<Account, Long> implements AccountDAO{

	@Override
	public Account findByUserNamePassword(String userName, String password) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("userName", userName));
		criteria.add(Restrictions.eq("password", password));
		return (Account) criteria.uniqueResult();
	}

	@Override
	public Account findByEmail(String email) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("email", email));
		return (Account) criteria.uniqueResult();
	}

	@Override
	public Account findById(long id) {
		//return (Account) createEntityCriteria().add(Restrictions.eq("accountId", id)).uniqueResult();
		return super.findById(id);
	}

}
