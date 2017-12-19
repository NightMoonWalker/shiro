package com.wuhao.shiro.entity;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 伍豪
 * @version 1.0.0
 * @FileName:
 * @Company: 成都积微物联电子商务有限公司
 * @Date 2017/12/18
 * @remark:
 */
@Data
public class Role {
    private Integer rid;
    private String rname;
    private Set<User> users = new HashSet<>();
    private Set<Module> modules = new HashSet<>();
}
