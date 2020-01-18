package com.ygkj.mybatisplus.service;

import com.ygkj.mybatisplus.model.TbLog;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
public interface TbLogService extends IService<TbLog> {

    List<TbLog> selAll();

}
