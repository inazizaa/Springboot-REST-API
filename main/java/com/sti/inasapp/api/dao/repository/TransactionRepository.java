package com.sti.inasapp.api.dao.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.sti.inasapp.api.model.Transaction;


public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Integer>{
	Transaction findByidtrans(int id);
}
