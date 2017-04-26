package com.yinom.pdd.struts.test;

import com.yinom.pdd.struts.model.Department;
import com.yinom.pdd.struts.model.Employee;
import ognl.Ognl;
import ognl.OgnlException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> ctx = new HashMap<String, Object>();
        ctx.put("emp", emp);
        try {
            System.out.println(Ognl.getValue("id", emp));
            System.out.println(Ognl.getValue("nickName", emp));
            //current root is emp
            System.out.println(Ognl.getValue("nickname", ctx, emp));

            //use "#" to get value and that means get valve from ctx directly.
            System.out.println(Ognl.getValue("#emp.nickName", ctx, emp));

            System.out.println(Ognl.getValue("emp.nickname", ctx, ctx));
            /*//current root is ctx and ctx is null.
            System.out.println(Ognl.getValue("nickname", ctx, ctx));*/

            //OGNL is a super Context and the root key is "root". So we can get value from "#root"
            System.out.println(Ognl.getValue("#root.salary", ctx, emp));

        } catch (OgnlException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
