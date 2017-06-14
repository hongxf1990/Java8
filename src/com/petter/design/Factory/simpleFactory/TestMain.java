package com.petter.design.Factory.simpleFactory;

/**
 * @author hongxf
 * @since 2017-06-14 9:35
 */
public class TestMain {

    public static void main(String[] args) {
        Product product = Factory.createProduct("A");
        product.use();
        Product product2 = Factory.createProduct("B");
        product2.use();
    }
}
