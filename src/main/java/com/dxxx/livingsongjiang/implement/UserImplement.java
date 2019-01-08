package com.dxxx.livingsongjiang.implement;

import com.dxxx.livingsongjiang.jpa.UserJpa;
import com.dxxx.livingsongjiang.model.ReturnGetUserMess;
import com.dxxx.livingsongjiang.model.UserBean;
import com.dxxx.livingsongjiang.service.UserService;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserService")
public class UserImplement implements UserService {
    @Autowired
    UserJpa userJpa;

    @Override
    public ReturnGetUserMess login(String phone, String password) {
        System.out.print(password + "===" + phone + "\n");
        ReturnGetUserMess returnGetUserMess = new ReturnGetUserMess();
        String message = "";
        List<UserBean> all = userJpa.findAll();
        System.out.print(new GsonBuilder().create().toJson(all));
        UserBean userBean = null;
        int status = 0;
        if (all == null || all.size() == 0) {
            status = 0;
            message = "登录失败：无数据";
        } else {
            boolean hadThis = false;
            for (UserBean userBean1 : all) {
                System.out.print(new GsonBuilder().create().toJson(userBean1));
                System.out.print(userBean1.getU_id() + "==" + userBean1.getU_userName() + "===" + userBean1.getU_pwd() + "\n");
                if (userBean1.getU_userName().equals(phone)) {
                    hadThis = true;
                    //找到了
                    if (userBean1.getU_pwd().equals(password)) {
                        userBean = userBean1;
                        message = "登录成功";
                        status = 1;
                    } else {
                        userBean = null;
                        message = "密码错误";
                        status = 0;
                    }
                }
            }
            if (!hadThis) {
                userBean = null;
                message = "尚未注册!";
                status = 0;
            }
        }
        returnGetUserMess.setData(userBean);
        returnGetUserMess.setStatu(status);
        returnGetUserMess.setMsg(message);


        return returnGetUserMess;
    }

    @Override
    public ReturnGetUserMess loginBySql(String phone, String password) {
        System.out.print("\n"+phone+"=="+password+"\n");
        ReturnGetUserMess returnGetUserMess = new ReturnGetUserMess();
        String message = "";
        int status = 0;
        UserBean userBean = null;
        if (userJpa.boolIsExist(phone) == 0) {
            message = "账号不存在";
        } else {
            for (UserBean userBean1 : userJpa.findByPhone(phone)) {
                if (userJpa.findByPhone(phone).get(0).getU_pwd().equals(password)) {
                    userBean = userBean1;
                    System.out.print(new GsonBuilder().create().toJson(userBean1));
                    message = "登录成功";
                    status = 1;
                } else {
                    message = "密码错误";
                }
            }
        }
        returnGetUserMess.setData(userBean);
        returnGetUserMess.setStatu(status);
        returnGetUserMess.setMsg(message);
        System.out.print(new GsonBuilder().create().toJson(returnGetUserMess));
        return returnGetUserMess;
    }
}
