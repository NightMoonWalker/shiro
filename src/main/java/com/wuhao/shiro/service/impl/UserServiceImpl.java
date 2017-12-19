package com.wuhao.shiro.service.impl;

import com.wuhao.shiro.entity.User;
import com.wuhao.shiro.mapper.UserMapper;
import com.wuhao.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 伍豪
 * @version 1.0.0
 * @FileName:
 * @Company: 成都积微物联电子商务有限公司
 * @Date 2017/12/18
 * @remark:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUserName(String username) {
        return userMapper.findByUserName(username);
    }
}
