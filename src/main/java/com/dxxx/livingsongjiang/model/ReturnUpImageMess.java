package com.dxxx.livingsongjiang.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnUpImageMess extends BaseBean{
    @JsonProperty
    private String Data;
    @JsonIgnore
    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }
}
