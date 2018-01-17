
package com.z94.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.z94.entity.User;

/**
 * This is a class.
 *
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月17日 Z94
 */
@RestController
@RequestMapping("/api")
public class LoginController {
    
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
        return true;
    }
}
