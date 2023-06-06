package com.josefernandes.jfdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josefernandes.jfdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
