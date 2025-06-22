package com.example.spring.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.spring.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customer;
	}

}
