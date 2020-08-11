package com.milanivictor.workshopmongo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milanivictor.workshopmongo1.domain.User;
import com.milanivictor.workshopmongo1.dto.UserDTO;
import com.milanivictor.workshopmongo1.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired //o propio springa instacia o obj 
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	/*
	
	public User findById(String id) {
		User user = repo.findOne(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
			
		}
		return user;
	}
	
	*/
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	
	
	public void delete(String id) {
		repo.deleteById(id);
	}
	
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getEmail(), objDto.getName());
	}
	
	
	
	
}
 