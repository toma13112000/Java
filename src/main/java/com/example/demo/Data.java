package com.example.demo;

import java.time.LocalDate;

public class Data {
    private Integer login;
    private String prevName;
    private String newName;
    private String prevPassword;
    private String newPassword;
    private LocalDate date;

    public Integer getLogin() {
        return login;
    }
    public void setLogin(Integer login) {
        this.login = login;
    }
    public String getPrevName() {
        return prevName;
    }
    public void setPrevName(String prevName) {
        this.prevName = prevName;
    }
    public String getNewName() {
        return newName;
    }
    public void setNewName(String newName) {
        this.newName = newName;
    }
    public String getPrevPassword() {
        return prevPassword;
    }
    public void setPrevPassword(String prevPassword) {
        this.prevPassword = prevPassword;
    }
    public String getNewPassword() {
        return newPassword;
    }
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
