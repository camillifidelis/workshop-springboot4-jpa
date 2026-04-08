package com.camillifidelis.webservicesjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camillifidelis.webservicesjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
