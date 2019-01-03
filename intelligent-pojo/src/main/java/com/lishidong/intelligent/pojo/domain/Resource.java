package com.lishidong.intelligent.pojo.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统资源表，也叫权限表、菜单表
 */

@Entity
@Table(name = "t_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resource_id")
    private Long resourceId;

    /**
     * 父级ID
     */
    @Column(name = "father_id")
    private Long fatherId;

    /**
     * 资源名称或菜单名称
     */
    @Column(name = "resource_name")
    private String resourcename;

    /**
     * 权限标识
     */
    @Column(name = "permission")
    private String permission;

    /**
     * 资源url
     */
    @Column(name = "url")
    private String url;

    /**
     * 排序
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * 展示图标
     */
    @Column(name = "icon",length = 100)
    private String icon;

    /**
     * 资源类型 0菜单 1按钮
     */
    @Column(name = "type",length = 1)
    private char type;

    /**
     * 与其它实体类的关系
     */

    @ManyToMany(mappedBy = "resources")
    private List<Role> roles = new ArrayList<>();

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * getter 、setter 方法
     */

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", fatherId=" + fatherId +
                ", resourcename='" + resourcename + '\'' +
                ", permission='" + permission + '\'' +
                ", url='" + url + '\'' +
                ", orderNum=" + orderNum +
                ", icon='" + icon + '\'' +
                ", type=" + type +
                '}';
    }
}
