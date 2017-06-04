package com.demo.User;

import com.demo.common.model.base.User;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

/**
 * @author wangzhoucheng
 * @create 2017-06-03-19:32
 */

@Before(DemoInterceptor.class)
public class UserController extends Controller{

    public static void main(String[] args) {

        User user = User.dao.findById(1);
    }
}
