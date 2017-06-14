package com.petter.design.Builder;

/**
 * @author hongxf
 * @since 2017-06-14 11:28
 */
public class TestMain {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product.toString());

    }
}
