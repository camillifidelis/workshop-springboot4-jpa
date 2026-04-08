package com.camillifidelis.webservicesjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camillifidelis.webservicesjpa.entities.OrderItem;
import com.camillifidelis.webservicesjpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
} 