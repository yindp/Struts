package com.yinom.pdd.struts.model;

/**
 * Created by yindp on 4/25/17.
 */
public class Employee {
    private String id;
    private String userName;
    private String password;
    private String nickName;
    private double salary;

    public Employee() {

    }

    public Employee(String id, String userName, String password, String nickName, double salary) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
