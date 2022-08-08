package com.skachkov.monolecs;

import com.skachkov.monolecs.generator.DataGenerator;
import com.skachkov.monolecs.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonolecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonolecsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(DataGenerator dataGenerator) throws Exception {
		return (String[] args) -> {
			dataGenerator.generateUsers();
		};
	}

}
