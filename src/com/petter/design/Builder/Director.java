package com.petter.design.Builder;

/**
 * @author hongxf
 * @since 2017-06-14 11:11
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.builderPartA();
        builder.builderPartB();
        return builder.getProduct();
    }
}
