package com.ygkj.mybatisplus.service.impl;

import com.ygkj.mybatisplus.model.TbLog;
import com.ygkj.mybatisplus.dao.TbLogMapper;
import com.ygkj.mybatisplus.service.TbLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@Service
public class TbLogServiceImpl extends ServiceImpl<TbLogMapper, TbLog> implements TbLogService {

    @Resource
    private TbLogMapper tbLogMapper;

    @Override
    public List<TbLog> selAll() {
        return tbLogMapper.selAll();
    }
}
