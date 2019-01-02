package com.lishidong.intelligent.pojo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_role")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    /**
     * 角色名，以 "ROLE_" 开始
     */

    @Column(name = "rolename",length = 100,unique = true)
    private String rolename;

    /**
     * 角色备注，角色描述
     */

    @Column(name = "remark")
    private String remark;

    /**
     * 角色的等级(或优先级)，高等级的角色可以调整低等级的角色权限,
     */

    @Column(name = "level")
    private Integer level;


    /**
     * 与其它实体类的关系
     */

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * getter、setter方法
     */



    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        if(rolename.contains("ROLE_")){
            this.rolename = rolename;
        }else {
            this.rolename = "ROLE_"+rolename;
        }

    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", rolename='" + rolename + '\'' +
                ", remark='" + remark + '\'' +
                ", level=" + level +
                '}';
    }
}
