package com.digitalinnovationone.heroes.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
@EnableDynamoDBRepositories

public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		System.out.println("super poderes com webflux");

	}

}
