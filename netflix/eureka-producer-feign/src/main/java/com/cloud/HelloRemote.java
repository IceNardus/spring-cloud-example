package com.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA
 * Created By IceSnow
 * Date: 5/18/2018
 * Time: 1:41 PM
 */
@FeignClient(name = "eureka-client-pro",fallback = SchedualServiceHiHystric.class)
public interface HelloRemote {
    @RequestMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
