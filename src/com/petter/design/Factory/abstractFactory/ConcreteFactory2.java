package com.petter.design.Factory.abstractFactory;

/**
 * @author hongxf
 * @since 2017-06-14 10:39
 */
public class ConcreteFactory2 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
