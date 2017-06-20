package com.petter.design.Proxy;

/**
 * @author hongxf
 * @since 2017-06-20 11:25
 */
public class TestMain {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
