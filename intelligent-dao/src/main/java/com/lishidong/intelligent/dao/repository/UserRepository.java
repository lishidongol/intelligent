package com.lishidong.intelligent.dao.repository;

import com.lishidong.intelligent.pojo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<User,Long>, QuerydslPredicateExecutor<User> {

    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return User实体
     */
    User findByUsername(String username);

}
