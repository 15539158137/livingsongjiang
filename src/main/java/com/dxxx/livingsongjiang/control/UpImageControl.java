package com.dxxx.livingsongjiang.control;

import com.dxxx.livingsongjiang.model.ReturnUpImageMess;
import com.dxxx.livingsongjiang.service.UpImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@RestController
@RequestMapping(value = "/UpImageControl")
public class UpImageControl {
    @Autowired
    UpImageService upImageService;
    //传递文件，同时也可以传递参数
    @RequestMapping(value = "/upImage", method = RequestMethod.POST)
    @ResponseBody
    public ReturnUpImageMess handleFileUpload(HttpServletRequest request) {

        return upImageService.saveImage(request);
    }
}
