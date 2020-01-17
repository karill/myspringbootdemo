package com.ygkj.mybatisplus.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hucong
 * @since 2020-01-17
 */
@TableName("tb_log")
public class TbLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 日期
     */
    private String date;
    /**
     * 详细信息
     */
    @TableField("msg_tion")
    private String msgTion;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMsgTion() {
        return msgTion;
    }

    public void setMsgTion(String msgTion) {
        this.msgTion = msgTion;
    }

    @Override
    public String toString() {
        return "TbLog{" +
        ", id=" + id +
        ", date=" + date +
        ", msgTion=" + msgTion +
        "}";
    }
}
