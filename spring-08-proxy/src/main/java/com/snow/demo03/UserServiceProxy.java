package com.snow.demo03;

/**
 * @author Snow
 * @create 2020-12-21 19:20
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void sx() {
        userService.sx();
        syb();
    }

    public void syb(){
        System.out.println("syb");
    }
}
