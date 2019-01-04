package com.lishidong.intelligent.service;

import com.lishidong.intelligent.pojo.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 根据用户名查询User
     * @param username 用户名
     * @return
     */
    User loadUserByUsername(String username);

    /**
     * 保存或更新用户信息，
     * 当用户ID不为空时，做更新操作，当用户ID为空时，做插入操作
     * @param user
     */
    void saveUser(User user);


    List<User> listUsers();
}
