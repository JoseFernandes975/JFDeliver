package com.josefernandes.jfdeliver.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josefernandes.jfdeliver.dtos.OrderWithProductsDTO;
import com.josefernandes.jfdeliver.entities.Order;
import com.josefernandes.jfdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional
	public List<OrderWithProductsDTO> findAll(){
		List<Order> result = repository.findOrderWithProducts();
		return result.stream().map(x -> new OrderWithProductsDTO(x)).toList();
	}

}
