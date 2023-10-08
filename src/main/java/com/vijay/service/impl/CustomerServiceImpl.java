package com.vijay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.dto.CustomerDto;
import com.vijay.entity.CustomerEntity;
import com.vijay.repo.CustomerRepository;
import com.vijay.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	@Override
	public void register(CustomerDto customerDto) {
		
		CustomerEntity customerEntity = new  CustomerEntity();
		customerEntity.setId(customerDto.getId());
		customerEntity.setName(customerDto.getName());
		customerEntity.setEmail(customerDto.getEmail());
		customerEntity.setDepartment(customerDto.getDepartment());
		customerEntity.setCity(customerDto.getCity());
        repo.save(customerEntity);
	}


}
