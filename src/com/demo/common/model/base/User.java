package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;

/**
 * @author wangzhoucheng
 * @create 2017-06-03-20:08
 */

public class User extends Model<User> {
    public static final User dao = new User().dao();
}
