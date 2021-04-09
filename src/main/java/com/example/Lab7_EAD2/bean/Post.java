package com.example.Lab7_EAD2.bean;

public class Post extends IdEntity {
    private int pId;
    private String title;
    private String pContent;
    private String userName;

    public int getpId() {
        return pId;
    }
    public void setpId(int pId) {
        this.pId = pId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitles(String title) {
        this.title = title;
    }
    public String getpContent() {
        return pContent;
    }
    public void setpContent(String pContent) {
        this.pContent = pContent;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
