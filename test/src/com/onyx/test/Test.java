package com.onyx.test;

import com.onyx.api.UserServiceImpl;
import com.onyx.base.User;

public class Test {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.login();
        User user = new User(1, "Victor");
        service.save(user);
    }
}
