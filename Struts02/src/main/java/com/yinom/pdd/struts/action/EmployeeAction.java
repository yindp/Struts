package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.model.Employee;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

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
        Employee emp1 = new Employee("121", "admin", "123", "administrator", 1000);
        Employee emp2 = new Employee("122", "coco", "123", "it", 10100);
        Employee emp3 = new Employee("123", "Eri", "123", "user", 10030);
        Department dept = new Department("1234", "Research");
        emp1.setDepartment(dept);
        emp2.setDepartment(dept);
        emp3.setDepartment(dept);
        List<Employee> emps = new ArrayList<Employee>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        ActionContext.getContext().put("emps", emps);
        return "show";
    }
}
