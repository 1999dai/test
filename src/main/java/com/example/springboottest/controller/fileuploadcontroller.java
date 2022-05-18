package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class fileuploadcontroller {

    private static final String UPLOADED_FOLDER = System.getProperty("user.dir")+"/upload/";
    //通过System.getProperty("user.dir")可以动态的知道数据存储目录，这样更方便，因为没有运行前不知道会存放在哪里，但是有可能数据量太大，所以我们
    //把它存放在upload目录下。


    @PostMapping("/upload")
    public String upfile(String nickname, MultipartFile photo)throws IOException{
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        File file=new File("D:/图片/"+photo.getOriginalFilename());
        photo.transferTo(file);
        return "上传成功";
    }

}
