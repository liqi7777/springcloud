package com.ih2ome.hystrixdashboardturbineconsumernode02.producerInterface;

import com.ih2ome.hystrixdashboardturbineconsumernode02.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Sky
 * create 2018/10/22
 * email sky.li@ixiaoshuidi.com
 **/
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
