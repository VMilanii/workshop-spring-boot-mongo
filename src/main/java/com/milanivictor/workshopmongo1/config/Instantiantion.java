package com.milanivictor.workshopmongo1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.milanivictor.workshopmongo1.domain.User;
import com.milanivictor.workshopmongo1.repository.UserRepository;

@Configuration
public class Instantiantion  implements CommandLineRunner{

	@Autowired
	private UserRepository userReposiroty;
	
	
	@Override
	public void run(String... args) throws Exception {
	
		userReposiroty.deleteAll();
		
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "alex green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		
		
	}

}
