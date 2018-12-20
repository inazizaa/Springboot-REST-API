//package com.sti.inasapp;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//	@RestController
//	@RequestMapping("/test")
//	public class InasappController{
//		
////		@GetMapping("/hello")
////		public String hello() {
////			return "Hellow";
////		}
////		
////		@GetMapping("/hello")
////		public String hello(@RequestParam("data") String data) {
////			return "hello "+data;}
////		
////		@GetMapping("/hello{data}")
////		public String helloPathVariable (@PathVariable("data") String data) {
////			return "hello "+data;}
////	
////	@PostMapping("/hello")
////	public String hello(@RequestBody Customer customer) {
////		return "hello "+ customer.getFirstName();
////	}
////	
//	
//	@GetMapping("/customer/{customerNumber}")
//		public String helloPathVariable(@PathVariable("customerNumber") String customerNumber) {
//			return "customer" + customerNumber;
//		}
//	
//	@PostMapping("/customer")
//		public Customer post(@RequestParam ("firstName") String customer) {
//		Customer cs = new Customer();
//		cs.setFirstName(customer);
//		return cs;
//	}
//	
//	@PutMapping("/customer")
//		public Customer update(@RequestBody Customer customer) {
//		customer.setCustomerNumber(100);
//		return customer;
//	}
//	
//	
//	@DeleteMapping("/customer/{data}")
//		public Customer delete(@PathVariable("data")int customernumber ) {
//		Customer cs = new Customer();
//		cs.setCustomerNumber(customernumber);
//		return cs;
////		cs.setIdCustomer(Integer.parseInt((idCustomer)); untuk parse dari string ke int
//	}
//	
//	
//	//5
//	
//	@GetMapping("/customers")
//	
//	   public List<Customer> list() {
//		Customer cs = new Customer();
//		cs.setCustomerNumber(12345);
//		cs.setFirstName("inas");
//		cs.setLastName("azizah");
//		
//	    ArrayList<Customer> list = new ArrayList();
//	    list.add(cs);
//	    return list;
//	}
//	
//	
//	}