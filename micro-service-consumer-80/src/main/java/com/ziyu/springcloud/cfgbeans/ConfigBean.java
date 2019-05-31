package com.ziyu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//注解配置
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //Ribbon实现负载均衡的注解
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }
   /* @Bean
    public IRule myRule(){
        return new RandomRule();//随机
    }*/
}