package com.example.boot.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(scanBasePackages={"com.example.boot.entities","com.example.boot.repositories","com.example.boot.controller"})
@SpringBootApplication
@ComponentScan(basePackages= {"com.example.boot.controller" , "com.example.boot.services"})
@EntityScan("com.example.boot.entities")
@EnableJpaRepositories(basePackages= {"com.example.boot.repositories"})
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
