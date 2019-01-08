package com.dxxx.livingsongjiang.control;

import com.dxxx.livingsongjiang.model.ReturnGetUserMess;
import com.dxxx.livingsongjiang.model.SanHuBean;
import com.dxxx.livingsongjiang.model.UserBean;
import com.dxxx.livingsongjiang.service.UserService;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/UserControl")
public class UserControl {
    @Autowired
    private UserService userService;
    /**
     * 登录的方法，得到account和token
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //如果前端传的名字不一样@RequestParam("account") 表示解析为name
    public ReturnGetUserMess login(@RequestParam String name, @RequestParam("pwd") String pass) {
        SanHuBean sanHuBean=new SanHuBean();
        sanHuBean.setM_afterbximg("123");
        System.out.print("\n"+new GsonBuilder().create().toJson(sanHuBean)+"\n");
        return userService.loginBySql(name,pass);
    }
}
