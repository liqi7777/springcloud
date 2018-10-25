package com.ih2ome.springcloudconsumerhystrixdashboard.hystrix;

import com.ih2ome.springcloudconsumerhystrixdashboard.producerInterface.HelloRemote;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Sky
 * create 2018/10/23
 * email sky.li@ixiaoshuidi.com
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name + ", this messge send failed ";
    }
}
