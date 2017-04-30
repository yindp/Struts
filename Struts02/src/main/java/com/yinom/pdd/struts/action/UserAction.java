package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yindp on 4/30/17.
 */
public class UserAction extends ActionSupport implements ModelDriven {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getModel() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public String add() {
        Department department1 = new Department("1", "Office");
        Department department2 = new Department("2", "Research");
        Department department3 = new Department("3", "Sales");
        List<Department> departments = new ArrayList<Department>();
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        ActionContext.getContext().put("departments", departments);


        return "add";
    }

    public String update() {
        ActionContext.getContext().put("user", user);
        return "update";
    }
}
