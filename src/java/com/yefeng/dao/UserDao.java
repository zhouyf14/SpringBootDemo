package com.yefeng.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yefeng.pojo.User;

/**
 * dao接口
 * @author Johnny.Chen
 *
 */
public interface UserDao extends JpaRepository<User, Integer>{

}
