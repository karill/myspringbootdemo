package com.ygkj.mybatisplus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ygkj.mybatisplus.model.TbLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@Mapper
public interface TbLogMapper extends BaseMapper<TbLog> {

    List<TbLog> selAll();
}
