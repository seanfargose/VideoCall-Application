package com.seanfargose.videocall;

import com.seanfargose.videocall.user.User;
import com.seanfargose.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Rohit")
							.email("rohit@mail.com")
							.password("aaa")
					.build());

			service.register(User.builder()
					.username("Sachin")
					.email("sachin@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Smriti")
					.email("smriti@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Virat")
					.email("virat@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Bhumra")
					.email("bhumra@mail.com")
					.password("aaa")
					.build());
		};
	}

}
