package com.lgq.serviceconsumer7021.FeignInterface;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello"+name+",wrong service";
    }

}
