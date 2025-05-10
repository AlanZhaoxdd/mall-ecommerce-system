package com.macro.mall.system.service;

import com.macro.mall.system.domain.AdminUserDetails;
import com.macro.mall.system.domain.UmsResource;

import java.util.List;

/**
 * @description 后台用户管理Service
 * @date 2020/5/10
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 获取所以权限列表
     */
    List<UmsResource> getResourceList();

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}