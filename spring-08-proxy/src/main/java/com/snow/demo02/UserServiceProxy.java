package com.snow.demo02;

/**
 * @author Snow
 * @create 2020-12-21 16:31
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;


    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void search() {
        log("search");
        userService.search();
    }
    
    public void log(String msg){
        System.out.println("User "+msg+" method.");
    }
    
}
