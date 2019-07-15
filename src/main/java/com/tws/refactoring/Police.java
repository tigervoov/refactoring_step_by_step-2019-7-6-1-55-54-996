package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
        //driver通过getAge方法去访问私有Driver的私有变量age
        if(driver.getAge() >= 18) return true;
        else return false;
    }
}
