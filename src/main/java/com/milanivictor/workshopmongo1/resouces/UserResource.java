package com.milanivictor.workshopmongo1.resouces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.milanivictor.workshopmongo1.domain.User;

@RestController
@RequestMapping(value="/users")

public class UserResource { //recurso rest

	
	@RequestMapping(method=RequestMethod.GET) //metodo get para obter informações no padrao rest
	
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("maria@gmail.com", "Maria Silva", "1");
		User alex = new User("alex@gmail.com", "alex", "2");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		
		return ResponseEntity.ok().body(list); //no corpo da resposta vai ter a Lista
		
	}
	
	
	
	
	
}