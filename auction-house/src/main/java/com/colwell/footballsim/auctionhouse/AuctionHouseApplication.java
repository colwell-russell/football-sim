package com.colwell.footballsim.auctionhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AuctionHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionHouseApplication.class, args);
	}

}
