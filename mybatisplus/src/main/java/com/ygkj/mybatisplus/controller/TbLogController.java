package com.ygkj.mybatisplus.controller;


import com.ygkj.mybatisplus.model.TbLog;
import com.ygkj.mybatisplus.service.TbLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@Controller
@RequestMapping("/tbLog")
public class TbLogController {
    @Autowired
    private TbLogService tbLogService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public Object getEmployees() {
        List<TbLog> tbLogs = tbLogService.selectList(null);
        return tbLogs;
    }
}

