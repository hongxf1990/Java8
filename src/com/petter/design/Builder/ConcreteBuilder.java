package com.petter.design.Builder;

/**
 * @author hongxf
 * @since 2017-06-14 11:07
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.setPartA("建造A部分");
    }

    @Override
    public void builderPartB() {
        product.setPartB("建造B部分");
    }

    @Override
    public Product getProduct() {
        return product;
    }

}
