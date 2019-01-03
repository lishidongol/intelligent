package com.lishidong.intelligent.service.impl;

import com.lishidong.intelligent.ApplicationTest;
import com.lishidong.intelligent.dao.repository.RoleRespository;
import com.lishidong.intelligent.dao.repository.UserRepository;
import com.lishidong.intelligent.pojo.domain.Resource;
import com.lishidong.intelligent.pojo.domain.Role;
import com.lishidong.intelligent.pojo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationTest.class)
public class UserServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRespository roleRespository;

    private static final BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();

    @Test
    public void loadUserByUsername() {
        System.out.println("yyyyy");
    }

    @Test
    public void saveUser() {
        Role role = roleRespository.findByRolename("ROLE_USER");
        for(int i=100;i<1000;i = i+100){
            User user = new User();
            user.setUsername("user"+i);
            user.setPassword(bcpe.encode(""+i));
            user.setPhone("189"+i+i);
            user.setEmail(""+i+i+"@163.com");
            user.setSex('M');
            user.getRoles().add(role);
            user.setAccountNonLocked(true);
            user.setEnabled(true);
            userRepository.save(user);
            System.out.println(user);
        }

    }

    @Test
    public void addRole(){
        Role role = new Role();
        role.setRolename("USER");
        role.setRemark("普通用户");
        role.setLevel(3);
        roleRespository.save(role);
    }

    @Test
    public void addResource(){

        Resource resource = new Resource();
        resource.setFatherId(0L);
        resource.setResourcename("");

    }
}