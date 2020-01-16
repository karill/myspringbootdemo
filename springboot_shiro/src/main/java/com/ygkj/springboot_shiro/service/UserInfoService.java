package com.ygkj.springboot_shiro.service;

import com.ygkj.springboot_shiro.model.User;

/**
 * @author hu cong
 * @date 2020/1/14 12:39
 * @Description:
 */
public interface UserInfoService {

    /**通过username查找用户信息;*/
    public User getUserByName(String username);
}
