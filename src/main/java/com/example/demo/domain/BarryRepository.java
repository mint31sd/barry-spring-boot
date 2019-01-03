package com.example.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class BarryRepository {

    private Integer id;
    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    //禁用序列化
//    @JSONField(serialize = false)
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
