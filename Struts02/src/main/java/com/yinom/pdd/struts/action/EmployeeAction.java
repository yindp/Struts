package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ActionContext;

/**
 * Created by yindp on 4/25/17.
 */
public class EmployeeAction {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     *
     * @return
     */
    public String list() {
        //parameter transfer by getter and setter
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        //parameter transfer by ActionContext
        ActionContext.getContext().put("name", "Sara");
        return "list";
    }
}
