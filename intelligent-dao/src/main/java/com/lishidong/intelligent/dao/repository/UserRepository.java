package com.lishidong.intelligent.dao.repository;

import com.lishidong.intelligent.pojo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return User实体
     */
    User findByUsername(String username);
}
