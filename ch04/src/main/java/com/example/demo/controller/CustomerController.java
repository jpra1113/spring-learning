package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CommonHeader;
import com.example.demo.dto.CustomerRequest;
import com.example.demo.dto.CustomerResponse;
import com.example.demo.dto.CustomerResponseBody;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	@PostMapping(value = "/cust", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public CustomerResponse hello(@RequestBody CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		CustomerResponseBody responseBody = new CustomerResponseBody();
		
		CommonHeader header = new CommonHeader();
		BeanUtils.copyProperties(request.getHeader(), header);
		response.setHeader(header);
		
		Customer customer = customerService.findByCustomerId(request.getBody().getCustomerId());
		
		responseBody.setCustomerId(request.getBody().getCustomerId());
		responseBody.setName(customer.getName());
		responseBody.setTel(customer.getTel());
		responseBody.setAddr(customer.getAddr());
		responseBody.setAge(customer.getAge());
		
		response.setBody(responseBody);
		
		return response;
	}
}
