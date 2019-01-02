package com.lishidong.intelligent.pojo.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 系统资源表，也叫权限表、菜单表
 */

@Entity
@Table(name = "t_resource")
public class Resource {

    private Long resourceId;

    private Long fatherId;

    private String resourcename;

    private String permission;

    private String url;


}
