package com.noyer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:40 2018/4/25
 */
@EnableEurekaClient
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.noyer.dao")
public class ProviderEuStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProviderEuStarter.class, args);
    }
}
