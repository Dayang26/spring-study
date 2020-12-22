package com.snow.demo05;

import com.snow.demo02.UserService;
import com.snow.demo02.UserServiceImpl;

/**
 * @author Snow
 * @create 2020-12-22 16:11
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色。不存在
        ProxyIh proxyIh = new ProxyIh();

        //需要代理的对象填入
        proxyIh.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService) proxyIh.getProxy();

        proxy.add();
    }
}
