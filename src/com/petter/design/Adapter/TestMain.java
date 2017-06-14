package com.petter.design.Adapter;

/**
 * @author hongxf
 * @since 2017-06-14 14:33
 */
public class TestMain {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
        /*Target target = new Adapter2();
        target.request();*/
    }
}
