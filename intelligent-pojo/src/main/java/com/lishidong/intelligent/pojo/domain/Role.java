package com.lishidong.intelligent.pojo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
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
     * 角色信息修改时间
     */
    @Column(name = "modify_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyTime;

    /**
     * 角色创建时间
     */
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;


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

    @ManyToMany
    @JoinTable(name = "t_role_resource",joinColumns = {
            @JoinColumn(name = "role_id",referencedColumnName = "role_id")},inverseJoinColumns = {
            @JoinColumn(name = "resource_id",referencedColumnName = "resource_id")
    })
    private List<Resource> resources = new ArrayList<>();

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
                ", modifyTime=" + modifyTime +
                '}';
    }
}
