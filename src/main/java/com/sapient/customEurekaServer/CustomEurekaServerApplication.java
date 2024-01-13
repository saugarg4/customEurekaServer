package com.sapient.customEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CustomEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomEurekaServerApplication.class, args);
	}

}
