package com.sti.inasapp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.inasapp.api.dao.TransactionDao;
import com.sti.inasapp.api.model.Transaction;



@RestController
@RequestMapping("/transaction")
public class ControllerTransaction {
	
	@Autowired
	private TransactionDao transactionDao;
	
	@GetMapping("/get")
	public String trans(@RequestParam(value="id", defaultValue="") String id ) throws NumberFormatException, Exception{
		Transaction transaction = transactionDao.getById(Integer.valueOf(id));
		try {
			if(transaction==null) {
			return "data tidak ada";
			}else {
			return "hello"+transaction.getAmount();
			}} catch(NumberFormatException e){
			return "salah format input";
		}catch (Exception e) {
				return String.format("terjadi kesalahan sistem: %s", e.getMessage());}
	}
	
	@PostMapping("/post")
	public Transaction trpost(@RequestBody Transaction transaction) throws Exception{
		Transaction ac = transactionDao.save(transaction);
		return ac;
		}
	
	@PutMapping("/put")
	public Transaction iniput(@RequestBody Transaction transaction) throws Exception{
		Transaction tr = transactionDao.save(transaction);
		return tr;
		}
	
	@DeleteMapping("/delete/{id}")
	public void deleted(@PathVariable ("id") Transaction Transaction) throws Exception{
		transactionDao.delete(Transaction);
	}	
	
	@GetMapping("/listnya")
	public List<Transaction> mygetlist() throws Exception{
		List<Transaction> list = transactionDao.getList();
		return list;
	}
}
