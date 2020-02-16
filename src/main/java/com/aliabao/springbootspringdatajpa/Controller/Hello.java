package com.aliabao.springbootspringdatajpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.respository.UserRespository;


@RestController
public class Hello {
	@Autowired
	private UserRespository jpa;
//热部署
    //1.添加以来
    //2.添加插件
    //3.setting文件配置comptier auto 勾选
    //4.ctrl + alt + a

    @RequestMapping("/test")
    public String test(){
		
	    List<User> list = jpa.findAll(); list.forEach(user->{
	    	System.out.println(user.getId()); 
		});
		
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
