package com.cloud;

import org.springframework.beans.factory.annotation.Value;
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
public class HelloController {

    @Value("${server.port:0}")
    private int port;

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return "[" + port + "]" + "Hello, " + name + " " + new Date();
    }

}
