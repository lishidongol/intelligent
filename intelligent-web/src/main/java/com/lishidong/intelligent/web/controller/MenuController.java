package com.lishidong.intelligent.web.controller;

import com.lishidong.intelligent.pojo.vo.JSONResult;
import com.lishidong.intelligent.pojo.vo.MenuVO;
import com.lishidong.intelligent.pojo.vo.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lishidongol
 * Date: 2019-01-03
 * Time: 15:55
 * 简单的事情重复做，重复的事情坚持做，坚持的事情用心做
 **/

@RestController
@RequestMapping("/menu/")
@CrossOrigin
public class MenuController {

    /**
     * 根据用户所具有的权限获取菜单
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result getMenu(){
        MenuVO menuVo = new MenuVO();
        menuVo.setIcon("layui-icon-home");
        menuVo.setTitle("用户");

        MenuVO menuVO1 = new MenuVO();
        menuVO1.setTitle("用户管理");
        menuVO1.setJump("/user/");
        menuVo.getList().add(menuVO1);

        MenuVO menuVO2 = new MenuVO();
        menuVO2.setTitle("角色管理");
        menuVO2.setJump("/role/");
        menuVo.getList().add(menuVO2);

        List<MenuVO> menuVOS = new ArrayList<>();
        menuVOS.add(menuVo);
        return JSONResult.success(menuVOS);
    }
}
