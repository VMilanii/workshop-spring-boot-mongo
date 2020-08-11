package com.milanivictor.workshopmongo1.resouces;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.milanivictor.workshopmongo1.domain.User;
import com.milanivictor.workshopmongo1.dto.UserDTO;
import com.milanivictor.workshopmongo1.service.UserService;

@RestController
@RequestMapping(value="/users")

public class UserResource { //recurso rest

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET) //metodo get para obter informações no padrao rest
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> list = service.findAll();

		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(listDto); //no corpo da resposta vai ter a Lista
		
	}
	
	/*
	
	@RequestMapping(value="/{id}, method=RequestMethod.GET) //metodo get para obter informações no padrao rest
	public ResponseEntity<UserDTO> findById(@PathVariable String id(){
		
		User obj = service.findById(id);
		return ResponseEntity.ok().body(new UserDTO(obj));
		
	}
	
	*/
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody UserDTO objDto){
		
		User obj = service.fromDTO(objDto);
		obj = service.insert(obj); // inseriu no banco
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	
	
}
