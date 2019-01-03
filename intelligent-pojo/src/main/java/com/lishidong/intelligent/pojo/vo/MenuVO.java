package com.lishidong.intelligent.pojo.vo;

/**
 * Created by IntelliJ IDEA.
 * User: lishidongol
 * Date: 2019-01-03
 * Time: 15:45
 * 简单的事情重复做，重复的事情坚持做，坚持的事情用心做
 **/

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单
 */
public class MenuVO {

    /**
     * 一级菜单名称（与视图的文件夹名称和路由路径对应）
     */
    private String name;

    /**
     * 一级菜单标题
     */
    private String title;

    /**
     * 一级菜单图标样式
     */
    private String icon;

    /**
     * 自定义一级菜单路由地址，默认按照 name 解析。一旦设置，将优先按照 jump 设定的路由跳转
     */
    private String jump;

    /**
     * 是否默认展开子菜单
     */
    private Boolean spread = false;

    /**
     * 二级菜单
     */
    private List<MenuVO> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    public Boolean getSpread() {
        return spread;
    }

    public void setSpread(Boolean spread) {
        this.spread = spread;
    }

    public List<MenuVO> getList() {
        return list;
    }

    public void setList(List<MenuVO> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MenuVO{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", jump='" + jump + '\'' +
                ", spread=" + spread +
                ", list=" + list +
                '}';
    }
}
