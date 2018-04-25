package com.noyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 14:07 2018/4/25
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAuthApplication.class, args);
    }
}
