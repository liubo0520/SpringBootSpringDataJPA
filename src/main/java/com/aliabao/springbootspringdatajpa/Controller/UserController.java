package com.aliabao.springbootspringdatajpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;
import com.aliabao.springbootspringdatajpa.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/User")
@Api("用户")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "新增用户" , notes = "新增用户")
	@RequestMapping(value =  "/create" , method = RequestMethod.POST)
	public User create(UserCreateDto createDto) {
		return userService.create(createDto);
	}
}
