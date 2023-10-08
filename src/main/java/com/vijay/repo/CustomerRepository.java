package com.vijay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vijay.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
