package com.petter.design.Factory.abstractFactory;

/**
 * @author hongxf
 * @since 2017-06-14 9:35
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.use();
        productB.eat();
    }
}
