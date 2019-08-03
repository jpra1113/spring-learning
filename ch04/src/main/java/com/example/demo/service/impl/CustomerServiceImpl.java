package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.respository.CustomerRespository;
import com.example.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerRespository customerRespository;

	@Override
	public Customer findByCustomerId(String customerId) {
		return customerRespository.findById(customerId).get();
	}
}
