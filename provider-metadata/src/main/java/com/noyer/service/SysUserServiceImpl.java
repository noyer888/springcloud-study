package com.noyer.service;

import com.noyer.dao.SysUserDao;
import com.noyer.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:15 2018/4/17
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public SysUser queryById(Long id) {
        return sysUserDao.queryById(id);
    }
}
