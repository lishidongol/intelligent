package com.lishidong.intelligent.service.impl;

import com.lishidong.intelligent.dao.repository.UserRepository;
import com.lishidong.intelligent.pojo.domain.User;
import com.lishidong.intelligent.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }


}
