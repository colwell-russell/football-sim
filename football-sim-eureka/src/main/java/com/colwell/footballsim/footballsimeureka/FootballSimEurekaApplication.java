package com.colwell.footballsim.footballsimeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FootballSimEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballSimEurekaApplication.class, args);
	}

}
