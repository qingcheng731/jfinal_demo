package com.demo.User;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * @author wangzhoucheng
 * @create 2017-06-03-19:44
 */

public class DemoInterceptor implements Interceptor{

    @Override
    public void intercept(Invocation inv) {
        System.out.println("before method()");
        inv.invoke();
        inv.getController();
        System.out.println("after method()");
    }
}
