package com.uditkumawat.lld.splitwise.models;

import java.util.Date;

public class ActivityLog {
    private String description;
    private String userId;
    private Date createdOn;
    private String expenseId;
    
    public ActivityLog(String description,String userId,String expenseId) {
        this.description = description;
        this.userId = userId;
        this.expenseId = expenseId;
        this.createdOn = new Date();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }
}
