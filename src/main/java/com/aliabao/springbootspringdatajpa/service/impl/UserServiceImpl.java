package com.aliabao.springbootspringdatajpa.service.impl;

import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.respository.UserRespository;
import com.aliabao.springbootspringdatajpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRespository userRespository;
	@Override
	public User create(User user) {
		System.out.println(1+"*********************");
		if(user != null) {
			return userRespository.save(user);
		}
		return null;
	}
}
