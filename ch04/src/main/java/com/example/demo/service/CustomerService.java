package com.example.demo.service;

import com.example.demo.entity.Customer;

public interface CustomerService {

	Customer findByCustomerId(String customerId);
}
