package com.camillifidelis.webservicesjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.camillifidelis.webservicesjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
