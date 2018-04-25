package com.noyer.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:09 2018/4/17
 */
@Getter
@Setter
public class SysUser {
    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
