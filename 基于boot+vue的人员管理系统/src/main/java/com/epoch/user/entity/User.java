package com.epoch.user.entity;

/**
 * @return 
 * @author dangsk
 * @date 2020/8/21 10:36
 * @decription
 * @modify
 */


public class User {
    /*用户主键*/
    private int userId;
    /*员工编号*/
    private String userCode;
    /*员工姓名*/
    private String userName;
    /*员工住址*/
    private String userAddress;
    /*员工电话*/
    private String userPhone;
    /*员工身份证号*/
    private String userIdcard;
    /*员工岗位*/
    private String userStation;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserStation() {
        return userStation;
    }

    public void setUserStation(String userStation) {
        this.userStation = userStation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userIdcard='" + userIdcard + '\'' +
                ", userStation='" + userStation + '\'' +
                '}';
    }
}
