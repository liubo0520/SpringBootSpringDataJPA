package com.aliabao.springbootspringdatajpa.service.impl;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Service;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import com.aliabao.springbootspringdatajpa.dto.user.UserCreateDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserModifyDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserQueryDto;
import com.aliabao.springbootspringdatajpa.dto.user.UserRule;
import com.aliabao.springbootspringdatajpa.respository.UserRespository;
import com.aliabao.springbootspringdatajpa.service.UserService;
import com.google.common.base.Predicate;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRespository userRespository;
	@Override
	public UserDto create(UserCreateDto createDto) {
		if(createDto == null) {
			return null;
		}
		User user = new User();
		user.setName(createDto.getName());
		user.setRealName(createDto.getRealName());
		user.setPassword(createDto.getPassword());
		user.setUserRule(createDto.getUserRule());
		User uu = userRespository.save(user);
		return convert(uu);
	}
	
	@Override
	public UserDto findById(Integer id) {
		User user = userRespository.findById(id).orElse(null);
		if(user == null) {
			return null;
		}else {
			return convert(user);
		}
	}
	
	@Override
	public List<UserDto> findAll(UserQueryDto queryDto) {
		List<UserDto> userDtos = new ArrayList<UserDto>();
		Integer page = queryDto.getPage();
		Integer size = queryDto.getSize();
		if(page == null || size == null) {
			page = 0;
			size = 10;
		}
 		Page<User>  list = userRespository.findAll(new PageRequest(page, size));
 		for (User user : list) {
			UserDto userDto = new UserDto();
			userDto.setId(user.getId());
			userDto.setName(user.getName());
			userDto.setPassword(user.getPassword());
			userDto.setRealName(user.getRealName());
			userDto.setUserRule(user.getUserRule());
			userDtos.add(userDto);
		}
		return userDtos;
	}
	
	@Override
	public UserDto modify(UserModifyDto modifyDto) {
		Integer id = modifyDto.getId();
		if(id==null) {
			return null;
		}
		User user = new User();	
		user.setId(id);
		String name = modifyDto.getName();
		if(user != null) {
			user.setName(name);
		}
		String password = modifyDto.getPassword();
		if(password != null) {
			user.setPassword(password);
		}
		String realName = modifyDto.getRealName();
		if(realName != null) {
			user.setRealName(realName);
		}
		UserRule rule = modifyDto.getUserRule();
		if(rule != null) {
			user.setUserRule(rule);
		}
		User uu = userRespository.save(user);
		UserDto userDto = convert(uu);
		return userDto;
	}
	
	@Override
	public void delete(Integer id) {
		userRespository.deleteById(id);
	}
	
	/**
	 * User转UserDto
	 */
	private UserDto convert(User user) {
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(user, userDto);
		return userDto;
	}
	
	private Predicate<User> expressionConvert(UserQueryDto queryDto){
		return null;	
	}
}
