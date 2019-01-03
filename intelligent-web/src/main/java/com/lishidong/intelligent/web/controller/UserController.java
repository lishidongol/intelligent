package com.lishidong.intelligent.web.controller;

import com.lishidong.intelligent.pojo.domain.User;
import com.lishidong.intelligent.pojo.vo.JSONResult;
import com.lishidong.intelligent.pojo.vo.Result;
import com.lishidong.intelligent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: lishidongol
 * Date: 2019-01-03
 * Time: 19:24
 * 简单的事情重复做，重复的事情坚持做，坚持的事情用心做
 **/


/**
 * 用户管理控制器
 */
@RestController
@CrossOrigin
@RequestMapping("/user/")
public class UserController {

    /**
     * 注入用户服务
     */
    @Autowired
    UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result listUsers(Integer page,Integer limit){

        return JSONResult.success("");
    }
}
