package com.ih2ome.springcloudEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sky
 * create 2018/10/17
 * email sky.li@ixiaoshuidi.com
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaOneApplication.class, args);
    }
}
