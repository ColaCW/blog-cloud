package com.lgq.serviceprovider7012;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider7012Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider7012Application.class, args);
    }

}
