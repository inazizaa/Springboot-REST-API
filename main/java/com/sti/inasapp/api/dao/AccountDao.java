package com.sti.inasapp.api.dao;

import java.util.List;

import com.sti.inasapp.api.model.Account;
import com.sti.inasapp.api.model.Customer;

public interface AccountDao {
	Account getById(int id) throws Exception;
	Account save(Account account) throws Exception;
	void delete(Account account) throws Exception;
	
	List<Account> getList() throws Exception;
	List<Account> getListByCustomer(Customer customer) throws Exception;
}
