package com.lishidong.intelligent.service;

import com.lishidong.intelligent.pojo.domain.Role;

public interface RoleService {

    /**
     * 根据角色名查询Role
     * @param rolename 角色名
     * @return
     */
    Role loadRoleByRolename(String rolename);

    /**
     * 保存角色
     * @param role
     */
    void saveRole(Role role);
}
