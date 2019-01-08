package com.dxxx.livingsongjiang.service;

import com.dxxx.livingsongjiang.model.ReturnGetUserMess;

public interface UserService {
    public ReturnGetUserMess login(String phone,String password);
    public ReturnGetUserMess loginBySql(String phone,String password);
}
