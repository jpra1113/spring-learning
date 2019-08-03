package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CustomerRequest;
import com.example.demo.dto.CustomerResponse;

@RestController
public class CustomerController {
	
	@Value("${cust.url}")
	public String custApiUrl;
	
	@PostMapping(value = "/cust", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public CustomerResponse cust(@RequestBody CustomerRequest request) {
		return new RestTemplate().postForObject(custApiUrl, request, CustomerResponse.class);
	}
}
