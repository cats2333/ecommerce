package com.ecm.model;

public class User {
    private int id;
    private String userName;
    private String password;
    private int age;

    public User() {
        super();
    }

    public User(String userName, String password, int age) {
        super();
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


 }