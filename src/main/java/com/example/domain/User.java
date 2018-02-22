package com.example.domain;

public class User {
    private Integer id;

    private String userName;

    private String userQq;

    private String userType;

    private String userWill;

    private String userSchool;

    private String userLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getUserWill() {
        return userWill;
    }

    public void setUserWill(String userWill) {
        this.userWill = userWill == null ? null : userWill.trim();
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public String getUserLink() {
        return userLink;
    }

    public void setUserLink(String userLink) {
        this.userLink = userLink == null ? null : userLink.trim();
    }
}