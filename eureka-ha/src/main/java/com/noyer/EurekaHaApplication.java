package com.noyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 9:02 2018/4/23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class, args);
    }
}
