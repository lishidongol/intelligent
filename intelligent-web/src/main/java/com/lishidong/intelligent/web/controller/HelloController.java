package com.lishidong.intelligent.web.controller;

import com.lishidong.intelligent.pojo.domain.Role;
import com.lishidong.intelligent.pojo.domain.User;
import com.lishidong.intelligent.pojo.vo.JSONResult;
import com.lishidong.intelligent.service.RoleService;
import com.lishidong.intelligent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @RequestMapping
    public String hello() {
        return "132534534";
    }

    @RequestMapping("getRole")
    public String getRole(){
        roleService.loadRoleByRolename("ROLE_USER");
        return "ok";
    }

    @RequestMapping("saveRole")
    public String saveRole(){
        Role role = new Role();
        role.setLevel(3);
        role.setRemark("开发人员");
        role.setRolename("DEVELOPER");
        roleService.saveRole(role);
        return role.toString();
    }

    @RequestMapping("saveUser")
    public String saveUser(){
        Role role = roleService.loadRoleByRolename("ROLE_USER");
        for(int i=0;i<1000;i = i+10){
            User user = new User();
            user.setUsername("user"+i);
            user.setSex('m');
            user.setEmail(""+i+i+i+"@163.com");
            user.setPhone("131"+i);
            user.setPassword(bCryptPasswordEncoder.encode(""+i));
            user.setEnabled(true);
            user.setAccountNonLocked(true);
            user.getRoles().add(role);
            userService.saveUser(user);
        }
        return "ok";
    }


}
