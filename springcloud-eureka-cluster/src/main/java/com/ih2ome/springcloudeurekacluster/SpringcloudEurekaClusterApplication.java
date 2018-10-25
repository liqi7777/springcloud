package com.ih2ome.springcloudeurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaClusterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaClusterApplication.class, args);
	}
}
