package com.dxxx.livingsongjiang.service;

import com.dxxx.livingsongjiang.model.ReturnUpImageMess;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface UpImageService {
    public ReturnUpImageMess saveImage(HttpServletRequest request);
}
