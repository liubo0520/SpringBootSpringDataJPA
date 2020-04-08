package com.aliabao.springbootspringdatajpa.dto.user;

import lombok.Data;

@Data
public class UserModifyDto {
	private Integer id;
	
	private String name;

	private String realName;

	private String password;

	private UserRule userRule;
}
