package com.ih2ome.springcloudconfigconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigConsumeApplication.class, args);
	}

}
