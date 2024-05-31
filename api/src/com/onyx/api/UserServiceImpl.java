package com.onyx.api;

import com.onyx.base.User;
import com.onyx.service.UserService;
import com.onyx.util.MyStringUtil;

public class UserServiceImpl implements UserService {
    @Override
    public void save(com.onyx.base.User user) {
        MyStringUtil.size("123");
        System.out.println(user);
    }

    @Override
    public void login() {
        System.out.println("UserServiceImpl login method");
    }
}
