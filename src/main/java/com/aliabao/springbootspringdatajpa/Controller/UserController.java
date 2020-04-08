package com.aliabao.springbootspringdatajpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserModifyDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserQueryDto;
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
	public UserDto create(UserCreateDto createDto) {
		return userService.create(createDto);
	}
	
	@ApiOperation(value = "根据id查询用户" , notes = "根据id查询用户")
	@RequestMapping(value =  "/findById/{id}" , method = RequestMethod.GET)
	public UserDto findById(@PathVariable Integer id) {
		return userService.findById(id);
	}
	
	@ApiOperation(value = "分页查询用户" , notes = "分页查询用户")
	@RequestMapping(value =  "/findAll" , method = RequestMethod.GET)
	public List<UserDto> findById(UserQueryDto queryDto) {
		return userService.findAll(queryDto);
	}
	
	@ApiOperation(value = "修改用户信息" , notes = "修改用户信息")
	@RequestMapping(value =  "/modify" , method = RequestMethod.PUT)
	public UserDto modify(UserModifyDto modifyDto) {
		return userService.modify(modifyDto);
	}
	
	@ApiOperation(value = "删除用户信息" , notes = "删除用户信息")
	@RequestMapping(value =  "/delete/{id}" , method = RequestMethod.PUT)
	public void delete(@PathVariable Integer id) {
		userService.delete(id);
	}
}
