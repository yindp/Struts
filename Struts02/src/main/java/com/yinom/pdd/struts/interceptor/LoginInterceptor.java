package com.yinom.pdd.struts.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by yindp on 4/29/17.
 */
public class LoginInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //according to request link.
        String url = actionInvocation.getProxy().getActionName();
        Boolean isAdmin = (Boolean) ActionContext.getContext().getSession().get("isAdmin");
        String username = (String) ActionContext.getContext().getSession().get("username");
        if (url.startsWith("admin_")) {
            if (username == null || username.equals("")) {
                return "loginInput";
            }
            if (isAdmin==null||!isAdmin) {
                return "error";
            }
        } else if (url.startsWith("user_")) {
            if (username == null || username.equals("")) {
                return "loginInput";
            }
        }
        System.out.println(url);
        return actionInvocation.invoke();
    }
}
