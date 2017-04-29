package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ActionContext;

/**
 * Created by yindp on 4/29/17.
 */
public class LoginAction {
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

    public String login() {
        return "login";
    }

    public String doLogin() {
        if (username.equals("admin")) {
            ActionContext.getContext().getSession().put("isAdmin", true);
        }
        ActionContext.getContext().getSession().put("username", username);
        return "doLogin";
    }

    public String userShow() {
        return "success";
    }
    public String adminShow() {
        return "success";
    }
   /* public String logout() {
        ActionContext.getContext().getSession().clear();

        return "loginInput";
    }*/
    public String logout() {
        ActionContext.getContext().getSession().clear();
        ActionContext.getContext().put("url", "/WEB-INF/Login/login.jsp");
        return "redirect";
    }
}
