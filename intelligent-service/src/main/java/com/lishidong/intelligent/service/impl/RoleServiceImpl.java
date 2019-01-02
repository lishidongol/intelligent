package com.lishidong.intelligent.service.impl;

import com.lishidong.intelligent.dao.repository.RoleRespository;
import com.lishidong.intelligent.pojo.domain.Role;
import com.lishidong.intelligent.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRespository roleRespository;

    @Override
    public Role loadRoleByRolename(String rolename) {
        return roleRespository.findByRolename(rolename);
    }

    @Override
    public void saveRole(Role role) {
        roleRespository.save(role);
    }
}
