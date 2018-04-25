package com.noyer.service;

import com.noyer.entity.SysUser;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:15 2018/4/17
 */
public interface SysUserService {
    SysUser queryById(Long id);
}
