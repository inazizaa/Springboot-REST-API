package com.sti.inasapp.api.dao.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sti.inasapp.api.model.Customer;


public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {
	//Customer findByCustomerNumber(int customerNumber);

}