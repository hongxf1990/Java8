package com.petter.design.Factory.factoryMethod;

/**
 * @author hongxf
 * @since 2017-06-14 9:54
 */
public class ConcreteFactoryB implements Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
