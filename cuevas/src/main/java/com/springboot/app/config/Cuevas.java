package com.springboot.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.springboot.app.controllers","com.springboot.app.service","com.springboot.app.dao","com.springboot.app.config"})
@EnableJpaRepositories(basePackages= {"com.springboot.app.dao"})
@EntityScan(basePackages = {"com.springboot.app.entity"})
@SpringBootApplication


public class Cuevas {

	public static void main(String[] args) {
		SpringApplication.run(Cuevas.class, args);
	}

}
