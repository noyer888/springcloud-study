package com.noyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 17:19 2018/4/17
 */
@SpringBootApplication
public class MovieConsumerStarter {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(MovieConsumerStarter.class, args);
    }
}
