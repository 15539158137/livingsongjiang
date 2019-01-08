package com.dxxx.livingsongjiang.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnGetUserMess extends BaseBean{
    @JsonProperty
    private UserBean Data;
    @JsonIgnore
    public UserBean getData() {
        return Data;
    }

    public void setData(UserBean data) {
        this.Data = data;
    }
}
