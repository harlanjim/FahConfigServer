package com.fah.enterprises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FahConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FahConfigServerApplication.class, args);
	}

}
