package com.example.CartApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CartApplication.Repository.orderRepository;
import com.example.CartApplication.model.Customer;


@Service
public class AdminService {
	@Autowired
	private orderRepository orderrepository;

	public void customerOrder(Customer customer) {
		orderrepository.save(customer);
		
	}

}

