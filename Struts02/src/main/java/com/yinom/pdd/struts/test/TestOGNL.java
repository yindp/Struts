package com.yinom.pdd.struts.test;

import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.model.Employee;
import ognl.Ognl;
import ognl.OgnlException;
import org.junit.Test;

/**
 * Created by yindp on 4/26/17.
 */
public class TestOGNL {
    @Test
    public void test01() {
        Employee emp = new Employee("121", "admin", "123", "administrator", 1000);
        try {
            System.out.println(Ognl.getValue("id", emp));
            System.out.println(Ognl.getValue("nickName", emp));
        } catch (OgnlException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void test02() {
        Employee emp = new Employee("121", "admin", "123", "administrator", 1000);
        Department dept = new Department("1234", "Research");
        emp.setDepartment(dept);
        try {
            System.out.println(Ognl.getValue("id", emp));
            System.out.println(Ognl.getValue("nickName", emp));
            System.out.println(Ognl.getValue("department.name", emp));
        } catch (OgnlException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
