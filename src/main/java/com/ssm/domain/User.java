package com.ssm.domain;

import java.io.Serializable;

/**
 * @Author xxc
 * @Date 2020/12/29 10:30
 * @Description TODO
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7105387849011597440L;
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
