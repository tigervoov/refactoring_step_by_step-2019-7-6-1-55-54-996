package com.tws.refactoring;

public class Driver {
    //public int age;
    private int age;//设置权限为private
    public Driver(int age) {

        this.age = age;
    }
    //给外界访问age的getAge方法

    public int getAge() {
        return age;
    }
}
