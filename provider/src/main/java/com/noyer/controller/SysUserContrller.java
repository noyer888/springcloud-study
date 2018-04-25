package com.noyer.controller;

import com.noyer.entity.SysUser;
import com.noyer.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:16 2018/4/17
 */
@RestController
public class SysUserContrller {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{id}")
    public SysUser findById(@PathVariable Long id){
        SysUser user = sysUserService.queryById(id);
        return user;
    }
}
