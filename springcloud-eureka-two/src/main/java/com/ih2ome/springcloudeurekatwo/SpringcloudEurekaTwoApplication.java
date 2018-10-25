package com.ih2ome.springcloudeurekatwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaTwoApplication.class, args);
	}
}
