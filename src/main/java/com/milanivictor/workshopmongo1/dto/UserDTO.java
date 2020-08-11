package com.milanivictor.workshopmongo1.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.milanivictor.workshopmongo1.domain.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String name;
	private String id;
	
	public UserDTO() {
		
	}
	
	public  UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
}
