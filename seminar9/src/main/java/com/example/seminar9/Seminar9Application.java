package com.example.seminar9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Seminar9Application {

	public static void main(String[] args) {

		SpringApplication.run(Seminar9Application.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Microservice1", r -> r.path("/serviceA/**")
						.uri("http://localhost:8081/"))
				.route("Microservice2", r -> r.path("/serviceB/**")
						.uri("http://localhost:8082/")).build();
	}

}
