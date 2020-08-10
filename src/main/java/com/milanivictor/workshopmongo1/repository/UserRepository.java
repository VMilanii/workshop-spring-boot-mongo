package com.milanivictor.workshopmongo1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.milanivictor.workshopmongo1.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	
	
	
}
