package com.aliabao.springbootspringdatajpa.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
//热部署
    //1.添加以来
    //2.添加插件
    //3.setting文件配置comptier auto 勾选
    //4.ctrl + alt + a

    @RequestMapping("/test")
    public String test(){

        return "你是最帅的";
    }
    @RequestMapping("/test1")
    public String test1(){

        return "你是最帅的sdf";
    }

    @RequestMapping("/test2")
    public String test2(){

        return "你是最帅的sdf";
    }

    @RequestMapping("/test3")
    public String test3(){

        return "你是最帅的sdf";
    }

}
