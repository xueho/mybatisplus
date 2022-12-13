package com.test.service.impl;

import com.test.model.User;
import com.test.mapper.UserMapper;
import com.test.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author llfdd
 * @since 2022-11-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
