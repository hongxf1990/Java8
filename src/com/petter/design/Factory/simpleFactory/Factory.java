package com.petter.design.Factory.simpleFactory;

/**
 * @author hongxf
 * @since 2017-06-14 9:33
 */
public class Factory {

    public static Product createProduct(String proname) {
        if ("A".equals(proname)) {
            return new ConcreteProductA();
        } else if ("B".equals(proname)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
