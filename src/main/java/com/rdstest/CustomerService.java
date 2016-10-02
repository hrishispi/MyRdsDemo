package com.rdstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	public Customer createCustomer(Customer customer) throws Exception{
		customer = customerDao.save(customer);
		if(customer.getCustomerId()==null || customer.getCustomerId()==0){
			throw new Exception("Failed to create user");
		}
		return customer;
		
	}
}
