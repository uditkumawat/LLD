package com.uditkumawat.lld.splitwise.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Group {

    private String groupId;
    private String groupName;
    private List<User> users;
    private String groupDescription;
    private Date createdOn;
    private Date modifiedOn;
    private String createdByUserId;
    private String groupAdmin;
    
    public Group(String groupName,String groupDescription,String createdByUserId) {
        this.groupId = UUID.randomUUID().toString();
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.createdByUserId = createdByUserId;
        this.groupAdmin = createdByUserId;
        this.createdOn = new Date();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getCreatedByUserId() {
        return createdByUserId;
    }

    public void setCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
    }

    public String getGroupAdmin() {
        return groupAdmin;
    }

    public void setGroupAdmin(String groupAdmin) {
        this.groupAdmin = groupAdmin;
    }
    
   
}
