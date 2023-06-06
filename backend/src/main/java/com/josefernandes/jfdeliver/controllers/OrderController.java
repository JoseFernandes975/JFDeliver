package com.josefernandes.jfdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josefernandes.jfdeliver.dtos.OrderWithProductsDTO;
import com.josefernandes.jfdeliver.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService services;
	
	@GetMapping
	public ResponseEntity<List<OrderWithProductsDTO>> findAll(){
		List<OrderWithProductsDTO> dtos = services.findAll();
		return ResponseEntity.ok().body(dtos);
	}
	
	
}
