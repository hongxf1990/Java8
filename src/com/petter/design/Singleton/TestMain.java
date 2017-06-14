package com.petter.design.Singleton;

/**
 * @author hongxf
 * @since 2017-06-14 14:01
 */
public class TestMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.operator();
    }
}
