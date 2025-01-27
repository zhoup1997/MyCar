package org.zhoup.service.dto;


/**
 * 这是登陆的DTO
 */
public class UserDTO {

    private String username;
    private String password;
    private String captcha;
    private boolean rememberMe;

    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", captcha='" + captcha + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }

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

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
