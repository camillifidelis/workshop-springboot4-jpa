package com.camillifidelis.webservicesjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camillifidelis.webservicesjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
