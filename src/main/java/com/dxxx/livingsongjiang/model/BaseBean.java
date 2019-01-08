package com.dxxx.livingsongjiang.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

public class BaseBean {
    @JsonProperty(value = "Statu")//不加后面的括号表示按原来的名字区分大小写并序列化再加括号表示序列化的时候的字段名字
    private int Statu;
    @JsonProperty
    private String Msg;


    @JsonIgnore//不加这个注解会出现json里面同时有大小写区分的和大小写不区分的
    public int getStatu() {
        return Statu;
    }

    public void setStatu(int statu) {
        Statu = statu;
    }
    @JsonIgnore
    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }
}
