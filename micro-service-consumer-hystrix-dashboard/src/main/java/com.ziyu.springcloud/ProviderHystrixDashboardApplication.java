package com.ziyu.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * \* User: ziyu
 * \* Date: 2019/6/4
 * \* Time: 9:49
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ProviderHystrixDashboardApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProviderHystrixDashboardApplication.class,args);
    }

}
