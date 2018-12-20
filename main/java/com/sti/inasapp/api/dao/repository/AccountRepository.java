package com.sti.inasapp.api.dao.repository;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.inasapp.api.model.Account;
import com.sti.inasapp.api.model.Customer;

public interface AccountRepository extends PagingAndSortingRepository<Account, Integer> {
	Account findByAccountNumber(int accountNumber);
	List<Account> findByCustomerId(Customer customerId); //ujungnya diganti sesuai variabel di model account namanya apa
}
