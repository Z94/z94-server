
package com.z94.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.z94.entity.User;
import com.z94.service.LoginService;

/**
 * This is a class.
 *
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月17日 Z94
 */
@RestController
@MapperScan("com.z94.dao")
@RequestMapping("/api")
public class LoginController {
    
    /** FIXME */
    @Autowired
    LoginService loginService;
    
    /**
     * login method
     * 
     * @param user user
     *
     * @return "true"
     */
    @ApiOperation(value = "login")
    @PostMapping("/login")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "success", response = User.class) })
    protected boolean login(User user) {
        System.out.println(user.toString());
        List<User> lst = loginService.findUsersByUser(user);
        for (User moduleVO : lst) {
            System.out.println(moduleVO.getAccount());
        }
        return true;
    }
}
