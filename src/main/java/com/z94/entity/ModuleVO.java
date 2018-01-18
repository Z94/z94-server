/******************************************************************************
 * Copyright (C) 2017 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.z94.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 模块配置项数据对象
 *
 */
public class ModuleVO implements Serializable {
    
    /** 序列化ID */
    private static final long serialVersionUID = 2288532038856361019L;
    
    /** 模块ID */
    private String moduleId;
    
    /** 模块单编码 */
    private String moduleCode;
    
    /** 模块名称 */
    private String moduleName;
    
    /** 父模块ID */
    private String parentModuleId;
    
    /** 节点类型：1、系统 (2、混合工程 3、后台工程 4、前端工程) (5、混合目录 6、后台目录 7、前端目录 ) (8、混合应用 9、后台应用 10、前端应用) */
    private int moduleType;
    
    /** 排序 */
    private int sortId;
    
    /** 状态：1为有效，2为无效 */
    private int state;
    
    /** 描述 */
    private String descr;
    
    /** 创建人ID */
    private String creatorId;
    
    /** 创建时间 */
    private Timestamp createTime;
    
    /** 修改人Id */
    private String operateUserId;
    
    /** 更新时间 */
    private Timestamp updateTime;
    
    /** 包全路径 */
    private String fullPath;
    
    /** 服务ID */
    private String serviceId;
    
    /** 界面存放相对目录 */
    private String pageDirectory;
    
    /** 界面访问路径 */
    private String pageUrl;
    
    /** 远程应用请求URL */
    private String remoteAppRequestURL;
    
    /** 工程相对路径 */
    private String projectPath;
    
    /**
     * @return 获取 moduleId属性值
     */
    public String getModuleId() {
        return moduleId;
    }
    
    /**
     * @param moduleId 设置 moduleId 属性值为参数值 moduleId
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }
    
    /**
     * @return 获取 moduleCode属性值
     */
    public String getModuleCode() {
        return moduleCode;
    }
    
    /**
     * @param moduleCode 设置 moduleCode 属性值为参数值 moduleCode
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }
    
    /**
     * @return 获取 moduleName属性值
     */
    public String getModuleName() {
        return moduleName;
    }
    
    /**
     * @param moduleName 设置 moduleName 属性值为参数值 moduleName
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    /**
     * @return 获取 parentModuleId属性值
     */
    public String getParentModuleId() {
        return parentModuleId;
    }
    
    /**
     * @param parentModuleId 设置 parentModuleId 属性值为参数值 parentModuleId
     */
    public void setParentModuleId(String parentModuleId) {
        this.parentModuleId = parentModuleId;
    }
    
    /**
     * @return 获取 moduleType属性值
     */
    public int getModuleType() {
        return moduleType;
    }
    
    /**
     * @param moduleType 设置 moduleType 属性值为参数值 moduleType
     */
    public void setModuleType(int moduleType) {
        this.moduleType = moduleType;
    }
    
    /**
     * @return 获取 sortId属性值
     */
    public int getSortId() {
        return sortId;
    }
    
    /**
     * @param sortId 设置 sortId 属性值为参数值 sortId
     */
    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
    
    /**
     * @return 获取 state属性值
     */
    public int getState() {
        return state;
    }
    
    /**
     * @param state 设置 state 属性值为参数值 state
     */
    public void setState(int state) {
        this.state = state;
    }
    
    /**
     * @return 获取 creatorId属性值
     */
    public String getCreatorId() {
        return creatorId;
    }
    
    /**
     * @param creatorId 设置 creatorId 属性值为参数值 creatorId
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }
    
    /**
     * @return 获取 createTime属性值
     */
    public Timestamp getCreateTime() {
        return createTime;
    }
    
    /**
     * @param createTime 设置 createTime 属性值为参数值 createTime
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
    
    /**
     * @return 获取 operateUserId属性值
     */
    public String getOperateUserId() {
        return operateUserId;
    }
    
    /**
     * @param operateUserId 设置 operateUserId 属性值为参数值 operateUserId
     */
    public void setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
    }
    
    /**
     * @return 获取 updateTime属性值
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }
    
    /**
     * @param updateTime 设置 updateTime 属性值为参数值 updateTime
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
    
    /**
     * 此处代码为更改前端应用的页面存放目录（pageDirectory）时，同步更改其包路径（fullPath）
     * 
     * @return 获取 fullPath属性值
     */
    public String getFullPath() {
        if (moduleType == 10 && pageDirectory != null) {
            String path = pageDirectory.replace("/", ".").replace("\\", ".");
            if (path.startsWith(".")) {
                return "com.comtop" + path;
            }
            return "com.comtop." + path;
        }
        return fullPath;
    }
    
    /**
     * @param fullPath 设置 fullPath 属性值为参数值 fullPath
     */
    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
    
    /**
     * @return 获取 serviceId属性值
     */
    public String getServiceId() {
        return serviceId;
    }
    
    /**
     * @param serviceId 设置 serviceId 属性值为参数值 serviceId
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    
    /**
     * 此处代码为更改混合应用和后台应用的包路径（fullPath）时，同步更改其页面存放目录（pageDirectory）
     * 
     * @return 获取 pageDirectory属性值
     */
    public String getPageDirectory() {
        if (moduleType == 8 || moduleType == 9 && fullPath != null) {
            String directory = fullPath.substring("com.comtop.".length());
            directory = directory.replace(".", "/");
            return directory;
        }
        return pageDirectory;
    }
    
    /**
     * @param pageDirectory 设置 pageDirectory 属性值为参数值 pageDirectory
     */
    public void setPageDirectory(String pageDirectory) {
        this.pageDirectory = pageDirectory;
    }
    
    /**
     * @return 获取 pageUrl属性值
     */
    public String getPageUrl() {
        return pageUrl;
    }
    
    /**
     * @param pageUrl 设置 pageUrl 属性值为参数值 pageUrl
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
    
    /**
     * @return 获取 projectPath属性值 -工程相对路径
     */
    public String getProjectPath() {
        return projectPath;
    }
    
    /**
     * @param projectPath 设置 projectPath 属性值为参数值 projectPath -工程相对路径
     */
    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }
    
    /**
     * @return 获取 remoteAppRequestURL属性值
     */
    public String getRemoteAppRequestURL() {
        return remoteAppRequestURL;
    }
    
    /**
     * @param remoteAppRequestURL 设置 remoteAppRequestURL 属性值为参数值 remoteAppRequestURL
     */
    public void setRemoteAppRequestURL(String remoteAppRequestURL) {
        this.remoteAppRequestURL = remoteAppRequestURL;
    }
    
    /**
     * @return 获取 description属性值
     */
    public String getDescr() {
        return descr;
    }
    
    /**
     * @param descr descr
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }
}
