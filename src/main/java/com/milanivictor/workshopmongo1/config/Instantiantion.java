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
		
		
		User maria = new User("maria@gmail.com", "Maria Brown",null );
		User alex = new User("alex@gmail.com", "alex green", null );
		User bob = new User("bob@gmail.com", "Bob Grey", null);
		
		userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		
		
	}

}
