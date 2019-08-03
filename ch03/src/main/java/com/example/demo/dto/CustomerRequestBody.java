package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequestBody {
	
	@JsonProperty("customerId")
	public String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CustomerRequestBody [customerId=" + customerId + "]";
	}
}
