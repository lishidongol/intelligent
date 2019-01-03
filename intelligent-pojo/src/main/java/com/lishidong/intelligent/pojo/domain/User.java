package com.lishidong.intelligent.pojo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "t_user")
public class User implements UserDetails {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 用户名，即登录使用的账号，使用唯一索引
     */

    @Column(name = "username",unique = true)
    private String username;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "sex", length = 1)
    private char sex;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 11)
    private String phone;

    /**
     * 构造函数
     */

    public User() {

    }

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this(username, password, authorities, true, true);
    }

    public User(String username, String password, Collection<? extends GrantedAuthority> authorities, boolean accountNonLocked, boolean enabled) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.accountNonLocked = accountNonLocked;
        this.enabled = enabled;
    }

    /**
     * 与其它实体类的关系
     */

    @ManyToMany //user与role 属于多对多关系
    @JoinTable(name = "t_user_role",joinColumns = {
            @JoinColumn(name = "user_id",referencedColumnName = "user_id")},inverseJoinColumns = {
            @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    })
    private List<Role> roles = new ArrayList<>();

    /**
     * UserDetails 接口需要的属性
     */

    @JsonIgnore
    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    @JsonIgnore
    @Column(name = "accountNonLocked", length = 1)
    private boolean accountNonLocked;

    @JsonIgnore
    @Column(name = "enabled", length = 1)
    private boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }


    /**
     * getter 、setter 方法
     */

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", accountNonLocked=" + accountNonLocked +
                ", enabled=" + enabled +
                '}';
    }
}
