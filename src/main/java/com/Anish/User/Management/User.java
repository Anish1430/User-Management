package com.Anish.User.Management;

public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private String number;

    public User(Integer userId, String name, String userName, String address, String number) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.number = number;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
