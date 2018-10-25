package com.ih2ome.springcloudeurekaproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sky
 * create 2018/10/22
 * email sky.li@ixiaoshuidi.com
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String index(@RequestParam String name) {
        return "hello" + name + ", this is first messge";
    }
}
