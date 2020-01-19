package org.zhoup.service.entity;

import javax.persistence.*;

@Table(name = "member_profile")
public class MemberProfile {
    @Id
    @Column(name = "member_id")
    private Long memberId;

    private String nickname;

    private String name;

    /**
     * 0：全部
            1：男
            2：女
     */
    private Byte gender;

    private Integer level;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "mobile_code")
    private String mobileCode;

    private String mobile;

    private String email;

    private String description;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer district;

    private String address;

    @Column(name = "register_time")
    private Long registerTime;

    private Integer point;

    /**
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0：全部
            1：男
            2：女
     *
     * @return gender - 0：全部
            1：男
            2：女
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置0：全部
            1：男
            2：女
     *
     * @param gender 0：全部
            1：男
            2：女
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return mobile_code
     */
    public String getMobileCode() {
        return mobileCode;
    }

    /**
     * @param mobileCode
     */
    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return country
     */
    public Integer getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(Integer country) {
        this.country = country;
    }

    /**
     * @return province
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public Integer getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * @return district
     */
    public Integer getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(Integer district) {
        this.district = district;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return register_time
     */
    public Long getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime
     */
    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * @return point
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * @param point
     */
    public void setPoint(Integer point) {
        this.point = point;
    }
}