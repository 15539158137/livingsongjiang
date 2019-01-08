package com.dxxx.livingsongjiang.control;

import com.dxxx.livingsongjiang.model.ReturnSanHuMess;
import com.dxxx.livingsongjiang.model.SanHuBean;
import com.dxxx.livingsongjiang.service.SanHuService;
import com.dxxx.livingsongjiang.service.UserService;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@RestController
@RequestMapping(value = "/SanHuControl")
public class SanHuControl {
    @Autowired
    private SanHuService sanHuService;

    /**
     * 接受json
     *
     * @param sanHuBean
     * @return
     */
    @PostMapping(value = "/save")
    public ReturnSanHuMess saveForm(@RequestBody SanHuBean sanHuBean, HttpServletRequest request) {

        return sanHuService.upLoadData(sanHuBean);
    }

}
