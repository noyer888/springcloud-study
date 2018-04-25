package com.noyer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:08 2018/4/17
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.noyer.dao")
@EnableDiscoveryClient
public class ProviderMetadataStarter {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMetadataStarter.class, args);
    }
}
