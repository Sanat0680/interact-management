package com.interact.interactManagement.users;

public class UserPojo {
    private Integer id;
    private String userType;
    private String userTypeDesc;
    private String userRole;
    private String userRoleDesc;
    private Integer channelCategory;

    public String getUserTypeDesc() {
        return userTypeDesc;
    }

    public void setUserTypeDesc(String userTypeDesc) {
        this.userTypeDesc = userTypeDesc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRoleDesc() {
        return userRoleDesc;
    }

    public void setUserRoleDesc(String userRoleDesc) {
        this.userRoleDesc = userRoleDesc;
    }

    public Integer getChannelCategory() {
        return channelCategory;
    }

    public void setChannelCategory(Integer channelCategory) {
        this.channelCategory = channelCategory;
    }

    @Override
    public String toString() {
        return "userPojo{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                ", userTypeDesc='" + userTypeDesc + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userRoleDesc='" + userRoleDesc + '\'' +
                ", channelCategory=" + channelCategory +
                '}';
    }
}
