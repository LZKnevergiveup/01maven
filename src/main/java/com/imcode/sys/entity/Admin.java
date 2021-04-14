package com.imcode.sys.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuzhengkai
 * @since 2020-02-17
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String salt;

    private Integer rid;

    private Integer structs;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
    public Integer getStructs() {
        return structs;
    }

    public void setStructs(Integer structs) {
        this.structs = structs;
    }

    @Override
    public String toString() {
        return "Admin{" +
            "username=" + username +
            ", password=" + password +
            ", salt=" + salt +
            ", rid=" + rid +
            ", structs=" + structs +
        "}";
    }
}
