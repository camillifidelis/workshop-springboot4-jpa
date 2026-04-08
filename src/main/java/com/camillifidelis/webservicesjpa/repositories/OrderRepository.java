package com.camillifidelis.webservicesjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camillifidelis.webservicesjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
