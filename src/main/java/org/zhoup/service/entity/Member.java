package org.zhoup.service.entity;

import javax.persistence.*;

public class Member {
    @Id
    private Long id;

    private String username;

    private String password;

    private Byte source;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return source
     */
    public Byte getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(Byte source) {
        this.source = source;
    }
}