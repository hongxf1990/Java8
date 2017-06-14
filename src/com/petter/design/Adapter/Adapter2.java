package com.petter.design.Adapter;

/**
 * 此为类适配器模式
 * @author hongxf
 * @since 2017-06-14 14:48
 */
public class Adapter2 extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
