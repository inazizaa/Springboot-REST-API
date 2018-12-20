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

import com.sti.inasapp.api.dao.CustomerDao;

import com.sti.inasapp.api.model.Customer;

@RestController
@RequestMapping("/customer")
public class TestController {

	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping("/get")
	public String hello(@RequestParam(value="id", defaultValue="") String id) {
		try {
			Customer customer = customerDao.getById(Integer.valueOf(id));
			if(customer==null) {
				return "data tidak ditemukan";
			}else {
				return "hello" +customer.getFirstName();
			}
		} catch(NumberFormatException e) {
			return "salah format input";
		}catch (Exception e) {
			return String.format("terjadi kesalahan sistem: %s", e.getMessage());
			}
	}
	
	@PostMapping("/post")
	public Customer post(@RequestBody Customer customer) throws Exception{
		Customer cs = customerDao.save(customer);
		return cs;
	}
	
	@PutMapping("/put")
	public Customer iniput(@RequestBody Customer customer) throws Exception{
		Customer cs = customerDao.save(customer);
		return cs;
		}
	
	@DeleteMapping("/hello/{id}")
	public void deleted(@PathVariable ("id") int id) throws Exception{
		Customer customer = customerDao.getById(Integer.valueOf(id));
		if(customer != null) {
		customerDao.delete(customer);}
	}	
	
	@GetMapping("/list")
	public List<Customer> mygetlist() throws Exception{
		List<Customer> list = customerDao.getList();
		return list;
	}
}
