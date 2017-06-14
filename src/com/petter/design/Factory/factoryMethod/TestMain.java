package com.petter.design.Factory.factoryMethod;

/**
 * @author hongxf
 * @since 2017-06-14 9:35
 */
public class TestMain {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.factoryMethod();
        product.use();

        Factory factory2 = new ConcreteFactoryB();
        Product product2 = factory2.factoryMethod();
        product2.use();
    }
}
