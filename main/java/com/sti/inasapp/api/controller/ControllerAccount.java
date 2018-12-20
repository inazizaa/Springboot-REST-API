package com.sti.inasapp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.inasapp.api.dao.AccountDao;
import com.sti.inasapp.api.dao.CustomerDao;
import com.sti.inasapp.api.model.Account;
import com.sti.inasapp.api.model.Customer;


@RestController
@RequestMapping("/account")
public class ControllerAccount {
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/get")
	public String acc(@RequestParam(value="id", defaultValue="") String id ) throws NumberFormatException, Exception{
			Account account = accountDao.getById(Integer.valueOf(id));
			try {
				if(account==null) {
				return "data tidak ada";
				}else {
				return "hello"+account.getBalance();
				}} catch(NumberFormatException e){
				return "salah format input";
			}catch (Exception e) {
					return String.format("terjadi kesalahan sistem: %s", e.getMessage());}
		}
	
	@PostMapping("/post")
	public Account accpost(@RequestBody Account account) throws Exception{
		Account ac = accountDao.save(account);
		return ac;
		}
	
	@PutMapping("/put")
	public Account iniput(@RequestBody Account account) throws Exception{
		Account ac = accountDao.save(account);
		return ac;
		}
	
	@DeleteMapping("/delete/{id}")
	public void deleted(@PathVariable ("id") int id) throws Exception{
		Account account = accountDao.getById(Integer.valueOf(id));
		if(account != null) {
			accountDao.delete(account);}	
	}	
	
	@GetMapping("/listnya")
	public List<Account> mygetlist() throws Exception{
		List<Account> list = accountDao.getList();
		return list;
	}
	
	@GetMapping(value="/list")
	public List<Account> getList(@RequestParam(name="customer", defaultValue="") String customer) throws NumberFormatException, Exception{
		if(!StringUtils.isEmpty(customer)) {
			Customer checkCustomer = customerDao.getById(Integer.parseInt(customer));
			if(checkCustomer==null) {
				throw new Exception("customer tidak ditemukan");
			}
			return accountDao.getListByCustomer(checkCustomer);
		}else {
			return accountDao.getList();
		}
	}

	}