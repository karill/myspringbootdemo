package com.ygkj.mybatisplus.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ygkj.mybatisplus.model.TbLog;
import com.ygkj.mybatisplus.service.TbLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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

    //查全部
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object getEmployees() {
        List<TbLog> tbLogs = tbLogService.selectList(null);
        return tbLogs;
    }

    //根据主键查找
    @RequestMapping(value = "/getTbLogById/{id}")
    @ResponseBody
    public TbLog getTbLogById(@PathVariable("id") int id){
        TbLog tbLog = tbLogService.selectById(id);
        return tbLog;
    }

    //修改数据
    @RequestMapping(value = "/updateTbLog/{id}")
    @ResponseBody
    public Object updateTbLog(@PathVariable("id") int id, @RequestParam(value = "date", required = false) String date,
                                 @RequestParam(value = "msgTion", required = true) String msgTion ) {
        TbLog tbLog = new TbLog();
        tbLog.setId(id);
        if (StringUtils.isNotBlank(date)) {
            tbLog.setDate(date);
        }
        if (StringUtils.isNotBlank(msgTion)) {
            tbLog.setMsgTion(msgTion);
        }

        boolean b = tbLogService.updateById( tbLog );

        if (b) {
            return "update success";
        } else {
            return "update fail";
        }

    }

    //保存
    @RequestMapping(value = "saveTbLog")
    @ResponseBody
    public Object saveTbLog(@RequestParam(value = "date", required = true) String date,
                            @RequestParam(value = "msgTion", required = true) String msgTion) {

        TbLog tbLog = new TbLog();
        tbLog.setDate(date);
        tbLog.setMsgTion(msgTion);
//        boolean b = tbLogService.insert(tbLog);

        boolean b = tbLogService.insertOrUpdate(tbLog);

        if(b) {
            return "sava success";
        }else {
            return "sava fail";
        }

    }

    //逻辑删除
    @RequestMapping(value = "/delLogical/{id}")
    @ResponseBody
    public Object delLogical(@PathVariable("id") int id) {
        TbLog tbLog = new TbLog();
        tbLog.setId(id);
        tbLog.setMsgTion("123");

        boolean b = tbLogService.insertOrUpdate(tbLog);
        if(b) {
            return "sava success";
        }else {
            return "sava fail";
        }
    }

    //分页查找
    @RequestMapping(value = "/selectPage")
    @ResponseBody
    public Object selectPage( Page<TbLog> page ) {
        EntityWrapper query = new EntityWrapper();
//        query.where("msg_tion","sdsfgsdf");
        query.like("msg_tion","sd");
        query.eq("id",209);
        query.orderBy("id",page.isAsc());
        System.out.println(query.getSqlSegment());
        int i = tbLogService.selectCount(query);//总数
        Page page1 = tbLogService.selectPage(page, query);//记录page
        List records = page1.getRecords();
        return records;
    }


    @RequestMapping(value = "/testMappper")
    @ResponseBody
    public Object testMappper(  ) {
        List<TbLog> list = tbLogService.selAll();

        return list;
    }
}

