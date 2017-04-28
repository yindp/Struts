package com.yinom.pdd.struts.action;

import com.opensymphony.xwork2.ModelDriven;
import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.service.DepartmentService;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by yindp on 4/28/17.
 */
public class DepartmentAction implements ModelDriven {
    private Department dept;

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String add() {
        return "add";
    }

    public String doAdd() {
        return "doAdd";
    }

    public String update() throws InvocationTargetException, IllegalAccessException {
        DepartmentService ds = new DepartmentService();
        Department dm = ds.load();
       /* dept.setId(dm.getId());
        dept.setName(dm.getName());*/
        BeanUtils.copyProperties(dept,dm);
        return "update";
    }
    public Object getModel() {
        if (dept == null) {
            dept = new Department();
        }
        return dept;
    }
}
