package com.aliabao.springbootspringdatajpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserModifyDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserQueryDto;

@Service
public interface UserService {

	UserDto create(UserCreateDto createDto);

	UserDto findById(Integer id);

	List<UserDto> findAll(UserQueryDto queryDto);

	UserDto modify(UserModifyDto modifyDto);

	void delete(Integer id);

}
