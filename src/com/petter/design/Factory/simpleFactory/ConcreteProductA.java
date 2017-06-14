package com.petter.design.Factory.simpleFactory;

/**
 * @author hongxf
 * @since 2017-06-14 9:32
 */
public class ConcreteProductA implements Product {

    @Override
    public void use() {
        System.out.println("我正在使用产品A");
    }
}
