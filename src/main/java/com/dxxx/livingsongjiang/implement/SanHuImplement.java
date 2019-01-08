package com.dxxx.livingsongjiang.implement;

import com.dxxx.livingsongjiang.jpa.SanHuJpa;
import com.dxxx.livingsongjiang.jpa.UserJpa;
import com.dxxx.livingsongjiang.model.ReturnSanHuMess;
import com.dxxx.livingsongjiang.model.SanHuBean;
import com.dxxx.livingsongjiang.service.SanHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("SanHuService")
public class SanHuImplement implements SanHuService {
    @Autowired
    SanHuJpa sanHuJpa;

    @Override
    public ReturnSanHuMess upLoadData(SanHuBean sanHuBean) {
        SanHuBean sanHuBean1 = sanHuJpa.saveAndFlush(sanHuBean);
        ReturnSanHuMess returnSanHuMess = new ReturnSanHuMess();
        String mess = "";
        int stute = 0;
        if (sanHuBean1.getM_id() == 0) {
            //插入失败
            mess = "异常";
        } else {
            mess = "保存成功";
            stute = 1;
        }
        returnSanHuMess.setMsg(mess);
        returnSanHuMess.setStatu(stute);
        return returnSanHuMess;
    }
}
