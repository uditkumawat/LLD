package com.uditkumawat.lld.splitwise.models;

import java.util.UUID;

public class User {

    private String userId;
    private String userName;
    private String email;
    private String contactNumber;
    private String imageUrl;
    
    public User(String userName,String email,String contactNumber) {
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.email = email;
        this.contactNumber = contactNumber;
    }
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", contactNumber=" + contactNumber + ", imageUrl=" + imageUrl + "]";
    }
}
