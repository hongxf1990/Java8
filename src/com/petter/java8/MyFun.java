package com.petter.java8;

/**
 * @author hongxf
 * @since 2017-06-13 11:08
 */
public interface MyFun {
    default String getName() {
        return "aaa";
    }

    static void show() {
        System.out.println("接口中的静态方法");
    }
}
