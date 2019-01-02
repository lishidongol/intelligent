package com.lishidong.intelligent.dao.repository;

import com.lishidong.intelligent.pojo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRespository extends JpaRepository<Role,Long> {

    /**
     * 根据角色名查询角色
     * @param rolename
     * @return
     */
    Role findByRolename(String rolename);
}
