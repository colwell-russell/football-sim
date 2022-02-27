package com.colwell.footballsim.footballsimconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FootballSimConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballSimConfigApplication.class, args);
	}

}
