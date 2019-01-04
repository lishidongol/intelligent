package com.lishidong.intelligent.service.impl;

import com.lishidong.intelligent.dao.repository.UserRepository;
import com.lishidong.intelligent.pojo.domain.User;
import com.lishidong.intelligent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    /**
     * 保存或更新用户信息，
     * 当用户ID不为空时，做更新操作，当用户ID为空时，做插入操作
     * @param user
     */
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public List<User> listUsers(){

        Specification<User> specification = (Specification) (root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();
            

            return null;
        };
        userRepository.findAll(specification);
        return null;
    }

}
