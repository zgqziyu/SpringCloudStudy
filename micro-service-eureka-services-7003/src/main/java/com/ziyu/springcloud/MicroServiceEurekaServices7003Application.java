package com.ziyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEurekaServices7003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceEurekaServices7003Application.class, args);
    }

}
