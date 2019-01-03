package com.lishidong.intelligent.web.controller;

import com.lishidong.intelligent.IntelligentApplication;
import com.lishidong.intelligent.dao.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = IntelligentApplication.class)
public class HelloControllerTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void hello() {
    }
}