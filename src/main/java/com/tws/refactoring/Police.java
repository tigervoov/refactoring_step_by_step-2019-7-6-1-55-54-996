package com.tws.refactoring;

public class Police {
    private final int adultAge=18;
    public boolean checkDriver(Driver driver) {
        //driver通过getAge方法去访问私有Driver的私有变量age
        if(driver.getAge() >= adultAge) return true;
        else return false;
    }
}
