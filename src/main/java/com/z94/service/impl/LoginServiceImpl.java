
package com.z94.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z94.dao.UserMapper;
import com.z94.entity.ModuleVO;
import com.z94.entity.User;
import com.z94.service.LoginService;

/**
 * FIXME 类注释信息(此标记由Eclipse自动生成,请填写注释信息删除此标记)
 *
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月18日 Z94
 */
@Service
public class LoginServiceImpl implements LoginService {
    
    /** FIXME */
    @Autowired
    private UserMapper userMapper;
    
    public List<User> findUsersByUser(User user) {
        return userMapper.findUsersByUser(user);
    }
    
    
}
