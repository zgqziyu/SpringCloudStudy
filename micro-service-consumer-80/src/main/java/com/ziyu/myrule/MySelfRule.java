package com.ziyu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
       // return new RandomRule(); //随机负载均衡
        return new RandomRule_LW();
    }
}