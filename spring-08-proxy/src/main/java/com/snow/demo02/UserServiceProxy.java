package com.snow.demo02;

/**
 * @author Snow
 * @create 2021-03-12 13:16
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        printLog("add");
        userService.add();
    }

    @Override
    public void delete() {
        printLog("delete");
        userService.delete();

    }

    @Override
    public void update() {
        printLog("update");
        userService.update();
    }

    @Override
    public void search() {
        printLog("search");
        userService.search();
    }

    public void printLog(String msg){
        System.out.println("使用了"+msg+"方法！");
    }
}
