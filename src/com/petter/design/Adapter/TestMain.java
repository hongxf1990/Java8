package com.petter.design.Adapter;

/**
 * @author hongxf
 * @since 2017-06-14 14:33
 */
public class TestMain {
    public static void main(String[] args) {
        /*Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();*/
        /*Target target = new Adapter2();
        target.request();*/

        Target2 target2 = new AbstractAdapterImpl();
        target2.request();
    }
}
