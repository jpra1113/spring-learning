package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CommonHeader;
import com.example.demo.dto.CustomerRequest;
import com.example.demo.dto.CustomerResponse;
import com.example.demo.dto.CustomerResponseBody;

@RestController
public class CustomerController {
	
	@PostMapping(value = "/cust", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public CustomerResponse hello(@RequestBody CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		CustomerResponseBody responseBody = new CustomerResponseBody();
		
		CommonHeader header = new CommonHeader();
		BeanUtils.copyProperties(request.getHeader(), header);
		response.setHeader(header);
		
		responseBody.setCustomerId(request.getBody().getCustomerId());
		responseBody.setName("Alan");
		responseBody.setTel("0912345678");
		responseBody.setAddr("地址");
		responseBody.setAge(BigDecimal.valueOf(20));
		
		response.setBody(responseBody);
		
		return response;
	}
}
