package com.mytests.spring.mvcMultiModule.jpa.repositories;

import com.mytests.spring.mvcMultiModule.jpa.JpaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JpaConfig.class)
public class SpringbootMvcMultimoduleApplication implements CommandLineRunner {
	@Autowired PositionsService positionsServiceservice;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcMultimoduleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 positionsServiceservice.testResults();
		 positionsServiceservice.customQueryTest();
	}
}
