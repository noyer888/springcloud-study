package com.noyer.controller;

import com.noyer.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 17:24 2018/4/17
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.user-service-url}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public SysUser findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(this.userServiceUrl + id, SysUser.class);
    }
}
