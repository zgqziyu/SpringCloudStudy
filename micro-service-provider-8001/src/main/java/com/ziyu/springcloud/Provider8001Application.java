package com.ziyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * \* User: ziyu
 * \* Date: 2019/5/30
 * \* Time: 9:49
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Provider8001Application {
    public static void main(String[] args) {

        SpringApplication.run(Provider8001Application.class,args);
    }
}
