package com.ih2ome.hystrixdashboardturbineconsumernode01.controller;

import com.ih2ome.hystrixdashboardturbineconsumernode01.producerInterface.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sky
 * create 2018/10/22
 * email sky.li@ixiaoshuidi.com
 **/
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
