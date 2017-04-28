package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ActionContext;
import com.yinom.pdd.struts.model.Employee;
import org.apache.struts2.ServletActionContext;

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

    public String test() {
        //1.parameter transfer by getter and setter
        this.setUsername("Moly");
        this.setPassword("Password1");
        /*System.out.println("username:" + username);
        System.out.println("password:" + password);*/
        Employee emp = new Employee();
        emp.setUserName("Coco");
        emp.setPassword("12389");

        ActionContext.getContext().getValueStack().push(emp);
        //2.parameter transfer by ActionContext
        ActionContext.getContext().put("name", "Sara");
        ActionContext.getContext().put("salary", 1000);
        //3.parameter transfer by Servlet API
        ServletActionContext.getContext().put("age1", 10);
        ServletActionContext.getRequest().setAttribute("age2", 20);
        return "test";
    }

    /**
     * @return
     */
    public String list() {
        //1.parameter transfer by getter and setter
        this.setUsername("Moly");
        this.setPassword("Password1");
        /*System.out.println("username:" + username);
        System.out.println("password:" + password);*/
        Employee emp = new Employee();
        emp.setUserName("Coco");
        emp.setPassword("12389");

        ActionContext.getContext().getValueStack().push(emp);
        //2.parameter transfer by ActionContext
        ActionContext.getContext().put("name", "Sara");
        ActionContext.getContext().put("salary", 1000);
        //3.parameter transfer by Servlet API
        ServletActionContext.getContext().put("age1", 10);
        ServletActionContext.getRequest().setAttribute("age2", 20);
        return "list";
    }


    public String show() {
        ActionContext.getContext().put("salary", 1000);
        return "show";
    }
}
