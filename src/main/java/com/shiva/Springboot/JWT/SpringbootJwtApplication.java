package com.shiva.Springboot.JWT;

import com.shiva.Springboot.JWT.model.Role;
import com.shiva.Springboot.JWT.model.User;
import com.shiva.Springboot.JWT.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories
public class SpringbootJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER", "this is user"));
			userService.saveRole(new Role(null,"ROLE_ADMIN", "this is admin"));
			userService.saveRole(new Role(null,"ROLE_MANAGER", "this is manager"));


			userService.saveUser(new User("6601234789","shiva","shiva@gmail.com","pass",new HashSet<>()));
			userService.saveUser(new User("6601234789","shiva1","shiva1@gmail.com","pass",new HashSet<>()));
			userService.saveUser(new User("6601234789","shiva2","shiva2@gmail.com","pass",new HashSet<>()));

			userService.addToUser("shiva@gmail.com","ROLE_USER");
			userService.addToUser("shiva1@gmail.com","ROLE_ADMIN");
			userService.addToUser("shiva2@gmail.com","ROLE_MANAGER");
		};
	}
}
