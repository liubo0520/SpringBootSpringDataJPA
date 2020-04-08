package com.aliabao.springbootspringdatajpa.dto.user;

import lombok.Data;

@Data
public class UserCreateDto {
    private String name;
    
    private String realName;
    
    private String password;
    
    private UserRule userRule;
}
