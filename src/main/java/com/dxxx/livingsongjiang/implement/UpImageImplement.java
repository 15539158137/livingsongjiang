package com.dxxx.livingsongjiang.implement;

import com.dxxx.livingsongjiang.model.ReturnUpImageMess;
import com.dxxx.livingsongjiang.service.UpImageService;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

@Repository("UpImageService")
public class UpImageImplement implements UpImageService {
    @Override
    public ReturnUpImageMess saveImage(HttpServletRequest request) {
        ReturnUpImageMess returnUpImageMess = new ReturnUpImageMess();
        int status = 0;
        String mess = "";
        String imagePath = "";

        MultipartHttpServletRequest params = ((MultipartHttpServletRequest) request);
        //表示获取参数名字为image1的文件
        List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                .getFiles("image1");

        //如果有参数的话
//        String name = params.getParameter("name");
//        System.out.println("name:" + name);
//        String id = params.getParameter("id");
//        System.out.println("id:" + id);
        System.out.println("文件的个数:" + files.size());
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        if (files.size() == 0) {
            status = 0;
            mess = "未传入文件，请重试";
        } else {
            //只是单文件上传
            file = files.get(0);
            if (!file.isEmpty()) {
                try {
                    System.out.print("图片名字" + file.getOriginalFilename());
                    byte[] bytes = file.getBytes();
                    String fileName = "";
                    UUID uuid = UUID.randomUUID();
                    String savePath = request.getSession().getServletContext().getRealPath("upload/");
                    fileName = uuid.toString() + ".png";
                    stream = new BufferedOutputStream(new FileOutputStream(
                            new File(savePath + fileName)));
                    stream.write(bytes);
                    stream.close();
                    status = 1;
                    mess = "上传成功";
                    imagePath = "upload/" + fileName;
                } catch (Exception e) {
                    stream = null;
                    status = 0;
                    mess = "" + e.getMessage();
                }
            } else {
                status = 0;
                mess = "未传入文件，请重试";
            }
        }
        returnUpImageMess.setMsg(mess);
        returnUpImageMess.setStatu(status);
        returnUpImageMess.setData(imagePath);
        return returnUpImageMess;
    }
}
