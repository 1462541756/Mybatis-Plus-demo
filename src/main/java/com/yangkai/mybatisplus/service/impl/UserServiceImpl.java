package com.yangkai.mybatisplus.service.impl;

import com.yangkai.mybatisplus.entity.User;
import com.yangkai.mybatisplus.mapper.UserMapper;
import com.yangkai.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
