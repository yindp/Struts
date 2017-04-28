package com.yinom.pdd.struts.service;

import com.yinom.pdd.struts.model.Department;

/**
 * Created by yindp on 4/28/17.
 */
public class DepartmentService {
    public Department load() {
        Department dept = new Department();
        dept.setId("1234");
        dept.setName("Research");
        return dept;
    }
}
