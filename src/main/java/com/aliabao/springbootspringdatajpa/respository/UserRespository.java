package com.aliabao.springbootspringdatajpa.respository;

import com.aliabao.springbootspringdatajpa.Pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

//JpaRepository提供的简单数据操作接口
//JpaSpecificationExecutor(SpringDataJPA提供的复杂查询接口)
//SpringDataJPA内部使用了类代理的方式让继承了他的接口都以spring管理的Bean的形式存在
public interface UserRespository extends JpaRepository<User,Long>,JpaSpecificationExecutor<User>,Serializable {

}
