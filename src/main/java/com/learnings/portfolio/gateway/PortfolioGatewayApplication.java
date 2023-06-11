package com.learnings.portfolio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class PortfolioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioGatewayApplication.class, args);
	}

}
