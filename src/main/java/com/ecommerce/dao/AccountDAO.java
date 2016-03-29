package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Account;

public interface AccountDAO {
	List<Account> findAll();
	Account findById(long id);
	Account findByUserNamePassword(String userName, String password);
	Account findByEmail(String email);
	void persist(Account account);
	void update(Account account);
	void delete(Account account);
}
