package com.aliabao.springbootspringdatajpa.service;

import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;

@Service
public interface UserService {

	User create(User user);

}
