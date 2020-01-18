package com.ygkj.mybatisplus.service.impl;

import com.ygkj.mybatisplus.model.User;
import com.ygkj.mybatisplus.dao.UserMapper;
import com.ygkj.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
