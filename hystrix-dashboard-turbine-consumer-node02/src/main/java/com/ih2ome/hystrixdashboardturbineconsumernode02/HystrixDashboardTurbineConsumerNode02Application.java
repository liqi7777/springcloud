package com.ih2ome.hystrixdashboardturbineconsumernode02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class HystrixDashboardTurbineConsumerNode02Application {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardTurbineConsumerNode02Application.class, args);
	}
}
