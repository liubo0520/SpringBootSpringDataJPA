package com.aliabao.springbootspringdatajpa.Pojo;

import javax.persistence.*;

import org.omg.CORBA.UserException;

import com.aliabao.springbootspringdatajpa.dto.user.UserRule;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    
    private String realName;
    
    private String password;
    
    private UserRule userRule;

}
