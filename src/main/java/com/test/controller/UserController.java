package com.test.controller;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.test.mapper.UserMapper;
import com.test.model.User;
import com.test.service.IUserService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author llfdd
 * @since 2022-11-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    public List<User> add(User user){

        boolean f = userService.saveOrUpdate(user);
//        return f+"";
        List<User> users = userService.list();
//        List<User> users = userService.list();
        return users;

    }

}
