package com.ziyu.springcloud;

import com.ziyu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * \* User: ziyu
 * \* Date: 2019/5/30
 * \* Time: 14:04
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableEurekaClient
//在启动微服务时，加载自定义的Ribbon配置类
@RibbonClient(name = "ZIYU-SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class ApplicationMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain80.class,args);
    }
}
