package com.lgq.cloudzuul7031;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CloudZuul7031Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuul7031Application.class, args);
    }

}
