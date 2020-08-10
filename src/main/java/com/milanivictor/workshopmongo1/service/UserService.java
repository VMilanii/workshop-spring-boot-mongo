package com.milanivictor.workshopmongo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milanivictor.workshopmongo1.domain.User;
import com.milanivictor.workshopmongo1.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired //o propio springa instacia o obj 
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}
	
	
}
