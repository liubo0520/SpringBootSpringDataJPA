package com.aliabao.springbootspringdatajpa.dto.user;

import lombok.Data;

@Data
public class UserQueryDto {
	private String name;

	private String realName;

	private String password;

	private UserRule userRule;
	
	private Integer page;
	
	private Integer size;
}
