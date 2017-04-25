package com.yinom.pdd.struts.action;

/**
 * Created by yindp on 4/25/17.
 */
public class EmployeeAction {
    /**
     * default method.
     *
     * @return
     */
    public String execute() {
        System.out.println("Hello World!");
        return "success";
    }

    public String empInput() {
        System.out.println("This is empInput method");
        return "success";
    }

    public String empList() {
        System.out.println("This is empList method");
        return "success";
    }

    public String list() {
        System.out.println("This is a method based on wildcard");
        return "list";
    }
}
