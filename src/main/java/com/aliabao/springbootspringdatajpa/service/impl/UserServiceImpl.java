package com.aliabao.springbootspringdatajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;
import com.aliabao.springbootspringdatajpa.respository.UserRespository;
import com.aliabao.springbootspringdatajpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRespository userRespository;
	@Override
	public User create(UserCreateDto createDto) {
		if(createDto == null) {
			return null;
		}
		User user = new User();
		user.setName(createDto.getName());
		return userRespository.save(user);
	}
}
