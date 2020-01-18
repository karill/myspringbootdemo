package com.ygkj.mybatisplus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ygkj.mybatisplus.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
