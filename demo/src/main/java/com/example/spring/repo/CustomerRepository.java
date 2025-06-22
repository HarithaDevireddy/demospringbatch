package com.example.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
