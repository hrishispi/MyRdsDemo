package com.rdstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(path="/createCustomer",method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) throws Exception{
		return customerService.createCustomer(customer);
	}
}
