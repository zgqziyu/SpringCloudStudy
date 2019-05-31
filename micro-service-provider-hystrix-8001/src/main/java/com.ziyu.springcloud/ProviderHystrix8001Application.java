package com.ziyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
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
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderHystrix8001Application {
    public static void main(String[] args) {

        SpringApplication.run(Provider8001Application.class,args);
    }
}
