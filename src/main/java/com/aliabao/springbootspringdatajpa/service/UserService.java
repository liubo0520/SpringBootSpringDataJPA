package com.aliabao.springbootspringdatajpa.service;

import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;

@Service
public interface UserService {

	User create(UserCreateDto createDto);

}
