package com.example.demo.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerResponseBody {
	
	@JsonProperty("customerId")
	public String customerId;
	
	@JsonProperty("name")
	public String name;
	
	@JsonProperty("age")
	public BigDecimal age;
	
	@JsonProperty("tel")
	public String tel;
	
	@JsonProperty("addr")
	public String addr;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "CustomerResponseBody [customerId=" + customerId + ", name=" + name + ", age=" + age + ", tel=" + tel
				+ ", addr=" + addr + "]";
	}
}
