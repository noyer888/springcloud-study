package com.noyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:49 2018/4/25
 */
@EnableEurekaClient
@SpringBootApplication
public class MovieConsumerEuStarter {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieConsumerEuStarter.class, args);
    }
}
