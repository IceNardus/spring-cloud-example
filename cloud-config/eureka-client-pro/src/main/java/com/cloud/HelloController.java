package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By IceSnow
 * Date: 5/18/2018
 * Time: 2:27 PM
 */
@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Value("${server.port:0}")
    private int port;

    @Value("${dev.name}")
    private String names;

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "[" + port + "]" + "Hello, " + name + " " + new Date();
    }


    @GetMapping("/name")
    public String name() {
        return "[" + names + "]" + "Hello";
    }
}
