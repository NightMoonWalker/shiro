package com.wuhao.shiro.mapper;

import com.wuhao.shiro.entity.User;

/**
 * @author 伍豪
 * @version 1.0.0
 * @FileName:
 * @Company: 成都积微物联电子商务有限公司
 * @Date 2017/12/18
 * @remark:
 */
public interface UserMapper {
    public User findByUserName(String username);
}
