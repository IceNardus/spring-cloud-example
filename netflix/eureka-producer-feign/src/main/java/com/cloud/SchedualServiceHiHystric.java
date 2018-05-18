package com.cloud;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA
 * Created By IceSnow
 * Date: 5/11/2018
 * Time: 2:48 PM
 */
@Component
public class SchedualServiceHiHystric implements HelloRemote{

    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}
