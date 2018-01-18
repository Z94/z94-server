
package com.z94.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.z94.entity.ModuleVO;
import com.z94.entity.User;

/**
 * FIXME 类注释信息(此标记由Eclipse自动生成,请填写注释信息删除此标记)
 * 
 * @author Z94
 * @since jdk1.7
 * @version 2018年1月18日 Z94
 */
@Repository
public interface UserMapper {
    
    /**
     * find users by user
     * 
     * @param user user
     * @return users
     */
    List<User> findUsersByUser(User user);
    
    /**
     * find moduleVOs by moduleVO
     * 
     * @param moduleVO moduleVO
     * @return moduleVOs
     */
    List<ModuleVO> findModulesByModule(ModuleVO moduleVO);
}
