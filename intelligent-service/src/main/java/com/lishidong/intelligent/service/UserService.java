package com.lishidong.intelligent.service;

import com.lishidong.intelligent.pojo.domain.User;

public interface UserService {

    /**
     * 根据用户名查询User
     * @param username 用户名
     * @return
     */
    User loadUserByUsername(String username);

    void saveUser(User user);
}
