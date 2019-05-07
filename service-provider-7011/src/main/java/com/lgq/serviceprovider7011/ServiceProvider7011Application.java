package com.lgq.serviceprovider7011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider7011Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider7011Application.class, args);
    }

}
