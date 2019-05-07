package com.lgq.serviceconsumer7021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ServiceConsumer7021Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer7021Application.class, args);
    }

}
