package com.vijay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.dto.CustomerDto;
import com.vijay.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	@PostMapping("/register")
	public  void register (@RequestBody CustomerDto customerDto)
	{
	    //service.register(customerDto);
		this.service.register(customerDto);
	}
	
}
