package com.petter.java8;

/**
 * Created by zer on 2017/6/13.
 */
public class B {
    private static B ourInstance = new B();

    public static B getInstance() {
        return ourInstance;
    }

    private B() {
    }
}
