package com.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Created By IceSnow
 * Date: 5/18/2018
 * Time: 1:44 PM
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name + "!");
    }
}
