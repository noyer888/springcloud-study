package com.noyer.dao;

import com.noyer.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @author DengTianYou
 * @version 1.0.0
 * @description
 * @date Created in 15:10 2018/4/17
 */
@Repository
public interface SysUserDao {

    /**
     * @description 通过id查找SysUser
     * @param id
     * @return SysUser
     */
    SysUser queryById(Long id);
}
