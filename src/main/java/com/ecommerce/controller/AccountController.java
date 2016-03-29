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

import com.ecommerce.dao.AccountDAO;
import com.ecommerce.model.Account;



@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountDAO accountDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Account> findAll() {
		return accountDAO.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Account findById(@PathVariable(value = "id") long id) {
		return accountDAO.findById(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Account account) {
		accountDAO.persist(account);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Account account) {
		accountDAO.update(account);
	}
	
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestBody Account account) {
		accountDAO.delete(account);
	}
	
	@RequestMapping(value = "/user-pass", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Account findByUserNamePassword(String userName, String password) {
		return accountDAO.findByUserNamePassword(userName, password);
	}
	
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Account findByEmail(String email) {
		return accountDAO.findByEmail(email);
	}
}
